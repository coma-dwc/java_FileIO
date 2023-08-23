package binary_make;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

///FileOutputStreamを使う
//FileOutputStreamを使ってバイナリデータをFileに保存するwriteBinaryToFileを完成させる

//public class Main {
//	private static List<String> readTextLines(File file) throws IOException {
//		return Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
//	}
//	
//	private static void handleLine(String line) {
//		System.out.println(line);
//	}
//	
//	private static void writreBinaryToFile(File file, byte[] data) throws IOException {
//		try(FileOutputStream fos = new FileOutputStream(file)) {  //ファイルを書き込むためのFileOutputStreamを作成
//			fos.write(data);  //OutputStreamのwrite()メソッドを使ってデータをファイルに書き込む
//		}
//	}
//	//try with resourceを使用しているので、処理が終わるとFileOutputStreamはクローズされる
//	
//	public static void main(String[] args) throws IOException {
//		File file = new File("4-1.txt");
//		String text = "この文字列をファイルに書き込みます。 \n2行目です。 \n";
//		writreBinaryToFile(file, text.getBytes("UTF-8"));
//		
//		//書き込んだデータをコンソールに出力
//		for(String line : readTextLines(file)) {
//			handleLine(line);
//		}
//	}
//}


//データの追加書き込みに対応する
//writeBinaryToFileをデータの追加書き込みが出来るように改良
//第3引数のappendがtrueの場合追加書き込み / falseの場合、既存のファイルがあったとしても無視して新規でファイルを作成

public class Main {
	private static List<String> readTextLines(File file) throws IOException {
		return Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
	}
	
	private static void handleLine(String line) {
		System.out.println(line);
	}
	
	private static void writeBinaryToFile(File file, byte[] data, boolean append) throws IOException {
		try(FileOutputStream fos = new FileOutputStream(file, append)) {
			fos.write(data);
		}
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File("4-2.txt");
		String text = "この文字列をファイルに書き込みます。 \n2行目です。 \n";
		writeBinaryToFile(file, text.getBytes("UTF-8"), false);
		
		//再度同じファイルに追加書き込み
		writeBinaryToFile(file, text.getBytes("UTF-8"), true);
		
		//書き込んだデータをコンソールに出力
		for(String line : readTextLines(file)) {
			handleLine(line);
		}
	}
}