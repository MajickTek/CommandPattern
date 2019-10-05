package net.mt.main;

import java.util.Scanner;

import net.mt.command.CommandHandler;
import net.mt.command.ICommand;
import net.mt.commands.CommandHelp;
import net.mt.commands.CommandLight;
import net.mt.commands.CommandQuitter;

public class TestClass { // class to test usage of the other classes

	public static void main(String[] args) {
		//----begin command variables----\\
		CommandLight lamp = new CommandLight();
		CommandQuitter exit = new CommandQuitter();
		CommandHelp helpList = new CommandHelp();
		//----end command variables----\\

		
		CommandHandler cmdh = new CommandHandler();
		
		//----register commands using shortened lambda operator, ::.----\\
		//this will not compile in Java versions lower than 8.
		cmdh.register("help", "help", helpList::listCommands);
		cmdh.register("on", "on", lamp::turnOn);
		cmdh.register("off", "off", lamp::turnOff);
		cmdh.register("quit", "quit", exit::doQuit);
		cmdh.register("exit", "exit", exit::doQuit);
		//----end command registration----\\
		
		//cmdh.execute("on"); // sample of how to use this function


		
		Scanner input = new Scanner(System.in); // catch user input from, well, the input stream.
		
		System.out.print("Input a command:"); // provide a prompt so the user knows what they are doing.
		
		while (input.hasNext()) { // loop over user input. hasNext is a String method.
			String string = (String) input.next(); // input.next is String anyways but this is for clarity.
			
			cmdh.execute(string); // execute the user input. If there is no command, an error will be printed.
			System.out.print("\nInput a command:"); // repeat the prompt.

		}
	}

}
