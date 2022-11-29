/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 29, 2022, 9:48:43 AM                    ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.Car;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product Truck}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTruck extends Car
{
	/** Qualifier of the <code>Truck.tonnage</code> attribute **/
	public static final String TONNAGE = "tonnage";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Car.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TONNAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Truck.tonnage</code> attribute.
	 * @return the tonnage
	 */
	public Integer getTonnage(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TONNAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Truck.tonnage</code> attribute.
	 * @return the tonnage
	 */
	public Integer getTonnage()
	{
		return getTonnage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Truck.tonnage</code> attribute. 
	 * @return the tonnage
	 */
	public int getTonnageAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTonnage( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Truck.tonnage</code> attribute. 
	 * @return the tonnage
	 */
	public int getTonnageAsPrimitive()
	{
		return getTonnageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Truck.tonnage</code> attribute. 
	 * @param value the tonnage
	 */
	public void setTonnage(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TONNAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Truck.tonnage</code> attribute. 
	 * @param value the tonnage
	 */
	public void setTonnage(final Integer value)
	{
		setTonnage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Truck.tonnage</code> attribute. 
	 * @param value the tonnage
	 */
	public void setTonnage(final SessionContext ctx, final int value)
	{
		setTonnage( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Truck.tonnage</code> attribute. 
	 * @param value the tonnage
	 */
	public void setTonnage(final int value)
	{
		setTonnage( getSession().getSessionContext(), value );
	}
	
}
