package it.unibs.pajc;
import java.io.*;

public class FileUtil {
	
	public static void print(String fname) { 
		try(
				BufferedReader in = new BufferedReader(new FileReader(fname));
				) { //TRY WITH RESOURCES...
			String line;
			int lineNumber = 1;
			while((line = in.readLine()) != null) {
				System.out.printf("%4d %s\n",lineNumber++, line);
			}
		}catch(IOException ex) {
			
		}
	}
	public static void dump(String fname) {
		try (DataInputStream in = new DataInputStream(
				new BufferedInputStream(
				new FileInputStream(fname)))
				)
		{
			byte b;
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; ; i++) {
				b = in.readByte();
						
				if(i % 16 == 0) {
					if(sb.length() > 0) {
						System.out.printf("  %s", sb.toString());
						sb = new StringBuilder();
					}
					System.out.printf("\n%04X  ",i);
				}
				System.out.printf("%02X ", b);
				
				sb.append( (b >= 32 && b <= 127) ? (char)b : ' ');
			}
	} catch(EOFException ex) {
		//tutto ok...
	}
	catch(Exception exc) {
			//gestire il problema che si genera...
		}
		
	} 
}
