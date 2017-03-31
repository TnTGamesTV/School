package com.github.tntgamestv.school;

import java.math.BigInteger;
import java.security.MessageDigest;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author TnTGamesTV
 */
public class FastCrypt {

	public static String	encryptionKey	= "abcdefghabcdefgh";

	static String			IV				= "AAAAAAAAAAAAAAAA";

	public static byte[] encrypt(String plainText, String encryptionKey) throws Exception {
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding ", "SunJCE");
		SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
		cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(IV.getBytes("UTF-8")));
		return cipher.doFinal(plainText.getBytes("UTF-8"));
	}

	public static String decrypt(byte[] cipherText, String encryptionKey) throws Exception {
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding ", "SunJCE");
		SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
		cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(IV.getBytes("UTF-8")));
		return new String(cipher.doFinal(cipherText), "UTF-8");
	}

	/**
	 * Well, MD5
	 * @param str the string
	 * @return the md5
	 * @throws Exception Ya' know
	 */
	public static String md5(String str) throws Exception {
		MessageDigest m = MessageDigest.getInstance("MD5");
		m.update(str.getBytes(), 0, str.length());
		return new BigInteger(1, m.digest()).toString(16);
	}
}
