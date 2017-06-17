package tests;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import r3.Commands;

public class CommandsTest {

	@Test
	public void inputFromFile() throws IOException {
		String currentDir = System.getProperty("user.dir");
		System.out.println(currentDir);
		String filename = currentDir + "\\commands.txt";
		List<String> commands = Commands.inputFromFile(filename);
		assertEquals(3, commands.size());
	}
	
	@Test(expected = FileNotFoundException.class)
	public void inputFromFileException() throws IOException {
		String currentDir = System.getProperty("user.dir");
		System.out.println(currentDir);
		String filename = currentDir + "\\file_does_not_exist.txt";
		Commands.inputFromFile(filename);
	}

}
