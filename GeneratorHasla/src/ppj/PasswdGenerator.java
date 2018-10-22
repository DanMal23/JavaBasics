package ppj;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*Program tworzy haslo skladajace sie
 * z 12 znakow w tym male litere,
 * duze litery, cyfry oraz znaki specjalne.*/
public class PasswdGenerator {

	public static final int maxLength = 3;
	final static Random r = new Random();
	final static String s = "!@#$%^&*(){}[]\\|:\";'<>?,./";
	List<String> result = new ArrayList<>();

	public static String generateP() {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < maxLength; i++) {
			sb.append(s.toCharArray()[(int) (Math.random() * s.length())]);
			sb.append((char) ('a' + Math.random() * ('z' - 'a' + 1)));
			sb.append((char) ('A' + Math.random() * ('Z' - 'A' + 1)));
			sb.append((char) ('0' + Math.random() * ('9' - '0' + 1)));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String thePasswd = PasswdGenerator.generateP();
		System.out.println("Wygenerowane haslo:  " + thePasswd);

	}

}

