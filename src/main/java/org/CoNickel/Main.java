package org.CoNickel;

import javax.swing.*;
import java.io.IOException;

class Main {
	public static MainFrame frame;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		StorageManager.getTasks();
		frame = new MainFrame();
	}
}