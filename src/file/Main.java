package file;

//Fileクラスを使用するために下記をimport
//import java.io.File;
//
//public class Main {
//	public static void main(String[] args) {
////		File file = new File("abc.txt");
//		File dir = new File("dir1");
//		File file = new File(dir, "abc.txt");
////		File file = new File("dir1/abc.txt");
//		System.out.println(file);
//		System.out.println(file.getName());
//	}
//}


//ファイルの存在確認
//import java.io.File;
//import java.util.Arrays;
//
//public class Main {
//	public static void main(String[] args) {
//		File file1 = new File("abc.txt"); //存在しない
//		File file2 = new File("Main.java"); //存在する
//		
//		for(File file : Arrays.asList(file1, file2)) {
//			System.out.println("File = " + file);
//			System.out.println("exists = " + file.exists());  //exists()返り値boolean
//			System.out.println("isFile = " + file.isFile()); //isFile()返り値boolean
//			System.out.println("isDirectory = " + file.isDirectory());  //isDirectory()返り値boolean
//			System.out.println("length = " + file.length());  //length()返り値long
//		}
//	}
//}


//ディレクトリの作成
import java.io.File;

public class Main {
	public static void main(String[] args) {
		File dir1 = new File("dir1");
		File dir3 = new File("dir1/dir2/dir3");
		
		System.out.println("dir1: " + dir1.isDirectory());
		System.out.println("dir3: " + dir3.isDirectory());
		
		dir1.mkdir();
		dir3.mkdirs();
		
		System.out.println("dir1: " + dir1.isDirectory());
		System.out.println("dir3: " + dir3.isDirectory());
	}
}