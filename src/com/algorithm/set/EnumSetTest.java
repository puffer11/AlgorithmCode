package com.algorithm.set;

import java.util.EnumMap;
import java.util.EnumSet;

public class EnumSetTest {

	public static void main(String[] args) {
		EnumSet<WeekDay> always = EnumSet.allOf(WeekDay.class);
		System.out.println("always = " + always);
		
		EnumSet<WeekDay> never = EnumSet.noneOf(WeekDay.class);
		System.out.println("never = " + never);
		
		EnumSet<WeekDay> workday = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
		System.out.println("workday = " + workday);
		
		EnumSet<WeekDay> mwf = EnumSet.of(WeekDay.MONDAY, WeekDay.WEDNESDAY, WeekDay.FRIDAY);
		System.out.println("mwf = " + mwf);
		
		EnumMap<WeekDay, String> enumMap = new EnumMap(WeekDay.class);
		System.out.println("enumMap = " + enumMap);

	}

}
enum WeekDay {MONDAY, TURSDAY, WEDNESDAY,THURSDAY,FRIDAY, SATURDAY,SUNDAY};
