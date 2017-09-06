package com.github.tntgamestv.school;

/**
 * @author TnTGamesTV Project: Ducks Date: 06-09-2017
 */
public class Duck {
	private SoundAction	soundAction;
	private FlyAction	flyAction;

	private String		name;

	public Duck(String name) {
		this.name = name;
	}

	/**
	 * @return the soundAction
	 */
	public SoundAction getSoundAction() {
		return soundAction;
	}

	/**
	 * @param soundAction
	 *            the soundAction to set
	 */
	public void setSoundAction(SoundAction soundAction) {
		this.soundAction = soundAction;
	}

	public void executeSoundAction() {
		System.out.println(this.soundAction.action());
	}

	/**
	 * @return the flyAction
	 */
	public FlyAction getFlyAction() {
		return flyAction;
	}

	/**
	 * @param flyAction
	 *            the flyAction to set
	 */
	public void setFlyAction(FlyAction flyAction) {
		this.flyAction = flyAction;
	}

	public void executeFlyAction() {
		System.out.println(this.flyAction.action());
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}