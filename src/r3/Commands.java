package r3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Commands {

	private Commands() {}
	
	public static List<String> inputFromFile(String filename) throws FileNotFoundException, IOException {
		List<String> commands = new ArrayList<>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line = reader.readLine();
			while (line != null) {
				commands.add(line);
				line = reader.readLine();
			}
		}
		
		return commands;
	}
}
