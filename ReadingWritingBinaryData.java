// Java Program to demonstrate Reading Writing Binary Data 
// with InputStream/OutputSream 
import java.io.*; 
class GFG { 
	public static void main(String[] args) 
	{ 
		try { 
			// Writing binary data to a file using 
			// OutputStream 
			byte[] data = { 3, 334, 234, 234, 324, 234 }; 
			OutputStream os 
				= new FileOutputStream("data.bin"); 
			os.write(data); 
			os.close(); 
			// Reading binary data from a file using 
			// InputStream 
			InputStream is 
				= new FileInputStream("data.bin"); 
			byte[] Buffer = new byte[5]; 
			is.read(buffer); 
			is.close(); 
			// Printing the read data 
			for (byte b : Buffer) { 
				System.out.println(b); 
			} 
		} 
		catch (IOException e) { 
			e.printStackTrace(); 
		} 
	} 
}
