package com.durasoft.filters;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import com.durasoft.data.Group;

public class Consumer implements Filter{
	private String outputFile;
	public Consumer(String outputFile) {
		this.outputFile = outputFile;
	}
	public Object performOperation(Object data) {
		List<Group> groupsList = (List<Group>)data; 
		return writeToOutput(groupsList);
	}
	
	private boolean writeToOutput(List<Group> groupsList) {
		boolean done = false;
		StringBuffer sb = new StringBuffer();
		groupsList.forEach(group -> {
			sb.append("Group ID: ");
			sb.append(group.getId());
			sb.append(" ");
			sb.append(group.getStudent1().getName());
			sb.append(", ");
			sb.append(group.getStudent2().getName());
			sb.append("\n");
		});
		try {
			Files.write(Paths.get(new File(outputFile).toURI()), sb.toString().getBytes("utf-8"), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
			done = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return done;
	}

	
}
