package a_1_checked_exceptions;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Driver {

	public static void main(String[] args) {
		// Get the file reference
		Path path = Paths.get("F:\\2018\\git_code\\COMP228_003_W2018\\exceptions_classwork\\src\\checked_exceptions\\output.txt");

		// Use try-with-resource to get auto-closeable writer instance
		BufferedWriter writer;
			try {
				System.out.println("ss");
				writer = Files.newBufferedWriter(path);
				writer.write("Hello Worldhjhjjh !!");
				System.out.println("ss");
				writer.flush();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
