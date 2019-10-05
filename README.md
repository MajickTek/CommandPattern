# CommandPattern
Simple example of the command pattern in Java. Provided as an Eclipse project. Keep in mind this will not work on Java versions lower than 8.

## Overview
Let's take a look at the main class, net.mt.main.TestClass.
~~~~Java
CommandHelp helpList = new CommandHelp();

CommandHandler cmdh = new CommandHandler();

cmdh.register("help", "help", helpList::listCommands);
~~~~
This creates an instance of CommandHelp which simply has a public void method called listCommands, and nothing else. We utilize the shortened lambda operator (::) to simplify this.

It then callse CommandHandler.register to build a list of commands.

Here is a breakdown of the register method we have:
~~~~Java
register(commandName, commandUsage, command)
~~~~
There is also a method which does it like this:
~~~~Java
register(commandName, command)
~~~~

the last thing that happens is it calls cmdh.execute(name) to run whatever method it is given via the string name.

You can look in the wiki of this repo for a one-file implementation. Or you can look through the files and read the comments.

