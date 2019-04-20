package testpath;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {

	public static void main(String[] args) {
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
