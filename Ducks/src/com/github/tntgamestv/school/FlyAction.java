package com.github.tntgamestv.school;

/**
 * @author TnTGamesTV Project: Ducks Date: 06-09-2017
 */
public class FlyAction implements IActionExecutable {

	private final String flyAction;

	public FlyAction(String flyAction) {
		this.flyAction = flyAction;
	}

	@Override
	public String action() {
		return this.flyAction;
	}
}
