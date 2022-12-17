package main;
import java.awt.*;
import javax.swing.*;

public class CharacterPane extends JTabbedPane{
	public CharacterPane(JTabbedPane mainPane) {
		//create character pane
		JTabbedPane characters = new JTabbedPane();
		
		JPanel test = new JPanel();
		characters.add("Alrik", test);
		
		//add to main pane
		mainPane.add(characters);
	}
}
