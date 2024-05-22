package org.CoNickel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static org.CoNickel.constant.*;

public class TaskPanel extends JPanel {
	String Task;
	Priority priority;
	JButton deleteButton;

	public TaskPanel(String task, Priority p) {
		setPreferredSize(new Dimension(TaskPanelWidth, TaskPanelHeight));
		Task = task;
		priority = p;
//		deleteButton.addActionListener(this);
	}

	void delete(){
		TaskManager.deleteTask(this);
	}


}

class TaskManager {
	static ArrayList<TaskPanel> Tasks = new ArrayList<>();
	public static void deleteTask(TaskPanel task) {
		Tasks.remove(task);
		Main.frame.ReInit();
	}

	public static void addTask(TaskPanel task) {
		Tasks.add(task);
		Main.frame.ReInit();
	}
}
