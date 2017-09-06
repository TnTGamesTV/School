package com.github.tntgamestv.school;

/**
 * @author TnTGamesTV Project: Ducks Date: 06-09-2017
 */
public class Main {

	public static void main(String[] args) {
		Duck duck = new Duck("Else");

		// Creating 'hardcoded' actions
		FlyAction flyAction = new FlyAction("Huuuiiii");
		SoundAction soundAction = new SoundAction("Schnat schnat");

		// Creating 'schnatterateng' sound action
		SchnatteratengSoundAction schnatteratengSoundAction = new SchnatteratengSoundAction();

		// Setting 'hardcoded' actions
		duck.setFlyAction(flyAction);
		duck.setSoundAction(soundAction);

		// Execute actions
		duck.executeFlyAction();
		duck.executeSoundAction();

		// Set 'schnatterateng' sound action
		duck.setSoundAction(schnatteratengSoundAction);

		// Execute action
		duck.executeSoundAction();
	}
}
