package com.durasoft.data;

public class Group {
	private String id;
	private Student student1;
	private Student student2;
	
	
	
	public Group(Student student1, Student student2) {
		this.student1 = student1;
		this.student2 = student2;
		generateId();
	}
	private void generateId() {
		String id1 = student1.getId().substring(8, student1.getId().length());
		String id2 = student2.getId().substring(8, student1.getId().length());
		this.id = id1 + id2;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Student getStudent1() {
		return student1;
	}
	public void setStudent1(Student student1) {
		this.student1 = student1;
	}
	public Student getStudent2() {
		return student2;
	}
	public void setStudent2(Student student2) {
		this.student2 = student2;
	}
	
}
