package net.mt.commands;

public class CommandQuitter { // generic quit command to end the program
	public void doQuit() {
		System.out.println("CommandQuitter.doQuit() - Task ended.");
		System.exit(0);
	}
}
