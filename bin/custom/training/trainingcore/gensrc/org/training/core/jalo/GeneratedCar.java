/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 29, 2022, 9:48:43 AM                    ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product Car}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCar extends Product
{
	/** Qualifier of the <code>Car.hp</code> attribute **/
	public static final String HP = "hp";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(HP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.hp</code> attribute.
	 * @return the hp
	 */
	public Integer getHp(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, HP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.hp</code> attribute.
	 * @return the hp
	 */
	public Integer getHp()
	{
		return getHp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.hp</code> attribute. 
	 * @return the hp
	 */
	public int getHpAsPrimitive(final SessionContext ctx)
	{
		Integer value = getHp( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Car.hp</code> attribute. 
	 * @return the hp
	 */
	public int getHpAsPrimitive()
	{
		return getHpAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.hp</code> attribute. 
	 * @param value the hp
	 */
	public void setHp(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, HP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.hp</code> attribute. 
	 * @param value the hp
	 */
	public void setHp(final Integer value)
	{
		setHp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.hp</code> attribute. 
	 * @param value the hp
	 */
	public void setHp(final SessionContext ctx, final int value)
	{
		setHp( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Car.hp</code> attribute. 
	 * @param value the hp
	 */
	public void setHp(final int value)
	{
		setHp( getSession().getSessionContext(), value );
	}
	
}
