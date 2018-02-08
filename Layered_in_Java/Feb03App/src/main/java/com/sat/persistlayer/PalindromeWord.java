package com.sat.persistlayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="words")
public class PalindromeWord {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="word")
	private String enteredWord;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEnteredWord() {
		return enteredWord;
	}
	public void setEnteredWord(String enteredWord) {
		this.enteredWord = enteredWord;
	}
}
