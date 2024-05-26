package org.CoNickel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static org.CoNickel.constant.*;

public class MainFrame extends JFrame {
	addButton addButton;
	ArrayList<TaskPanel> Current;
	public MainFrame() {
//		setUndecorated(true);
		setLayout(new GridLayout(1,1));
		Current = new ArrayList<>();


		JPanel topPanel = new JPanel();

		addButton = new addButton();

		//DEBUGGING
		topPanel.setBackground(Color.BLACK);


		topPanel.setPreferredSize(new Dimension(TaskPanelWidth,TaskPanelHeight));
		topPanel.setLayout(new BorderLayout());
		topPanel.add(addButton, BorderLayout.EAST);
		add(topPanel);



		setBackground(new Color(255,255,255));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ReInit();
	}

	void ReInit() {
		setLayout(new GridLayout(TaskManager.Tasks.size()+1,1));

		for (TaskPanel i : Current) {
			remove(i);
		}

		Current.clear();

		for (TaskPanel i : TaskManager.Tasks) {
			add(i);
			Current.add(i);
		}



		pack();
		setResizable(false);
	}
}

class addButton extends JButton implements ActionListener {
	public addButton() {
		setFocusable(false);
		setIcon(new ImageIcon(new ImageIcon("src/main/resources/addButton.png").getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH)));
		setSize(50,50);
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("h");
		addTaskFrame addFrame = new addTaskFrame();
	}
}
