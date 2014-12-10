package driving.controller;

import lejos.nxt.Button;
import lejos.nxt.Motor;

public class roboRunner
{
	public static void main(String[] args)
	{
		System.out.println("Austin");
		Motor.B.backward();
		Motor.C.backward();
		Button.waitForAnyPress();
		
		
	}
}
