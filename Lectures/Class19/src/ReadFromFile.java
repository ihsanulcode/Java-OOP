import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		String data = "";
		File file = new File("test.txt");
		try {
			Scanner input = new Scanner(file);
			while(input.hasNext()) {
				data = input.nextLine();
				System.out.println(data);
			}
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		//write to file
		try {
			FileWriter w = new FileWriter("test1.txt");
			w.write(data);
			w.close();
			System.out.println("Data write in another file.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/

	}

}
