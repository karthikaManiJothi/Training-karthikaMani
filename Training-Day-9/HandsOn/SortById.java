package com.onebill.training.day9.handson;

import java.util.Comparator;

public class SortById  implements Comparator<EmployeeDemo>{

	@Override
	public int compare(EmployeeDemo o1, EmployeeDemo o2) {
		return o1.emp_id -o2.emp_id;
	}

       
	}

