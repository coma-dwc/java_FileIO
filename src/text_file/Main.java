package text_file;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//	private static List<String> readTextLines(File file) throws IOException {
//		return Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
//	}
//	
//	private static void handleLine(String line) {
//		System.out.println(line);
//	}
//	
//	private static void writeTextsToFile(File file, List<String> texts) throws IOException {  //この関数の実行にはIOExceptionが発生する可能性があるためメソッド宣言にはthrow IOExceptionを付加
//		FileOutputStream fos = new FileOutputStream(file);  //ファイルを書き込むためのFileOutputStreamを作成
//		try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos, "utf-8"))) {  //OutputStreamに対してUTF-8で文字列を書き込むためのOutputStreamWriterを作成し、それをBufferedWriterでラップ
//			//try with resourceを使用しているので、処理が終わるとBufferedWriterとその関連リソースはクローズされる
//			for(String text : texts) {
//				writer.write(text);  //write()メソッドを使用して1行を書き込み、
//				writer.newLine();  //その後newLine()メソッドを使用して改行文字を出力
//			}
//		}
//	}
//	
//	
//	
//	
//	public static void main(String[] args) throws IOException {
//		List<String> texts = Arrays.asList(
//				"この文字列をファイルに書き込みます。",
//				"2行目です。"
//		);
//		File file = new File("5-1.txt");
//		writeTextsToFile(file, texts);
//		
//		//書き込んだデータをコンソールに出力
//		for(String line : readTextLines(file)) {
//			handleLine(line);
//		}
//	}
//}


///Files#writeを使う
//writeTextsToFileをFiles#writeを使って書き換え
import java.util.Arrays;
import java.util.List;

public class Main {
	private static List<String> readTextLines(File file) throws IOException {
		return Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
	}
	
	private static void handleLine(String line) {
		System.out.println(line);
	}
	
	private static void writeTextsToFile(File file, List<String> texts) throws IOException {  
		Files.write(file.toPath(), texts, StandardCharsets.UTF_8);
	}
	
	public static void main(String[] args) throws IOException {
		List<String> texts = Arrays.asList(
				"この文字列をファイルに書き込みます。",
				"2行目です。"
		);
		File file = new File("5-1.txt");
		writeTextsToFile(file, texts);
		
		//書き込んだデータをコンソールに出力
		for(String line : readTextLines(file)) {
			handleLine(line);
		}
	}
}