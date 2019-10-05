package net.mt.commands;
import net.mt.command.CommandHandler;

public class CommandHelp { // helo command that calls the getCommands method from CommandHandler
	public void listCommands() {
		CommandHandler.getCommands();
	}
}
