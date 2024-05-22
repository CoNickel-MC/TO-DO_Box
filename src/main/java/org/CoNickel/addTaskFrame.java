package org.CoNickel;

import javax.swing.*;

import java.util.Arrays;

import static org.CoNickel.Priority.*;


public class addTaskFrame extends JFrame {
	public addTaskFrame() {
		String[] Priorities = Priority.names();
		JComboBox PriorityBox= new JComboBox(Priorities);
		PriorityBox.setBounds(2,2,200,200);


		JTextArea Task = new JTextArea();
		Task.setBounds(2,2,200,200);


		JButton Confirm = new JButton();
		Confirm.setBounds(2,2,200,200);

		setLayout(null);
		add(PriorityBox);
		add(Task);
		add(Confirm);

//		TaskManager.addTask(new TaskPanel(Task.getText(),
//
//
//				Priority[PriorityBox.getSelectedIndex()]));
		//DO DEADLINE
		pack();
		setVisible(true);
	}
}
