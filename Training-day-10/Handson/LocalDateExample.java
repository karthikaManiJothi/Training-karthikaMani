package com.onebill.training.day10.handson;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateExample {

	public static void main(String[] args) {
		
     LocalDate today = LocalDate.now();
     System.out.println("Current Date:"+today);
     
     LocalDate somedate = LocalDate.of(2000,3,3);
     System.out.println("Some-value is :"+somedate);
     
     LocalDate fromZone = LocalDate.now(ZoneId.of("Asia/Kolkata"));
     System.out.println("Current Zone :"+fromZone);
     
     LocalDate datefromEpoch = LocalDate.ofEpochDay(365);
     System.out.println("Epoch Date:"+datefromEpoch);
     
     //LocalDate isLeapyear  = LocalDate.of(2014,Month.FEBRUARY,29);
     //System.out.println(isLeapyear);
     
     
	}

}
