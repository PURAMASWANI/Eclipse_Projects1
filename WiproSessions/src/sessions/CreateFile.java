package sessions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
public class CreateFile {

	public static void main(String[] args) {
		//Append the file
		/*try {
			FileWriter fw=new FileWriter("Tech.txt");
			fw.write(" new line added");
			fw.close();
			System.out.println("File Added Successfully");
		}
		catch(IOException e) {
			e.printStackTrace();
		}*/
		// Deleting the file which your are created
		/*File file=new File("Tech.txt");
		if(file.delete()) {
			System.out.println("File Deleted That your are created");
		}
		else {
			System.out.println("File not found");
		}*/
		String content ="Hello - This is the File you created Successfully";
				try(BufferedWriter bw=new BufferedWriter(new FileWriter("Tech.txt"))){
					bw.write(content);
				}catch (IOException e) {
					e.printStackTrace();
				}
				//Reading file from the Above Written file
				try(BufferedReader br=new BufferedReader(new FileReader("Tech.txt"))){
					String line;
					while((line=br.readLine()) != null) {
						System.out.println(line);
					}
					}
			        catch(IOException e)
			        {
				    e.printStackTrace();
			   }
					
				
				
				
		/*try {
			BufferedReader br=new BufferedReader(new FileReader("Tech.txt"));
			String line;
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}br.close();
		}*/
		// TODO Auto-generated method stub
		
		//this will worked later!!
		/*try {
			File file=new File("Tech.txt");
			if(file.createNewFile()) {
				System.out.println("File created Successfully");
				int ch;
				while((ch=fr.read()) !=-1) {
					System.out.println(char)ch);
				}
			}
			else {
				System.out.println("Not");
			}
		}*/
				
	}
}
		
		

