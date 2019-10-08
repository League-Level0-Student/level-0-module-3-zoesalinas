
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "April 7th";
		String dadsBirthday = "September 27th";
		String myBirthday = "August 20th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String input = JOptionPane.showInputDialog("Do you want me to tell you my moms, dads, or my birthday.");
		// 3. Print out what the user typed
		System.out.println(input);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (input.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		if (input.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
if (input.equalsIgnoreCase("my")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
else {
	JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
}
	} 
}
