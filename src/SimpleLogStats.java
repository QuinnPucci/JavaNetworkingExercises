import java.io.*; 

public class SimpleLogStats {
	
	// attributes

	// constructors  


	public static void main(String[] args){
		if (args.length < 1) {
			System.out.println("Input txt file as arg");
			return;
		}

		String fileName = args[0]; // target args
		String line;
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			// FILE PROCESSING
			while ( (line = br.readLine()) != null){
					System.out.println(line);
				}

		} 
		catch (FileNotFoundException e){
			System.err.println(e);
		}
		catch (IOException e){
			System.out.println(e);
		} 


	}
}