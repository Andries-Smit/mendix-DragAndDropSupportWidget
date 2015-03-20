// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testdraganddrop.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class DetailDnD
{
	private final IMendixObject detailDnDMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "TestDragAndDrop.DetailDnD";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DetailDnD_Detail_DropTarget("TestDragAndDrop.DetailDnD_Detail_DropTarget"),
		DetailDnD_Item_Dragged("TestDragAndDrop.DetailDnD_Item_Dragged"),
		DetailDnD_Detail_Dragged("TestDragAndDrop.DetailDnD_Detail_Dragged"),
		DetailDnD_Header_DropTarget("TestDragAndDrop.DetailDnD_Header_DropTarget");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public DetailDnD(IContext context)
	{
		this(context, Core.instantiate(context, "TestDragAndDrop.DetailDnD"));
	}

	protected DetailDnD(IContext context, IMendixObject detailDnDMendixObject)
	{
		if (detailDnDMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("TestDragAndDrop.DetailDnD", detailDnDMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a TestDragAndDrop.DetailDnD");

		this.detailDnDMendixObject = detailDnDMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DetailDnD.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testdraganddrop.proxies.DetailDnD initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return testdraganddrop.proxies.DetailDnD.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static testdraganddrop.proxies.DetailDnD initialize(IContext context, IMendixObject mendixObject)
	{
		return new testdraganddrop.proxies.DetailDnD(context, mendixObject);
	}

	public static testdraganddrop.proxies.DetailDnD load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return testdraganddrop.proxies.DetailDnD.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of DetailDnD_Detail_DropTarget
	 */
	public final testdraganddrop.proxies.Detail getDetailDnD_Detail_DropTarget() throws CoreException
	{
		return getDetailDnD_Detail_DropTarget(getContext());
	}

	/**
	 * @param context
	 * @return value of DetailDnD_Detail_DropTarget
	 */
	public final testdraganddrop.proxies.Detail getDetailDnD_Detail_DropTarget(IContext context) throws CoreException
	{
		testdraganddrop.proxies.Detail result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DetailDnD_Detail_DropTarget.toString());
		if (identifier != null)
			result = testdraganddrop.proxies.Detail.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DetailDnD_Detail_DropTarget
	 * @param detaildnd_detail_droptarget
	 */
	public final void setDetailDnD_Detail_DropTarget(testdraganddrop.proxies.Detail detaildnd_detail_droptarget)
	{
		setDetailDnD_Detail_DropTarget(getContext(), detaildnd_detail_droptarget);
	}

	/**
	 * Set value of DetailDnD_Detail_DropTarget
	 * @param context
	 * @param detaildnd_detail_droptarget
	 */
	public final void setDetailDnD_Detail_DropTarget(IContext context, testdraganddrop.proxies.Detail detaildnd_detail_droptarget)
	{
		if (detaildnd_detail_droptarget == null)
			getMendixObject().setValue(context, MemberNames.DetailDnD_Detail_DropTarget.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DetailDnD_Detail_DropTarget.toString(), detaildnd_detail_droptarget.getMendixObject().getId());
	}

	/**
	 * @return value of DetailDnD_Item_Dragged
	 */
	public final testdraganddrop.proxies.Item getDetailDnD_Item_Dragged() throws CoreException
	{
		return getDetailDnD_Item_Dragged(getContext());
	}

	/**
	 * @param context
	 * @return value of DetailDnD_Item_Dragged
	 */
	public final testdraganddrop.proxies.Item getDetailDnD_Item_Dragged(IContext context) throws CoreException
	{
		testdraganddrop.proxies.Item result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DetailDnD_Item_Dragged.toString());
		if (identifier != null)
			result = testdraganddrop.proxies.Item.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DetailDnD_Item_Dragged
	 * @param detaildnd_item_dragged
	 */
	public final void setDetailDnD_Item_Dragged(testdraganddrop.proxies.Item detaildnd_item_dragged)
	{
		setDetailDnD_Item_Dragged(getContext(), detaildnd_item_dragged);
	}

	/**
	 * Set value of DetailDnD_Item_Dragged
	 * @param context
	 * @param detaildnd_item_dragged
	 */
	public final void setDetailDnD_Item_Dragged(IContext context, testdraganddrop.proxies.Item detaildnd_item_dragged)
	{
		if (detaildnd_item_dragged == null)
			getMendixObject().setValue(context, MemberNames.DetailDnD_Item_Dragged.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DetailDnD_Item_Dragged.toString(), detaildnd_item_dragged.getMendixObject().getId());
	}

	/**
	 * @return value of DetailDnD_Detail_Dragged
	 */
	public final testdraganddrop.proxies.Detail getDetailDnD_Detail_Dragged() throws CoreException
	{
		return getDetailDnD_Detail_Dragged(getContext());
	}

	/**
	 * @param context
	 * @return value of DetailDnD_Detail_Dragged
	 */
	public final testdraganddrop.proxies.Detail getDetailDnD_Detail_Dragged(IContext context) throws CoreException
	{
		testdraganddrop.proxies.Detail result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DetailDnD_Detail_Dragged.toString());
		if (identifier != null)
			result = testdraganddrop.proxies.Detail.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DetailDnD_Detail_Dragged
	 * @param detaildnd_detail_dragged
	 */
	public final void setDetailDnD_Detail_Dragged(testdraganddrop.proxies.Detail detaildnd_detail_dragged)
	{
		setDetailDnD_Detail_Dragged(getContext(), detaildnd_detail_dragged);
	}

	/**
	 * Set value of DetailDnD_Detail_Dragged
	 * @param context
	 * @param detaildnd_detail_dragged
	 */
	public final void setDetailDnD_Detail_Dragged(IContext context, testdraganddrop.proxies.Detail detaildnd_detail_dragged)
	{
		if (detaildnd_detail_dragged == null)
			getMendixObject().setValue(context, MemberNames.DetailDnD_Detail_Dragged.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DetailDnD_Detail_Dragged.toString(), detaildnd_detail_dragged.getMendixObject().getId());
	}

	/**
	 * @return value of DetailDnD_Header_DropTarget
	 */
	public final testdraganddrop.proxies.Header getDetailDnD_Header_DropTarget() throws CoreException
	{
		return getDetailDnD_Header_DropTarget(getContext());
	}

	/**
	 * @param context
	 * @return value of DetailDnD_Header_DropTarget
	 */
	public final testdraganddrop.proxies.Header getDetailDnD_Header_DropTarget(IContext context) throws CoreException
	{
		testdraganddrop.proxies.Header result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DetailDnD_Header_DropTarget.toString());
		if (identifier != null)
			result = testdraganddrop.proxies.Header.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DetailDnD_Header_DropTarget
	 * @param detaildnd_header_droptarget
	 */
	public final void setDetailDnD_Header_DropTarget(testdraganddrop.proxies.Header detaildnd_header_droptarget)
	{
		setDetailDnD_Header_DropTarget(getContext(), detaildnd_header_droptarget);
	}

	/**
	 * Set value of DetailDnD_Header_DropTarget
	 * @param context
	 * @param detaildnd_header_droptarget
	 */
	public final void setDetailDnD_Header_DropTarget(IContext context, testdraganddrop.proxies.Header detaildnd_header_droptarget)
	{
		if (detaildnd_header_droptarget == null)
			getMendixObject().setValue(context, MemberNames.DetailDnD_Header_DropTarget.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DetailDnD_Header_DropTarget.toString(), detaildnd_header_droptarget.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return detailDnDMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testdraganddrop.proxies.DetailDnD that = (testdraganddrop.proxies.DetailDnD) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "TestDragAndDrop.DetailDnD";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}