package Playground;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File("6-1.txt");
		MyFileUtils.makeTextFile(file);
		System.out.println(MyFileUtils.readTextFile(file));
	}
}