package Playground;

//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
//import java.util.List;
//
//public class MyFileUtils {
//	private static List<String> texts = Arrays.asList(
//			"プレイグラウンドです",
//			"ここまでに学習した成果を発揮してファイルの読み書きを行う！",
//			"ファイトー！✊"
//	);
//	public static void makeTextFile(File file) throws IOException {
//		//fileに任意のテキストを書き込む
//		FileOutputStream fos = new FileOutputStream(file);
//		try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos, "utf-8"))) {
//			for(String text : texts) {
//				writer.write(text);
//				writer.newLine();
//			}
//		}
//	}
//	
//	public static String readTextFile(File file) throws IOException {
//		//fileから読み込んだテキストを返す
//		try(FileInputStream fis = new FileInputStream(file)) {
//			byte[] buf = new byte[(int)file.length()];
//			fis.read(buf);
//			return new String(buf, "UTF-8");
//		}
//	}
//}

///Playground
//MyFileUtilsの以下のメソッドを完成させて動作を確認

//makeTextFile(File file)
//引数のファイルに任意の文字列を書き込む
//書き込む文字列は定義済みのtextsを使っても良いが別の内容でも良い
//readTextFile(File file)
//引数のファイルのテキスト全体を読み込んで、それをStringとして返す



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;  

public class MyFileUtils {
	private static List<String> texts = Arrays.asList(
			"プレイグラウンドです",
			"ここまでに学習した成果を発揮してファイルの読み書きを行う！",
			"ファイトー！✊"
	);

public static void makeTextFile(File file) throws IOException {
    FileOutputStream fos = new FileOutputStream(file);
    try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos,"utf-8"))){
      for(String text : texts){
        writer.write(text);
        writer.newLine();
      }
    }
  }

  public static String readTextFile(File file) throws IOException {
    try(FileInputStream fis = new FileInputStream(file)){
      byte[] buf = new byte[(int)file.length()];
      fis.read(buf);
      return new String(buf,"UTF-8");
    }
  }
}