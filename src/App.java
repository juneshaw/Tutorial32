import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		String filename = "example.txt";
		File textfile = new File(filename);
		Scanner in = new Scanner(textfile);
		
		int numberLines = in.nextInt();
		System.out.println(numberLines);
		in.nextLine();
		
		int count = 1;
		System.out.println(count + ":" + numberLines);
		while(in.hasNextLine()) {
			System.out.println(count + ":" + in.nextLine());
			count++;
		}
		in.close();
	}
	
}
