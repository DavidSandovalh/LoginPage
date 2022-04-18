package com.login.usuarios.util;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import static org.apache.commons.codec.binary.Base64.decodeBase64;
import static org.apache.commons.codec.binary.Base64.encodeBase64;

import org.springframework.stereotype.Component;


@Component
public class Crypto {
	private final static  String SECRETKEY = "DISTRIBUIDORKEY2"; //llave para encriptar datos
	private final static  String ALG = "AES";
	private final static  String CI = "AES/CBC/PKCS5Padding";
	private final static  String IV = "IVN1DISTRIBUIDOR"; // vector de inicialización
	
	//AES 128
	public String Encriptar(String cleartext) throws Exception {
		Cipher cipher = Cipher.getInstance(CI);
		SecretKeySpec skeySpec = new SecretKeySpec(SECRETKEY.getBytes(), ALG);
		IvParameterSpec ivParameterSpec = new IvParameterSpec(IV.getBytes());
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivParameterSpec);
		byte[] encrypted = cipher.doFinal(cleartext.getBytes());
		return new String(encodeBase64(encrypted));
	}

	
	public String Desencriptar(String encrypted) throws Exception {
		Cipher cipher = Cipher.getInstance(CI);
		SecretKeySpec skeySpec = new SecretKeySpec(SECRETKEY.getBytes(), ALG);
		IvParameterSpec ivParameterSpec = new IvParameterSpec(IV.getBytes());
		byte[] enc = decodeBase64(encrypted);
		cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivParameterSpec);
		byte[] decrypted = cipher.doFinal(enc);
		return new String(decrypted);
	}
	
	public static String Desencriptarstatic(String encrypted) throws Exception {
		Cipher cipher = Cipher.getInstance(CI);
		SecretKeySpec skeySpec = new SecretKeySpec(SECRETKEY.getBytes(), ALG);
		IvParameterSpec ivParameterSpec = new IvParameterSpec(IV.getBytes());
		byte[] enc = decodeBase64(encrypted);
		cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivParameterSpec);
		byte[] decrypted = cipher.doFinal(enc);
		return new String(decrypted);
	}
	
	public static void main(String[] args) {
		try {
			String contraseniaa = Desencriptarstatic("cZV9+gAsvx0PRPC0N7sVxA==");
			System.out.print("contraseniaa::: "+contraseniaa);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
