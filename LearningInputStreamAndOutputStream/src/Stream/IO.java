package Stream;
import java.io.*;
public class IO {
	public static void dump(InputStream src,OutputStream dest) throws IOException{
		try (InputStream input=src;OutputStream output=dest;){
			byte[] data=new byte[1024];
			int lenght=-1;
			while((lenght=input.read(data))!=-1){
				output.write(data,0,lenght);
			}
		} 
	}	
}
