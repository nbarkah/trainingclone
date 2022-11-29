/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 29, 2022, 9:48:43 AM                    ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.catalog.jalo.CatalogUnawareMedia;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.Student;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Book}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedBook extends GenericItem
{
	/** Qualifier of the <code>Book.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Book.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>Book.genre</code> attribute **/
	public static final String GENRE = "genre";
	/** Qualifier of the <code>Book.image</code> attribute **/
	public static final String IMAGE = "image";
	/** Qualifier of the <code>Book.student</code> attribute **/
	public static final String STUDENT = "student";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STUDENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBook> STUDENTHANDLER = new BidirectionalOneToManyHandler<GeneratedBook>(
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
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(GENRE, AttributeMode.INITIAL);
		tmp.put(IMAGE, AttributeMode.INITIAL);
		tmp.put(STUDENT, AttributeMode.INITIAL);
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
		STUDENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.genre</code> attribute.
	 * @return the genre
	 */
	public EnumerationValue getGenre(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GENRE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.genre</code> attribute.
	 * @return the genre
	 */
	public EnumerationValue getGenre()
	{
		return getGenre( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.genre</code> attribute. 
	 * @param value the genre
	 */
	public void setGenre(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GENRE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.genre</code> attribute. 
	 * @param value the genre
	 */
	public void setGenre(final EnumerationValue value)
	{
		setGenre( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.id</code> attribute.
	 * @return the id
	 */
	public Integer getId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.id</code> attribute.
	 * @return the id
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final int value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.image</code> attribute.
	 * @return the image
	 */
	public CatalogUnawareMedia getImage(final SessionContext ctx)
	{
		return (CatalogUnawareMedia)getProperty( ctx, IMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.image</code> attribute.
	 * @return the image
	 */
	public CatalogUnawareMedia getImage()
	{
		return getImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.image</code> attribute. 
	 * @param value the image
	 */
	public void setImage(final SessionContext ctx, final CatalogUnawareMedia value)
	{
		setProperty(ctx, IMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.image</code> attribute. 
	 * @param value the image
	 */
	public void setImage(final CatalogUnawareMedia value)
	{
		setImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.student</code> attribute.
	 * @return the student
	 */
	public Student getStudent(final SessionContext ctx)
	{
		return (Student)getProperty( ctx, STUDENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.student</code> attribute.
	 * @return the student
	 */
	public Student getStudent()
	{
		return getStudent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.student</code> attribute. 
	 * @param value the student
	 */
	public void setStudent(final SessionContext ctx, final Student value)
	{
		STUDENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.student</code> attribute. 
	 * @param value the student
	 */
	public void setStudent(final Student value)
	{
		setStudent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.title</code> attribute.
	 * @return the title
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.title</code> attribute.
	 * @return the title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
}
