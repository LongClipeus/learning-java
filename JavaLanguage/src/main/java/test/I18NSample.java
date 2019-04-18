package test;

import java.util.*;

public class I18NSample {

	static public void main(String[] args) {

		String language;
		String country;

		System.out.print("language: ");
		Scanner input = new Scanner(System.in);
		String lang = input.nextLine();

		if (lang.equals("de")) {
			language = new String("de");
			country = new String("DE");
		} else if (lang.equals("fr")) {
			language = new String("fr");
			country = new String("FR");
		} else {
			language = new String("en");
			country = new String("US");
		}

		Locale currentLocale;
		ResourceBundle messages;

		currentLocale = new Locale(language, country);

		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);

		System.out.println(messages.getString("greetings"));
		System.out.println(messages.getString("inquiry"));
		System.out.println(messages.getString("farewell"));
	}
}