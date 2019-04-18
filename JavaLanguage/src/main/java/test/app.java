package test;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class app {

	private static final Logger logger = Logger.getLogger("App");

	public static void main(String[] args) {

		// ResourceBundle class will use SystemMessages.properties file
		ResourceBundle resourceBundle = ResourceBundle.getBundle("lang/SystemMessages", Locale.getDefault());
		System.out.println("1:");
		logger.info(resourceBundle.getString("first_name") + ": Armando");
		logger.info(resourceBundle.getString("last_name") + ": Flores");

		// ResourceBundle class will use SystemMessages_es.properties file
		resourceBundle = ResourceBundle.getBundle("lang/SystemMessages", Locale.forLanguageTag("es"));
		System.out.println("\n2:");
		logger.info(resourceBundle.getString("first_name") + ": Armando");
		logger.info(resourceBundle.getString("last_name") + ": Flores");

		// ResourceBundle class will use SystemMessages_fr.properties file
		resourceBundle = ResourceBundle.getBundle("lang/SystemMessages", Locale.FRANCE);
		System.out.println("\n3:");
		logger.info(resourceBundle.getString("first_name") + ": Armando");
		logger.info(resourceBundle.getString("last_name") + ": Flores");
	}

}
