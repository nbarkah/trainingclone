package org.training.core.provider;

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

/**
 * The Class SupplierValueProvider
 *
 * @author Kris Sunu Purnandaru
 */
public class SupplierValueProvider extends AbstractPropertyFieldValueProvider implements FieldValueProvider {

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

    protected List<FieldValue> createFieldValue(final TrainingVariantProductModel product, final IndexedProperty indexedProperty)
    {
        final List<FieldValue> fieldValues = new ArrayList<FieldValue>();
        final Collection<String> fieldNames = getFieldNameProvider().getFieldNames(indexedProperty, null);
        String indexName="";
        if (null != product.getSupplier())
        {
            for (final String fieldName : fieldNames)
            {
                if(fieldName.contains("statusSupplier")){
                    indexName = product.getSupplier().getStatus().getCode();
                } else if (fieldName.contains("province")) {
                    indexName = product.getSupplier().getProvince().getName();
                } else {
                    indexName = product.getSupplier().getName();
                }
                fieldValues.add(new FieldValue(fieldName,indexName ));
            }
        }
        return fieldValues;
    }

    /**
     * @return the fieldNameProvider
     */
    public FieldNameProvider getFieldNameProvider()
    {
        return fieldNameProvider;
    }

    /**
     * @param fieldNameProvider
     *           the fieldNameProvider to set
     */
    public void setFieldNameProvider(final FieldNameProvider fieldNameProvider)
    {
        this.fieldNameProvider = fieldNameProvider;
    }
}
