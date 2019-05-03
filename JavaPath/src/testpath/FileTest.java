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
