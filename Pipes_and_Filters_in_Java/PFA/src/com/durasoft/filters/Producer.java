package com.durasoft.filters;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.durasoft.data.Student;

public class Producer implements Filter{
	private String inputFile;
	public Producer(String inputFile) {
		this.inputFile = inputFile;
	}
	public Object performOperation(Object data) {
		return produce();
	}
	private List<Student> produce(){
		List<Student> studentsList = new ArrayList<>();
		Path studentsFilePath = Paths.get(inputFile);
	    Charset charset = Charset.forName("ISO-8859-1");
	    try {
	      List<String> lines = Files.readAllLines(studentsFilePath, charset);
	      lines.forEach(line -> {
	    	  	String[] lineArr = line.split("\\t");
	    	  	String id = lineArr[0];
	    	  	String name = lineArr[1];
	    	  	studentsList.add(new Student(id, name));
	      });
	    } catch (IOException e) {
	      System.out.println(e);
	    }
		return studentsList;
	}

	
}
