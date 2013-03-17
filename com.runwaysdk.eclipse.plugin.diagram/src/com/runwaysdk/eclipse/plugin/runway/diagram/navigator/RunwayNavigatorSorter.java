package com.runwaysdk.eclipse.plugin.runway.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayVisualIDRegistry;

/**
 * @generated
 */
public class RunwayNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof RunwayNavigatorItem) {
			RunwayNavigatorItem item = (RunwayNavigatorItem) element;
			return RunwayVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
