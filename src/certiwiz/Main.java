package certiwiz;

import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		boolean unlimited = Cipher.getMaxAllowedKeyLength("RC5") >= 256;
		System.out.println("Unlimited cryptography enabled: " + unlimited);
	}

}
