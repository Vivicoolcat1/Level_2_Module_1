package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Name");
	JButton button2 = new JButton("View Names");
	ArrayList <String>	names = new ArrayList <String>();
	public static void main(String[] args) {
		new GuestBook().createUCI();

	
	
	}
	void createUCI(){	frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.setVisible(true);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name;
		if(e.getSource()==button1) {
			 name= JOptionPane.showInputDialog(null,"Enter in a name" );
			names.add(name);
		}
		
		else if (e.getSource()==button2) {
			String list="";
			
		for (int i = 0; i < names.size(); i++) {
		list+="Guest #" + i +":" + names.get(i) + "\n"  ;
			
		}
		JOptionPane.showMessageDialog(null,list);	
	}
		
		

	}
	
}
