package org.CoNickel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static org.CoNickel.constant.*;

public class TaskPanel extends JPanel implements ActionListener {
	String Task;
	Priority priority;
	JButton deleteButton;
	JLabel taskAsText;

	public TaskPanel(String task, Priority p) {
		setPreferredSize(new Dimension(TaskPanelWidth, TaskPanelHeight));
		Task = task;
		priority = p;

		taskAsText = new JLabel(Task);
//		taskAsText.set

		add(taskAsText);




		deleteButton = new JButton();
		deleteButton.setIcon(new ImageIcon(new ImageIcon("src/main/resources/dustbinIcon.png").getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH)));
		deleteButton.addActionListener(this);
		deleteButton.setSize(20,30);

		add(deleteButton);
	}

	void delete(){
		TaskManager.deleteTask(this);
	}


	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = getWidth(), h = getHeight();

		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLACK);
		g2d.setStroke(new BasicStroke(5));
		g2d.drawRoundRect(10,10,w-10,h-10,5,5);


		g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		Color color1 = new Color(150,200,150);
		Color color2 = new Color(238,120,244, 250);
		GradientPaint gp = new GradientPaint(0, 0, color1, w, h, color2);
		g2d.setPaint(gp);
		g2d.fillRect(0, 0, w, h);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		delete();
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
