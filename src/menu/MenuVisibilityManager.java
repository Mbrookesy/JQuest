package src.menu;

import src.forest.ForestStartGUI;

public class MenuVisibilityManager {
	
	MenuGUI menu;
	ForestStartGUI start;
	
	
	public MenuVisibilityManager(MenuGUI userMenu, ForestStartGUI startingScreen) {
		menu = userMenu;
		start = startingScreen;
	}

	public void showTitleScreen() {	
		menu.creditButtonPanel.setVisible(false);
		menu.creditPanel.setVisible(false);
		menu.tempButtonPanel.setVisible(false);
		menu.tempPanel.setVisible(false);
		
		menu.titleNamePanel.setVisible(true);
		menu.ButtonPanel.setVisible(true);;
	}
	
	public void showCreditsScreen() {
		menu.titleNamePanel.setVisible(false);
		menu.ButtonPanel.setVisible(false);;
		
		menu.creditButtonPanel.setVisible(true);
		menu.creditPanel.setVisible(true);
	}
	
	public void showNewGameScreen() {
		menu.titleNamePanel.setVisible(false);
		menu.ButtonPanel.setVisible(false);
	}
	
	public void showTempScreen() {
		menu.titleNamePanel.setVisible(false);
		menu.ButtonPanel.setVisible(false);
		
		menu.tempButtonPanel.setVisible(true);
		menu.tempPanel.setVisible(true);
	}
}