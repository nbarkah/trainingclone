/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 29, 2022, 9:48:43 AM                    ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.jalo.process;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.TestActionProcess TestActionProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTestActionProcess extends BusinessProcess
{
	/** Qualifier of the <code>TestActionProcess.something</code> attribute **/
	public static final String SOMETHING = "something";
	/** Qualifier of the <code>TestActionProcess.uid</code> attribute **/
	public static final String UID = "uid";
	/** Qualifier of the <code>TestActionProcess.name</code> attribute **/
	public static final String NAME = "name";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BusinessProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SOMETHING, AttributeMode.INITIAL);
		tmp.put(UID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestActionProcess.name</code> attribute.
	 * @return the name - something
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestActionProcess.name</code> attribute.
	 * @return the name - something
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestActionProcess.name</code> attribute. 
	 * @param value the name - something
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestActionProcess.name</code> attribute. 
	 * @param value the name - something
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestActionProcess.something</code> attribute.
	 * @return the something - something
	 */
	public String getSomething(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOMETHING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestActionProcess.something</code> attribute.
	 * @return the something - something
	 */
	public String getSomething()
	{
		return getSomething( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestActionProcess.something</code> attribute. 
	 * @param value the something - something
	 */
	public void setSomething(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOMETHING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestActionProcess.something</code> attribute. 
	 * @param value the something - something
	 */
	public void setSomething(final String value)
	{
		setSomething( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestActionProcess.uid</code> attribute.
	 * @return the uid - something
	 */
	public String getUid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestActionProcess.uid</code> attribute.
	 * @return the uid - something
	 */
	public String getUid()
	{
		return getUid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestActionProcess.uid</code> attribute. 
	 * @param value the uid - something
	 */
	public void setUid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestActionProcess.uid</code> attribute. 
	 * @param value the uid - something
	 */
	public void setUid(final String value)
	{
		setUid( getSession().getSessionContext(), value );
	}
	
}
