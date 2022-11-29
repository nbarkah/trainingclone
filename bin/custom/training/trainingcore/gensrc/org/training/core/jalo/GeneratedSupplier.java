/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 29, 2022, 9:48:43 AM                    ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.City;
import org.training.core.jalo.Province;
import org.training.core.jalo.TrainingVariantProduct;

/**
 * Generated class for type {@link org.training.core.jalo.Supplier Supplier}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSupplier extends GenericItem
{
	/** Qualifier of the <code>Supplier.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Supplier.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Supplier.province</code> attribute **/
	public static final String PROVINCE = "province";
	/** Qualifier of the <code>Supplier.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>Supplier.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>Supplier.trainingVariantProduct</code> attribute **/
	public static final String TRAININGVARIANTPRODUCT = "trainingVariantProduct";
	/**
	* {@link OneToManyHandler} for handling 1:n TRAININGVARIANTPRODUCT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TrainingVariantProduct> TRAININGVARIANTPRODUCTHANDLER = new OneToManyHandler<TrainingVariantProduct>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(PROVINCE, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.city</code> attribute.
	 * @return the city - City
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.city</code> attribute.
	 * @return the city - City
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.city</code> attribute. 
	 * @param value the city - City
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.city</code> attribute. 
	 * @param value the city - City
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.code</code> attribute.
	 * @return the code - Supplier Code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.code</code> attribute.
	 * @return the code - Supplier Code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.code</code> attribute. 
	 * @param value the code - Supplier Code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.code</code> attribute. 
	 * @param value the code - Supplier Code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.name</code> attribute.
	 * @return the name - City Name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.name</code> attribute.
	 * @return the name - City Name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.name</code> attribute. 
	 * @param value the name - City Name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.name</code> attribute. 
	 * @param value the name - City Name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.province</code> attribute.
	 * @return the province - Province
	 */
	public Province getProvince(final SessionContext ctx)
	{
		return (Province)getProperty( ctx, PROVINCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.province</code> attribute.
	 * @return the province - Province
	 */
	public Province getProvince()
	{
		return getProvince( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.province</code> attribute. 
	 * @param value the province - Province
	 */
	public void setProvince(final SessionContext ctx, final Province value)
	{
		setProperty(ctx, PROVINCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.province</code> attribute. 
	 * @param value the province - Province
	 */
	public void setProvince(final Province value)
	{
		setProvince( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.status</code> attribute.
	 * @return the status - Status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.status</code> attribute.
	 * @return the status - Status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.status</code> attribute. 
	 * @param value the status - Status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.status</code> attribute. 
	 * @param value the status - Status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.trainingVariantProduct</code> attribute.
	 * @return the trainingVariantProduct
	 */
	public List<TrainingVariantProduct> getTrainingVariantProduct(final SessionContext ctx)
	{
		return (List<TrainingVariantProduct>)TRAININGVARIANTPRODUCTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.trainingVariantProduct</code> attribute.
	 * @return the trainingVariantProduct
	 */
	public List<TrainingVariantProduct> getTrainingVariantProduct()
	{
		return getTrainingVariantProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.trainingVariantProduct</code> attribute. 
	 * @param value the trainingVariantProduct
	 */
	public void setTrainingVariantProduct(final SessionContext ctx, final List<TrainingVariantProduct> value)
	{
		TRAININGVARIANTPRODUCTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.trainingVariantProduct</code> attribute. 
	 * @param value the trainingVariantProduct
	 */
	public void setTrainingVariantProduct(final List<TrainingVariantProduct> value)
	{
		setTrainingVariantProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to trainingVariantProduct. 
	 * @param value the item to add to trainingVariantProduct
	 */
	public void addToTrainingVariantProduct(final SessionContext ctx, final TrainingVariantProduct value)
	{
		TRAININGVARIANTPRODUCTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to trainingVariantProduct. 
	 * @param value the item to add to trainingVariantProduct
	 */
	public void addToTrainingVariantProduct(final TrainingVariantProduct value)
	{
		addToTrainingVariantProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from trainingVariantProduct. 
	 * @param value the item to remove from trainingVariantProduct
	 */
	public void removeFromTrainingVariantProduct(final SessionContext ctx, final TrainingVariantProduct value)
	{
		TRAININGVARIANTPRODUCTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from trainingVariantProduct. 
	 * @param value the item to remove from trainingVariantProduct
	 */
	public void removeFromTrainingVariantProduct(final TrainingVariantProduct value)
	{
		removeFromTrainingVariantProduct( getSession().getSessionContext(), value );
	}
	
}
