package frame;

import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;

import define.DefineValues;

/**
 * This is the highest level graphics element - contains the GUI elements and the Visualization Frame
 * @author Mikhail Andreev
 *
 */
public class GUIFrame extends JFrame{
	public GUIFrame(){
		super("GraphV v." + DefineValues.MAJOR_VERSION + "." + DefineValues.MINOR_VERSION + "." + DefineValues.BUILD_VERSION + DefineValues.DEVELOPMENT_STATUS);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(DefineValues.INITIAL_SIZE_X, DefineValues.INITIAL_SIZE_Y));
		this.addComponentListener(new ComponentListener(){
			@Override public void componentHidden(ComponentEvent arg0) {}
			@Override public void componentShown(ComponentEvent arg0) {}
			@Override public void componentMoved(ComponentEvent arg0) {}

			@Override
			public void componentResized(ComponentEvent arg0) {
				System.out.println("GUIFrame resized: " + getSize().toString());
			}
		});
	}
	
	public void setVisibility(boolean visibility){
		this.setVisible(visibility);
	}
}
