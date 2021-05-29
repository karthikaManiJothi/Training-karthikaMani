package com.onebill.training.day9.handson;

import java.util.Comparator;

public class SortByPersonName implements Comparator<PersonTreeSet>{

	@Override
	public int compare(PersonTreeSet o1, PersonTreeSet o2) {
		return o2.p1_name.compareTo(o1.p1_name);
	}

   
	}


