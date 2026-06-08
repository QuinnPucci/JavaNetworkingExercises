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
		int lineCount = 0;
		int twoHunCount = 0;
		int totalBytes = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			// FILE PROCESSING
			while ( (line = br.readLine()) != null){
					lineCount++;
					String[] curLine = line.split(" ");
					// if index 1 is status code 200
					if (curLine[1].equals("200")) {
						twoHunCount++;
						// up the counter
					}
					int curBytes = Integer.parseInt(curLine[2]);
					totalBytes += curBytes;
				}
				System.out.println(lineCount);
				System.out.println(twoHunCount);
				System.out.println(totalBytes);

		} 
		catch (FileNotFoundException e){
			System.err.println(e);
		}
		catch (IOException e){
			System.out.println(e);
		} 


	}
}