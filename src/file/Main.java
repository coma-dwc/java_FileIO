package file;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File file = new File("abc.txt");
		System.out.println(file);
		System.out.println(file.getName());
	}
}