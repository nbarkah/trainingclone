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
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.Book;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Student}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedStudent extends GenericItem
{
	/** Qualifier of the <code>Student.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Student.fullName</code> attribute **/
	public static final String FULLNAME = "fullName";
	/** Qualifier of the <code>Student.phoneNumber</code> attribute **/
	public static final String PHONENUMBER = "phoneNumber";
	/** Qualifier of the <code>Student.books</code> attribute **/
	public static final String BOOKS = "books";
	/**
	* {@link OneToManyHandler} for handling 1:n BOOKS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Book> BOOKSHANDLER = new OneToManyHandler<Book>(
	TrainingCoreConstants.TC.BOOK,
	false,
	"student",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(FULLNAME, AttributeMode.INITIAL);
		tmp.put(PHONENUMBER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.books</code> attribute.
	 * @return the books
	 */
	public Collection<Book> getBooks(final SessionContext ctx)
	{
		return BOOKSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.books</code> attribute.
	 * @return the books
	 */
	public Collection<Book> getBooks()
	{
		return getBooks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.books</code> attribute. 
	 * @param value the books
	 */
	public void setBooks(final SessionContext ctx, final Collection<Book> value)
	{
		BOOKSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.books</code> attribute. 
	 * @param value the books
	 */
	public void setBooks(final Collection<Book> value)
	{
		setBooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to books. 
	 * @param value the item to add to books
	 */
	public void addToBooks(final SessionContext ctx, final Book value)
	{
		BOOKSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to books. 
	 * @param value the item to add to books
	 */
	public void addToBooks(final Book value)
	{
		addToBooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from books. 
	 * @param value the item to remove from books
	 */
	public void removeFromBooks(final SessionContext ctx, final Book value)
	{
		BOOKSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from books. 
	 * @param value the item to remove from books
	 */
	public void removeFromBooks(final Book value)
	{
		removeFromBooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.fullName</code> attribute.
	 * @return the fullName
	 */
	public String getFullName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FULLNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.fullName</code> attribute.
	 * @return the fullName
	 */
	public String getFullName()
	{
		return getFullName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.fullName</code> attribute. 
	 * @param value the fullName
	 */
	public void setFullName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FULLNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.fullName</code> attribute. 
	 * @param value the fullName
	 */
	public void setFullName(final String value)
	{
		setFullName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute.
	 * @return the id
	 */
	public Integer getId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute.
	 * @return the id
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final int value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.phoneNumber</code> attribute.
	 * @return the phoneNumber
	 */
	public String getPhoneNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.phoneNumber</code> attribute.
	 * @return the phoneNumber
	 */
	public String getPhoneNumber()
	{
		return getPhoneNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.phoneNumber</code> attribute. 
	 * @param value the phoneNumber
	 */
	public void setPhoneNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.phoneNumber</code> attribute. 
	 * @param value the phoneNumber
	 */
	public void setPhoneNumber(final String value)
	{
		setPhoneNumber( getSession().getSessionContext(), value );
	}
	
}
