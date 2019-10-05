package net.mt.commands;

public class CommandLight { // sample light switch command
	public void turnOn() {
		System.out.println("The light is on");
		System.out.println("CommandLight.turnOn()");
	}
	
	public void turnOff() {
		System.out.println("the light is off");
		System.out.println("CommandLight.turnOff()");
	}
}
