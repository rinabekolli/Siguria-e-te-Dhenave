package siguri;
import java.util.regex.Pattern;

public class Decrypt {

	public static String decrypt(String ciphertext, String key) {
		 if (ciphertext.length() == 0) {
	            return "\nJu duhet të shkruani ciphertext-in që dëshironi të dekriptoni!";
	        }
	        if (Pattern.matches("[0-9 ]+", ciphertext)) {
	            String[] cipherArray = ciphertext.split(" ");
	            String[] splitKey = key.split(" ");
