package control_structure;

import define.DefineValues;
import frame.GUIFrame;

public class SingleNodeTest {
	public static void main(String[] args){
		System.out.println("Launching GraphV v." + DefineValues.MAJOR_VERSION + "." + DefineValues.MINOR_VERSION + "." + DefineValues.BUILD_VERSION + DefineValues.DEVELOPMENT_STATUS);
		GUIFrame gui = new GUIFrame();
		gui.setVisibility(true);
		System.out.println("Execution Complete.");
	}
}
