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
import org.training.core.jalo.SportsCar;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product Mobile}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMobile extends SportsCar
{
	/** Qualifier of the <code>Mobile.missiles</code> attribute **/
	public static final String MISSILES = "missiles";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SportsCar.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MISSILES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Mobile.missiles</code> attribute.
	 * @return the missiles
	 */
	public Integer getMissiles(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MISSILES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Mobile.missiles</code> attribute.
	 * @return the missiles
	 */
	public Integer getMissiles()
	{
		return getMissiles( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Mobile.missiles</code> attribute. 
	 * @return the missiles
	 */
	public int getMissilesAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMissiles( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Mobile.missiles</code> attribute. 
	 * @return the missiles
	 */
	public int getMissilesAsPrimitive()
	{
		return getMissilesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Mobile.missiles</code> attribute. 
	 * @param value the missiles
	 */
	public void setMissiles(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MISSILES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Mobile.missiles</code> attribute. 
	 * @param value the missiles
	 */
	public void setMissiles(final Integer value)
	{
		setMissiles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Mobile.missiles</code> attribute. 
	 * @param value the missiles
	 */
	public void setMissiles(final SessionContext ctx, final int value)
	{
		setMissiles( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Mobile.missiles</code> attribute. 
	 * @param value the missiles
	 */
	public void setMissiles(final int value)
	{
		setMissiles( getSession().getSessionContext(), value );
	}
	
}
