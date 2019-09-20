/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main (String [] args) {
		System.out.println(" _____________________");
		line();
		System.out.println("\\");
		line();
		System.out.println("+\\");
		line();
		System.out.println("++\\");
		leftSide();
		System.out.println("______ |+++\\");
		System.out.println("|            |######||++++\\");
		jLine();
		System.out.println("``````|");
		jLineFull();
		jLineFull();
		jLineFull();
		jLineFull();
		jLineFull();
		System.out.print("|    ________/######|");
		rightSide();
		System.out.print("\n|   /###############/");
		rightSide();
		System.out.print("\n|   |##############/ ");
		rightSide();
		System.out.print("\n|   \\#############/  ");
		rightSide();
		System.out.print("\n|    `````````````   ");
		rightSide();
		System.out.println("");
		System.out.println("|__________________________|");
		System.out.println("\nThe icon for a .java file in the Eclipse IDE.");
	}
	public static void line () {
		leftSide();
		System.out.print("       |");
	}
	public static void leftSide() {
		System.out.print("|             ");
	}
	public static void rightSide() {
		System.out.print("      |");
	}
	public static void jLine () {
		System.out.print("|            |######|");
	}
	public static void jLineFull () {
		jLine();
		rightSide();
		System.out.println("");
	}
}