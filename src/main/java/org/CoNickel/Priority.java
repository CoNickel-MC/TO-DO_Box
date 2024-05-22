package org.CoNickel;

public enum Priority {
	Ehhh, CanDo, NeedToDo, IMPORTANT;
	public static String[] names() {
		Priority[] states = values();
		String[] names = new String[states.length];

		for (int i = 0; i < states.length; i++) {
			names[i] = states[i].name();
		}

		return names;
	}
}
