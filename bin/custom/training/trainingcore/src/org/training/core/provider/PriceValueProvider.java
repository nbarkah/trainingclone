package org.training.core.provider;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;
import org.training.core.model.TrainingVariantProductModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PriceValueProvider extends AbstractPropertyFieldValueProvider implements FieldValueProvider {
    private FieldNameProvider fieldNameProvider;

    @Override
    public Collection<FieldValue> getFieldValues(IndexConfig indexConfig, IndexedProperty indexedProperty, Object model) throws FieldValueProviderException {
        if (model instanceof TrainingVariantProductModel)
        {
            final TrainingVariantProductModel product = (TrainingVariantProductModel) model;
            final Collection<FieldValue> fieldValues = new ArrayList<>();
            fieldValues.addAll(createFieldValue(product, indexedProperty));
            return fieldValues;
        }
        else
        {
            throw new FieldValueProviderException("Cannot get Supplier");
        }

    }

    private Collection<? extends FieldValue> createFieldValue(TrainingVariantProductModel product, IndexedProperty indexedProperty) {
        final List<FieldValue> fieldValues = new ArrayList<FieldValue>();
        final Collection<String> fieldNames = getFieldNameProvider().getFieldNames(indexedProperty, null);
        if (null != product.getPriceQuantity()) {
            for (final String fieldName : fieldNames) {
                fieldValues.add(new FieldValue(fieldName, product.getPriceQuantity().doubleValue()));
            }
        }
        return fieldValues;
    }

    public FieldNameProvider getFieldNameProvider() {
        return fieldNameProvider;
    }

    public void setFieldNameProvider(final FieldNameProvider fieldNameProvider) {
        this.fieldNameProvider = fieldNameProvider;
    }

}