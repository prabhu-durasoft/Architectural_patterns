package com.sat.pl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sat.bl.Palindrome;

@RestController
public class WordComponent {
	
	@Autowired
	private Palindrome palindrome;
	
	@GetMapping("/word/{enteredWord}")
	public String display(@PathVariable String enteredWord) {
		boolean isPalindrome = palindrome.check(enteredWord);
		palindrome.storeWord(enteredWord);
		if(isPalindrome)
			return "Yes it's a palindrome";
		return "No. It's not a palindrome";
	}
}


//http://localhost:8080/word/{yourword}
	//http://localhost:8080/word/saturday
	//http://localhost:8080/word/verizon