package com.onebill.training.assign.collections;

import java.util.Comparator;

public class SortByStudentName implements Comparator<StudentClass> {

	@Override
	public int compare(StudentClass o1, StudentClass o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
