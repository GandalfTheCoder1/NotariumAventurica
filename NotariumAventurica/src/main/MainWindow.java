package main;
import javax.swing.*;
import java.awt.*;

public class MainWindow extends JTabbedPane implements WindowOperations{
	public MainWindow() {
		//Create Root frame
		Frame r = new JFrame();
		
		//set dimensions and name
		r.setSize(900,800);
		r.setName("Notarium Aventurica by Septimus");
		
		//create the mainPanes
		MainPanes tabbedMainPane = new MainPanes(r);
		
		//Make the root visible
		r.setVisible(true);
	}
}
