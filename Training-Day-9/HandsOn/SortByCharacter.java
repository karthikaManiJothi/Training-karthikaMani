package com.onebill.training.day9.handson;

import java.util.Comparator;

public class SortByCharacter implements Comparator<PersonTreeSet> {

	@Override
	public int compare(PersonTreeSet o1, PersonTreeSet o2) {
		return o1.p1_name.compareTo(o2.p1_name);
	}

		

}
