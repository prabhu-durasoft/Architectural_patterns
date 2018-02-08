package com.sat.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sat.persistlayer.PalindromeWord;
import com.sat.persistlayer.PalindromeWordRepository;

@Component
public class Palindrome {

	@Autowired
	private PalindromeWordRepository palindromeWordRepository; 
	
	public boolean check(String enteredWord) {
		char[] splitWordArr = enteredWord.toCharArray();
		String reversedWord = "";
		for (int i = splitWordArr.length -1; i >-1; i--) {
			reversedWord += splitWordArr[i];
		}
		
		return enteredWord.equalsIgnoreCase(reversedWord);
	}

	public void storeWord(String enteredWord) {
		PalindromeWord palindromeWord = new PalindromeWord();
		palindromeWord.setEnteredWord(enteredWord);
		palindromeWordRepository.save(palindromeWord);
	}
	
}
