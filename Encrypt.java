package siguri;
import java.util.ArrayList;
import java.util.regex.Pattern;


public class Encrypt {

	public static String  encrypt(String plaintext, String key) {
	
		 if (plaintext.length() == 0) {
	            return "\nJu duhet të shkruani tekstin e thjeshtë që dëshironi të enkriptoni.";
	        }

	        if (Pattern.matches("[a-zA-Z0-9 ]+", plaintext)) {
	            char[] plaintextArray = plaintext.replaceAll(" ", "").toCharArray();
	            String[] splitedKey = key.split(" ");

	            StringBuilder getLetters = new StringBuilder();
	            for (int i = 0; i < splitedKey.length; i++) {
	                getLetters.append(splitedKey[i].charAt(0));
	            }

