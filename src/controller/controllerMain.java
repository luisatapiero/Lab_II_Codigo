package controller;

import model.Logic;
import processing.core.PApplet;

public class ControllerMain {

	private Logic logic;
	private int numInteraction;

	public ControllerMain(PApplet app) {
		logic = new Logic(app);

	}

	public void firstScreen() {
		logic.firstScreen();

	}

	public void clickGuitar() {
		logic.clickGuitar();
		numInteraction = logic.getNumInteraction();
	}

	public void clickMouses() {
		logic.clickMouses();
		numInteraction = logic.getNumInteraction();
	}

	public void catDrag() {

				logic.dragCat();
				numInteraction = logic.getNumInteraction();
			}
	
	public void moveHat() {

		logic.moveHat();
		//numInteraction = logic.getNumInteraction();
	}



	public void fifthScreen() {
		logic.fifthScreen();
	}
	
	public void secondScreen() {
		logic.secondScreen();
	}

	public void clickTadpole() {
		logic.clickTadpole();
	}

	public void saveText() {
		System.out.println("Save text");
		logic.saveText();
	}

	public int getNumInteraction() {
		return numInteraction;
	}

	public void setNumInteraction(int numInteraction) {
		this.numInteraction = numInteraction;
	}

}
