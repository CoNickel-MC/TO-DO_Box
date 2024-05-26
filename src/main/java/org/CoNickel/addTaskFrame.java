package org.CoNickel;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class addTaskFrame extends JFrame implements ActionListener {
	JTextArea Task;
	JComboBox PriorityBox;
	String[] Priorities;

	public addTaskFrame() {
		Priorities = Priority.names();

		PriorityBox = new JComboBox(Priorities);
		PriorityBox.setBounds(2,2,200,200);



		Task = new JTextArea();
		Task.setBounds(2,2,200,200);


		JButton Confirm;
		Confirm = new JButton();
		Confirm.setBounds(2,2,200,200);
		Confirm.addActionListener(this);

		setLayout(new GridLayout(3,3));
		add(PriorityBox);
		add(Task);
		add(Confirm);


		//DO DEADLINE
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		TaskManager.addTask(new TaskPanel(Task.getText(), Priority.getEm(
				Priorities[
						PriorityBox.getSelectedIndex()
						]
		)));
		System.out.println(TaskManager.Tasks);
		Main.frame.ReInit();
		this.dispose();

	}
}
