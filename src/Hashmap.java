import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
	
	public static void main(String[] args)throws IOException 
	{
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		
		Scanner sc=new Scanner(System.in);
		
		NumberToWord word=new NumberToWord();
		
		File file = new File("Hashmap.txt");
		
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		String Content="";
	
		int num=0;
		
		while(1>0)
		{
		
		System.out.println("Enter a number: (Enter -1 to quit)");
		
		num=sc.nextInt();
		
		if(num==-1)
		{
			break;
		}
		
		System.out.println("You entered "+word.convert(num));
		
		if(myMap.containsKey(num)==false)
		{
			myMap.put(num, word.convert(num));
		
		}
		
		}
				
		for (Integer key : myMap.keySet()) {
			
			Content+=key+" "+myMap.get(key)+"\n";	    
		}
		bw.write(Content);
		bw.close();
		
		Scanner scannerInput = new Scanner(file);//note that Scanner can read from a file!
        while (scannerInput.hasNextLine()) {
            String line = scannerInput.nextLine();
            System.out.println(line);
        }
	
			
	}
	
	

}
