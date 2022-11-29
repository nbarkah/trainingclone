/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.constants.WebConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.cms2.model.pages.ContentPageModel;

import de.hybris.platform.util.Config;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.training.facades.book.BookFacade;
import org.training.facades.student.StudentFacade;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


/**
 * Controller for home page
 */
@Controller
@RequestMapping("/")
public class HomePageController extends AbstractPageController
{
	private static final String LOGOUT = "logout";
	private static final String ACCOUNT_CONFIRMATION_SIGNOUT_TITLE = "account.confirmation.signout.title";
	private static final String ACCOUNT_CONFIRMATION_CLOSE_TITLE = "account.confirmation.close.title";

	@Resource(name = "defaultBookFacade")
	private BookFacade bookFacade;

	@Resource(name = "defaultStudentFacade")
	private StudentFacade studentFacade;

	@RequestMapping(method = RequestMethod.GET)
	public String home (HttpServletRequest request, @RequestParam(value = WebConstants.CLOSE_ACCOUNT, defaultValue = "false") final boolean closeAcc,
			@RequestParam(value = LOGOUT, defaultValue = "false") final boolean logout, final Model model,
			final RedirectAttributes redirectModel) throws CMSItemNotFoundException
	{
		if (logout)
		{
			String message = ACCOUNT_CONFIRMATION_SIGNOUT_TITLE;
			if (closeAcc)
			{
				message = ACCOUNT_CONFIRMATION_CLOSE_TITLE;
			}
			GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.INFO_MESSAGES_HOLDER, message);
			return REDIRECT_PREFIX + ROOT;
		}
		final ContentPageModel contentPage = getContentPageForLabelOrId(null);
		storeCmsPageInModel(model, contentPage);
		setUpMetaDataForContentPage(model, contentPage);
		updatePageTitle(model, contentPage);

		model.addAttribute("studentList", studentFacade.getAllStudent());
		model.addAttribute("bookList", bookFacade.getAllBook());
		model.addAttribute("resizerBookImg", getImageResizerString(getDeviceType(request), "bookImage"));

		return getViewForPage(model);
	}

	private static  String getDeviceType(final HttpServletRequest request) {
		String userAgent = request.getHeader("User-Agent");
		if (userAgent.contains("mobile")) {
			return "mobile";
		} else if (!userAgent.contains("mobile") && userAgent.contains("ipad") || userAgent.contains("android") || userAgent.contains("tablet")) {
			return "tablet";
		}
		return "desktop";
	}

	private static String getImageResizerString(final String deviceType, String imageType) {
		if (Config.getBoolean("image.resizer.enable", false)) {
			String imageUrl = Config.getString("image.resizer.url", StringUtils.EMPTY);
			String imageUrlPostfix = Config.getString("image.resizer.postfix", StringUtils.EMPTY);
			return imageUrl + Config.getString("image.resizer." + deviceType + "." + imageType, "1234") + imageUrlPostfix;
		} else {
			return StringUtils.EMPTY;
		}
	}

	protected void updatePageTitle(final Model model, final AbstractPageModel cmsPage)
	{
		storeContentPageTitleInModel(model, getPageTitleResolver().resolveHomePageTitle(cmsPage.getTitle()));
	}
}
