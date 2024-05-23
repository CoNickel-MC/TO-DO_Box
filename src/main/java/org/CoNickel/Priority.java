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

	public static Priority getEm(String str){
		switch (str){
			case ("Ehhh") -> {
				return Ehhh;
			}
			case ("CanDo") -> {
				return CanDo;
			}
			case ("NeedToDo") -> {
				return NeedToDo;
			}
			case ("IMPORTANT") -> {
				return IMPORTANT;
			}
			default -> {
				return null;
			}
		}


	}
}
