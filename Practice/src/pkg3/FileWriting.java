package pkg3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWriting {
  public static void main(String[] args) throws IOException {
	File file=new File("C:\\Demo\\Dta.text");
	file.createNewFile();
	FileOutputStream fileOutputStream=new FileOutputStream(file);
	ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
	Emp e1=new Emp("abc", 1, 1000.0, null);
	objectOutputStream.writeObject(e1);
	objectOutputStream.close();
	 
}
}
