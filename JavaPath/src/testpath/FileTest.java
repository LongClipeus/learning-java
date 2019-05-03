<<<<<<< HEAD
package testpath;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.home") + File.separator);
		Path inputPath;
		if (args.length < 1) {
			System.out.println("su dung tap tin FileTest");
			inputPath =  Paths.get("src/testpath/FileTest.java");
		} else {
			inputPath = Paths.get(args[0]);
		}
		Path fullPath = inputPath.toAbsolutePath();

		System.out.println("Full path: " + fullPath);
	}

}
=======
package testpath;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {

	public static void main(String[] args) {
		try {
			String strDirectoy = "test";
			String strManyDirectories = "dir1/dir2/dir3";

			// Create one directory
			boolean success = (new File(strDirectoy)).mkdir();
			if (success) {
				System.out.println("Directory: " + strDirectoy + " created");
			}
			// Create multiple directories
			success = (new File(strManyDirectories)).mkdirs();
			if (success) {
				System.out.println("Directories: " + strManyDirectories + " created");
			}

		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}

}
>>>>>>> 1354a08afa6df9e0cddcc39073694f14a3e27693
