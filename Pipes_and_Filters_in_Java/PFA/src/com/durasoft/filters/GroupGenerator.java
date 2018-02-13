package com.durasoft.filters;

import java.util.ArrayList;
import java.util.List;

import com.durasoft.data.Group;
import com.durasoft.data.Student;

public class GroupGenerator implements Filter{
	
	public Object performOperation(Object data) {
		List<Student> studentsList = (List<Student>)data;
		return generateGroups(studentsList);
	}
	private List<Group> generateGroups(List<Student> studentsList){
		List<Group> groups = new ArrayList<>();
		while(studentsList.size() > 0) {
			int randomIndex = (int)(Math.random() * (studentsList.size() - 1));
			Student student1 = studentsList.get(randomIndex);
			studentsList.remove(randomIndex);
			
			randomIndex = (int)(Math.random() * (studentsList.size() - 1));
			Student student2 = studentsList.get(randomIndex);
			studentsList.remove(randomIndex);
			Group group = new Group(student1,student2);
			groups.add(group);
		}
		return groups;
	}
}
