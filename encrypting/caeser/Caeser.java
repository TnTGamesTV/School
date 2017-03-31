package com.github.tntgamestv.school;

/**
 * @author TnTGamesTV
 */
public class Caeser {

	/**
	 * Moves a string by the given steps
	 * @param str the string
	 * @param n the amount of steps
	 * @return the moved string
	 */
	public static String move(String str, int n) {
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) {
			sb.append((char) ((c + n - 'A') % 26 + 'A'));
		}
		return sb.toString();
	}
}
