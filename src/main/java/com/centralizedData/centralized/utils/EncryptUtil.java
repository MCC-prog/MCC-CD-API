package com.centralizedData.centralized.utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

@Component

public class EncryptUtil {
	
private static final Logger LOGGER = LoggerFactory.getLogger(EncryptUtil.class);
	
	private static EncryptUtil instance;
	private SecretKey key = null;
	private Cipher desCipher = null;

	private EncryptUtil() {
		loadCipher();
	}

	private Cipher loadCipher() {
		try {
			key = getKey("key.dat");
			desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		} catch (NoSuchAlgorithmException e) {
		} catch (NoSuchPaddingException e) {
		}
		return desCipher;
	}

	private SecretKey getKey(String keyFile) {
		ObjectInputStream inStream;
		SecretKey key = null;
		try {
			inStream = new ObjectInputStream(this.getClass().getClassLoader().getResourceAsStream(keyFile));
			key = ((SecretKey) inStream.readObject());
			inStream.close();
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
		}

		return key;
	}

	public synchronized String decryptDES(String encryptedText) {
		if (encryptedText == null)
			return null;
		byte[] byteCipherText = null;
		byteCipherText = Base64.getDecoder().decode(encryptedText);

		String strDecryptedText = null;
		byte[] byteDecryptedText = null;
		try {
			desCipher.init(Cipher.DECRYPT_MODE, key, desCipher.getParameters());
			byteDecryptedText = desCipher.doFinal(byteCipherText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		strDecryptedText = new String(byteDecryptedText);
		return strDecryptedText;
	}

	public static synchronized EncryptUtil getInstance() {
		if (instance == null) {
			instance = new EncryptUtil();
		}
		return instance;
	}

	/**
	 * used to encrypt plain text.
	 * @param plaintext
	 * @return
	 */
	public String encryptDES(String randPass) {
		String strCipherText=null;
		byte[] byteDataToEncrypt = randPass.getBytes();
		byte[] byteCipherText;
		try {
			desCipher.init(Cipher.ENCRYPT_MODE,key);
			byteCipherText = desCipher.doFinal(byteDataToEncrypt);
			strCipherText = Base64.getEncoder().encode(byteCipherText).toString();
			return strCipherText;
		}catch (Exception e) {
			LOGGER.error("error occured in encryptDES in EncryptUtil class.",e);			
		} 
		
		
		return null;
	}


}
