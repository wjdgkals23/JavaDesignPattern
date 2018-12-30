package inputoutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DataInputOutputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello Java World!!";
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		try {
			outputStream = new FileOutputStream("C:\\java\\workspace\\javadesignpattern\\TEST.txt");
			dataOutputStream = new DataOutputStream(outputStream);
			
			dataOutputStream.writeUTF(str);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dataOutputStream != null) dataOutputStream.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			try {
				if(outputStream != null) outputStream.close();
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}
	}

}
