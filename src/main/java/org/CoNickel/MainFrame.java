package org.CoNickel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
	addButton addButton;
	public MainFrame() {
		addButton = new addButton();
		add(addButton);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ReInit();
	}

	void ReInit() {


		pack();
	}
}

class addButton extends JButton implements ActionListener {
	public addButton() {
		setFocusable(false);
		setIcon(new ImageIcon("src/main/resources/addButton.png"));
		setBounds(20,20,50,50);
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("h");
		addTaskFrame addFrame = new addTaskFrame();
	}
}
