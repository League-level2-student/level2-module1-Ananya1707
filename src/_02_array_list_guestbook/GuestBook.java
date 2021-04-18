package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _01_array_list_visualizer.data.ArrayList;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame;
	JPanel panel;
	JButton addButton;
	JButton viewButton;
	ArrayList<String> guestBook = new ArrayList<String>();

	
	
	public static void main(String[] args) {
		GuestBook g = new GuestBook();
		g.run();
		
	}
	
	public void run() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("GuestBook");
		
		panel = new JPanel();
		frame.add(panel);
		
		addButton = new JButton();
		panel.add(addButton);
		addButton.setText("Add Name");
		addButton.addActionListener(this);
		
		viewButton = new JButton();
		panel.add(viewButton);
		viewButton.setText("View Names");
		viewButton.addActionListener(this);
		
		guestBook.add("Bob Banders");
		guestBook.add("Sandy Summers");
		guestBook.add("Greg Ganders");
		guestBook.add("Donny Doners");	
		
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String guestList = ""; 

		if(e.getSource() == addButton) {
			String name = JOptionPane.showInputDialog("Enter a name:");
			guestBook.add(name);
			
		}
		
		if(e.getSource() == viewButton) {
			for(int i = 0; i < guestBook.size(); i++) {
				String guest = guestBook.get(i);
				int guestNum = i + 1;
				guestList = guestList + "Guest #" + guestNum + ": " + guest + "\n";
			}
			JOptionPane.showMessageDialog(null, guestList);
						

		}
		
	}
}
