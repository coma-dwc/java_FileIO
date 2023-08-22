package binary_file;

//FileInputStreamを使う
//FileInputStreamを使ってファイルをバイナリとして読み込むreadBinaryFileを完成させる
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
	private static byte[] readBinaryFile(File file) throws IOException {  //関数の実行にIOExceptionが初声ウする可能性
		FileInputStream fis = new FileInputStream(file);  //ファイルを読み込むためのFileInputStreamを作成
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();  //読み込んだバイト列を溜め込むためのByteArrayOutputStreamを作成
			byte[] buf = new byte[4096];  //InputStreamから一度に読み込むバイト列のバッファを作成(new)する
			int n = fis.read(buf);  //InputStreamからバッファにバイト列を読み込み(read)する
			while(n != -1) {  //while文でn != -1になるまで処理を繰り返す(ファイルの最後まで)
				bos.write(buf, 0, n);  //バイト列を溜め込むためのByteArrayOutputStreamにバッファの内容を追加(write)する
				n = fis.read(buf);  //再度InputStreamからバイト列をreadする
			}
			return bos.toByteArray();  //ByteArrayOutputStreamからtoByteArrayメソッドを使って溜め込んだバイト列を取り出す
		}   finally {
			fis.close();  //使用したFileInputStreamをcloseする
		}
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File("2-1.txt");
		byte[] data = readBinaryFile(file);
		System.out.println(new String(data, "utf-8"));
	}
}