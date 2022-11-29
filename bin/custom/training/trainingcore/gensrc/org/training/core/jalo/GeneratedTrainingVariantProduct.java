/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 29, 2022, 9:48:43 AM                    ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.Supplier;

/**
 * Generated class for type {@link de.hybris.platform.variants.jalo.VariantProduct TrainingVariantProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTrainingVariantProduct extends VariantProduct
{
	/** Qualifier of the <code>TrainingVariantProduct.sku</code> attribute **/
	public static final String SKU = "sku";
	/** Qualifier of the <code>TrainingVariantProduct.material</code> attribute **/
	public static final String MATERIAL = "material";
	/** Qualifier of the <code>TrainingVariantProduct.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SUPPLIER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTrainingVariantProduct> SUPPLIERHANDLER = new BidirectionalOneToManyHandler<GeneratedTrainingVariantProduct>(
	TrainingCoreConstants.TC.TRAININGVARIANTPRODUCT,
	false,
	"supplier",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SKU, AttributeMode.INITIAL);
		tmp.put(MATERIAL, AttributeMode.INITIAL);
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SUPPLIERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingVariantProduct.material</code> attribute.
	 * @return the material - Material Product
	 */
	public String getMaterial(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MATERIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingVariantProduct.material</code> attribute.
	 * @return the material - Material Product
	 */
	public String getMaterial()
	{
		return getMaterial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingVariantProduct.material</code> attribute. 
	 * @param value the material - Material Product
	 */
	public void setMaterial(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MATERIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingVariantProduct.material</code> attribute. 
	 * @param value the material - Material Product
	 */
	public void setMaterial(final String value)
	{
		setMaterial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingVariantProduct.sku</code> attribute.
	 * @return the sku - SKU Product
	 */
	public String getSku(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SKU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingVariantProduct.sku</code> attribute.
	 * @return the sku - SKU Product
	 */
	public String getSku()
	{
		return getSku( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingVariantProduct.sku</code> attribute. 
	 * @param value the sku - SKU Product
	 */
	public void setSku(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SKU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingVariantProduct.sku</code> attribute. 
	 * @param value the sku - SKU Product
	 */
	public void setSku(final String value)
	{
		setSku( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingVariantProduct.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingVariantProduct.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingVariantProduct.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		SUPPLIERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingVariantProduct.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
}
