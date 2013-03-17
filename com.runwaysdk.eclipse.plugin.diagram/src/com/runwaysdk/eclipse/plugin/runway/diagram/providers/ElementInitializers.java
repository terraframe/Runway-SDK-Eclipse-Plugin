package com.runwaysdk.eclipse.plugin.runway.diagram.providers;

import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = RunwayDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			RunwayDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
