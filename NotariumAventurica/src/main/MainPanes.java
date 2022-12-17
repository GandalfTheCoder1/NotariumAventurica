package main;
import java.awt.*;
import javax.swing.*;

public class MainPanes extends JTabbedPane{
	public MainPanes(Frame r) {
		//Create mainPane
		JTabbedPane mainPane = new JTabbedPane();
		
		//create all Panels
		JPanel panelChars = new JPanel();
		JPanel panelCombat = new JPanel();
		JPanel panelItems = new JPanel();
		
		//add all panels to MainPane
		mainPane.add("Charaktere", panelChars);
		mainPane.add("Kampfprotokoll", panelCombat);
		mainPane.add("Basar", panelItems);
		
		//add everything to root Frame
		r.add(mainPane);
	}
}
