package org.CoNickel;

import java.io.*;
import java.util.ArrayList;

public class StorageManager {
	static File storage= new File("src/main/resources/TASKS.txt");;
	static void Save() throws IOException {
		storage.createNewFile();

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(storage));
		oos.writeObject(TaskManager.Tasks);
		oos.close();
	}
	static void getTasks() throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream(storage);
		ObjectInputStream ois = new ObjectInputStream(fin);
		TaskManager.Tasks= (ArrayList<TaskPanel>) ois.readObject();
		ois.close();
	}
}
