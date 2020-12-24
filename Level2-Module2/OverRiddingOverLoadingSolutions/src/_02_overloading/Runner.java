package _02_overloading;

import java.awt.Color;

public class Runner {
	public static void main(String[] args) {
		LeagueOptionPane.showMessageDialog("The League is the Best");
		LeagueOptionPane.showMessageDialog("Better MessageDialog", "Overload");
		LeagueOptionPane.showMessageDialog("Goodbye", "League", "leagueDark.png");
		LeagueOptionPane.showMessageDialog("Goodbye", "League", "leagueDark.png", Color.CYAN);
	}
}
