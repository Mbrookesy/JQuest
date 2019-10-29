package main;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	public void standby(Scanner sc, Character mc) {
		Battle btl = new Battle();
		Random randomGen = new Random();
		int pass = 0;
		
		System.out.println();
		System.out.println("You begin to walk, press enter to continue walking");
		
		do {
			pass = randomGen.nextInt(100);
			System.out.println("Step...");
			if (pass > 50) {
				System.out.println("....!");
				btl.battle(sc, mc);
			}
			System.out.println("...");
			
		}while(pass < 90);
		
		System.out.println("You made it out of the forest");
		
	}

}
