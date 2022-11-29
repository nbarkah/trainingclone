package org.training.facades.populators;

import de.hybris.platform.commercefacades.product.data.PriceData;
import de.hybris.platform.commercefacades.product.data.PriceDataType;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.math.BigDecimal;

/**
 * The Class TrainingSearchResultProductPopulator
 *
 * @author Kris Sunu Purnandaru
 */
public class TrainingSearchResultProductPopulator extends SearchResultProductPopulator {
    @Override
    public void populate(final SearchResultValueData source, final ProductData target) throws ConversionException {
        target.setSku(this.<String>getValue(source, "sku"));
        target.setMaterial(this.<String>getValue(source, "material"));
        target.setSupplier(this.<String>getValue(source, "supplier"));
        target.setStatusSupplier(this.<String>getValue(source, "statusSupplier"));
        target.setProvince(this.<String>getValue(source, "province"));
    }

    @Override
    protected void populatePrices(SearchResultValueData source, ProductData target) {
        final Double priceValue = this.<Double>getValue(source, "price_idr_double");
        if (priceValue != null) {
            final PriceData priceData = getPriceDataFactory().create(PriceDataType.BUY, BigDecimal.valueOf(priceValue.doubleValue()),
                    getCommonI18NService().getCurrentCurrency());
            target.setPrice(priceData);
        }
    }
}