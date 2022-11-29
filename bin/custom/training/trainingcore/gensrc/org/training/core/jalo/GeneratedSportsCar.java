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
 * Generated class for type {@link de.hybris.platform.jalo.product.Product SportsCar}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSportsCar extends Car
{
	/** Qualifier of the <code>SportsCar.nitroinjector</code> attribute **/
	public static final String NITROINJECTOR = "nitroinjector";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Car.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NITROINJECTOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SportsCar.nitroinjector</code> attribute.
	 * @return the nitroinjector
	 */
	public Integer getNitroinjector(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NITROINJECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SportsCar.nitroinjector</code> attribute.
	 * @return the nitroinjector
	 */
	public Integer getNitroinjector()
	{
		return getNitroinjector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SportsCar.nitroinjector</code> attribute. 
	 * @return the nitroinjector
	 */
	public int getNitroinjectorAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNitroinjector( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SportsCar.nitroinjector</code> attribute. 
	 * @return the nitroinjector
	 */
	public int getNitroinjectorAsPrimitive()
	{
		return getNitroinjectorAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SportsCar.nitroinjector</code> attribute. 
	 * @param value the nitroinjector
	 */
	public void setNitroinjector(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NITROINJECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SportsCar.nitroinjector</code> attribute. 
	 * @param value the nitroinjector
	 */
	public void setNitroinjector(final Integer value)
	{
		setNitroinjector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SportsCar.nitroinjector</code> attribute. 
	 * @param value the nitroinjector
	 */
	public void setNitroinjector(final SessionContext ctx, final int value)
	{
		setNitroinjector( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SportsCar.nitroinjector</code> attribute. 
	 * @param value the nitroinjector
	 */
	public void setNitroinjector(final int value)
	{
		setNitroinjector( getSession().getSessionContext(), value );
	}
	
}
