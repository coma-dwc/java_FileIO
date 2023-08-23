package java_textfile;

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;

//public class Main {
//	private static void readTextFile(File file) throws IOException {
//		FileInputStream fis = new FileInputStream(file);
//		try(BufferedReader reader = new BufferedReader(new InputStreamReader (fis, "utf-8"))) {
//			String line = reader.readLine();
//			while(line != null) {
//				handleLine(line);
//				line = reader.readLine();
//			}
//		}
	
//Scannerを使う
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
	
public class Main {
	private static void readTextFile(File file) throws IOException {
		try(Scanner scanner = new Scanner(file, "utf-8")) {
			while(scanner.hasNextLine()) {
				handleLine(scanner.nextLine());
			}
		}
	}
	
	private static void handleLine(String line) {
		System.out.println(line);
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File("3-1.txt");
		readTextFile(file);
	}
}