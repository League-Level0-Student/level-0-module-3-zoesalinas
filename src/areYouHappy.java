import javax.swing.JOptionPane;

public class areYouHappy {
	public static void main(String[] args) {
		System.out.println();
		String Happy = JOptionPane.showInputDialog("Are You Happy?");
		if (Happy.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		} else {
			String answertwo = JOptionPane.showInputDialog("Do you want to be  happy?");

			if (answertwo.equalsIgnoreCase("yes")) {
				String answerthree = JOptionPane.showInputDialog("Change something");
			
			if (answerthree.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing.");
				
			}
			}
		}

	}
}
