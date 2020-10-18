import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bluak {

	public static void main(String[] args) throws FileNotFoundException  {
		
		
	Scanner input = new Scanner(new File("List.txt"));
	
	List<String> data = new ArrayList<String>();
	
	do {
		data.add(input.nextLine());
		
		
	}while (input.hasNextLine());
	
	
	for(int i = 0 ; i < data.size() ; i++) {
		
		System.out.println(data.get(i));
	}
	
	
		
		
	}
	
	
}
