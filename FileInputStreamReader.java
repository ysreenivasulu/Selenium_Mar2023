package HYRJava;

import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamReader {

	public static void main(String[] args) throws Throwable {
		
		File file=new File("./sample.txt");
		 if(!file.exists())
			 file.createNewFile();
		 
		/* FileInputStream fis=new FileInputStream(file);
		 
		 int asciiCode;
		 while ((asciiCode = fis.read()) != -1)
		 {
			 System.out.print((char)asciiCode);  // use print option and call (char)
		 }
		*/
		 
		 
		 //2)second ways
		 FileInputStream fis=new FileInputStream(file);
		 
		 int Code;
		 String text=new String();
		 while ((Code = fis.read()) != -1)
		 {
			text +=String.valueOf((char)Code);
			 
		 }
		 System.out.println();
		 System.out.println(text);  //  text
		 fis.close();
		 

	}

}
