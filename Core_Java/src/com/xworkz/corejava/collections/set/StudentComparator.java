package com.xworkz.corejava.collections.set;

public class StudentComparator impements Comparator<Student>

@override
public int compare(Student s1, Student s2) {
	if(s1.getId() < s2.getId())
		return +1;
	
	else if(s1.getId)()> s2.getId())
		return -1;
		
		else
			return 0;
}
