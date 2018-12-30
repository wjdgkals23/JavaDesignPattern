package inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// πŸ¿Ã∆Æ ¥‹¿ß¿« ¿Œ«≤ æ∆øÙ«≤

public class FileInputOutputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream inputStream = null;
		
		try {
			inputStream = new FileInputStream("C:\\java\\workspace\\javadesignpattern\\TEST.txt");
			StringBuilder sb = new StringBuilder("");
			
			while(true) {
				try {
					int temp = inputStream.read();
					String tmp = Character.toString((char)temp);
					
					if(temp == -1) break;
					sb.append(tmp);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(inputStream != null ) inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
