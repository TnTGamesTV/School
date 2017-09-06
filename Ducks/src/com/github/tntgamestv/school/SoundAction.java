package com.github.tntgamestv.school;

/**
 * @author TnTGamesTV Project: Ducks Date: 06-09-2017
 */
public class SoundAction implements IActionExecutable {

	private final String soundAction;

	public SoundAction(String soundAction) {
		this.soundAction = soundAction;
	}

	@Override
	public String action() {
		return this.soundAction;
	}

}
