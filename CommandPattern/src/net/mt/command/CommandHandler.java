package net.mt.command;

import java.util.HashMap;

public class CommandHandler {
	public static final HashMap<String, ICommand> commandMap = new HashMap<>(); // stores commands (<name, method>)
	public static final HashMap<String, String> usageMap = new HashMap<>(); // stores command usage (<name, usage string>
	
	public static void getCommands() { // is used to print commands and their usages
		usageMap.entrySet().forEach(entry -> { // loops through hashmap entries
			System.out.println("Command: " + entry.getKey() + " | Usage: " + entry.getValue());
		});
	}

	public void register(String commandName, ICommand command) { // puts command name and method into commandMap
		commandMap.put(commandName, command);
	}
	
	public void register(String commandName, String commandUsage, ICommand command) { // same, but also puts usage into usageMap
		commandMap.put(commandName, command);
		usageMap.put(commandName, commandUsage);
	}

	public void execute(String commandName) { // pass your command name to this and run the generic execute command
		ICommand command = commandMap.get(commandName);

		if (command == null) {
			throw new IllegalStateException("No command registered for " + command);
		}

		command.execute();
	}
}
