package main;
import java.awt.*;
import javax.swing.*;

public class CharacterPane extends JTabbedPane{
	public CharacterPane(JTabbedPane mainPane) {
		//create character pane
		JTabbedPane characters = new JTabbedPane();
		
		//add to main pane
		mainPane.add(characters);
	}
}
