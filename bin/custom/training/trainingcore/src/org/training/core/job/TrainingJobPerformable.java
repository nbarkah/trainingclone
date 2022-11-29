package org.training.core.job;

import de.hybris.platform.commerceservices.setup.SetupSyncJobService;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TrainingJobPerformable extends AbstractJobPerformable<CronJobModel> {

    @Resource
    private SetupSyncJobService setupSyncJobService;
    private static final Logger LOG = Logger.getLogger(TrainingJobPerformable.class);
    private static final String PRODUCT_CATALOG = "trainingProductCatalog";
    private static final String CONTENT_CATALOG = "trainingContentCatalog";

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        try {
            LOG.info("sync start at" + dtf.format(now));
            setupSyncJobService.createProductCatalogSyncJob(PRODUCT_CATALOG);
            setupSyncJobService.executeCatalogSyncJob(PRODUCT_CATALOG);
            setupSyncJobService.createProductCatalogSyncJob(CONTENT_CATALOG);
            setupSyncJobService.executeCatalogSyncJob(CONTENT_CATALOG);
        } catch (Error err) {
            LOG.error(err);
        }
        LOG.info("----- training sap hybris -----");
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
