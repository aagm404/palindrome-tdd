package com.atividade.palindrome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SentenceInspectorTest {

	@Test
	public void aSingleDigitTest() {
		SentenceInspector sentenceInspector = new SentenceInspector();
		String zero = "0";
		String one = "1";
		
		assertEquals(true, sentenceInspector.isPalindrome(zero));
		assertEquals(true, sentenceInspector.isPalindrome(one));
	}
	
	@Test
	public void aSingleCharSuccessTest() {
		SentenceInspector sentenceInspector = new SentenceInspector();
		String capitalLetter= "A";
		String tinyLetter = "a";
		
		assertEquals(true, sentenceInspector.isPalindrome(capitalLetter));
		assertEquals(true, sentenceInspector.isPalindrome(tinyLetter));
	}
	
	@Test
	public void aSingleCharFailureTest() {
		SentenceInspector sentenceInspector = new SentenceInspector();
		String exclamationMark = "!";
		String questionMark = "?";
		String apostrophe = "'";
		String period = ".";
		String semicolon = ";";
		String comma = ",";
		String forwardSlash = "/";
		String asterisk = "*";
		String percent = "%";
		String blankSpace = " ";
		String underscore = "_";
		
		assertEquals(false, sentenceInspector.isPalindrome(exclamationMark));
		assertEquals(false, sentenceInspector.isPalindrome(questionMark));
		assertEquals(false, sentenceInspector.isPalindrome(apostrophe));
		assertEquals(false, sentenceInspector.isPalindrome(period));
		assertEquals(false, sentenceInspector.isPalindrome(semicolon));
		assertEquals(false, sentenceInspector.isPalindrome(comma));
		assertEquals(false, sentenceInspector.isPalindrome(forwardSlash));
		assertEquals(false, sentenceInspector.isPalindrome(asterisk));
		assertEquals(false, sentenceInspector.isPalindrome(percent));
		assertEquals(false, sentenceInspector.isPalindrome(blankSpace));
		assertEquals(false, sentenceInspector.isPalindrome(underscore));
	}
	
	@Test
	public void onlyDigitsSuccessTest() {
		SentenceInspector sentenceInspector = new SentenceInspector();
		String date = "02/02/2020";
		String dateAndTime = "11/11/11 11:11 ";
		String sequence1 = "123321";
		String sequence2 = "00-01100-0";
		String sequence3 = "#1.2%3(4)5\"6-7+8=_9|9^8~7'6{5];4?3@2>1<";
		
		
		assertEquals(true, sentenceInspector.isPalindrome(date));
		assertEquals(true, sentenceInspector.isPalindrome(dateAndTime));
		assertEquals(true, sentenceInspector.isPalindrome(sequence1));
		assertEquals(true, sentenceInspector.isPalindrome(sequence2));
		assertEquals(true, sentenceInspector.isPalindrome(sequence3));
	}
	
	@Test
	public void onlyDigitsFailureTest() {
		SentenceInspector sentenceInspector = new SentenceInspector();
		String date = "20/20/2020";
		String dateAndTime = "05/07/1990 03:42 ";
		String sequence1 = "50897";
		String sequence2 = "12-01100-98";
		String sequence3 = "#7.2%3(4)5\"607+8=_9|9^8~7'6{5];4?3@2>10<";
		
		assertEquals(false, sentenceInspector.isPalindrome(date));
		assertEquals(false, sentenceInspector.isPalindrome(dateAndTime));
		assertEquals(false, sentenceInspector.isPalindrome(sequence1));
		assertEquals(false, sentenceInspector.isPalindrome(sequence2));
		assertEquals(false, sentenceInspector.isPalindrome(sequence3));
	}
	
	@Test
	public void aSingleWordSuccessTest() {
		SentenceInspector sentenceInspector = new SentenceInspector();
		String word1 = "madam";
		String word2 = "Rotator";
		String word3 = "bob";
		String word4 = "madam";
		String word5 = "mAlAyAlam";
		String word6 = "%(m).a_d a   m^[]";
		
		assertEquals(true, sentenceInspector.isPalindrome(word1));
		assertEquals(true, sentenceInspector.isPalindrome(word2));
		assertEquals(true, sentenceInspector.isPalindrome(word3));
		assertEquals(true, sentenceInspector.isPalindrome(word4));
		assertEquals(true, sentenceInspector.isPalindrome(word5));
		assertEquals(true, sentenceInspector.isPalindrome(word6));
	}
	
	@Test
	public void aSingleWordFailureTest() {
		SentenceInspector sentenceInspector = new SentenceInspector();
		String word1 = "xyz";
		String word2 = "elephant";
		String word3 = "Country";
		String word4 = "keyboard";
		
		assertEquals(false, sentenceInspector.isPalindrome(word1));
		assertEquals(false, sentenceInspector.isPalindrome(word2));
		assertEquals(false, sentenceInspector.isPalindrome(word3));
		assertEquals(false, sentenceInspector.isPalindrome(word4));
	}
	
	@Test
	public void sentenceSuccessTest() {
		SentenceInspector sentenceInspector = new SentenceInspector();
		String sentece1 = "Able was I, ere I saw Elba";
		String sentece2 = "Madam I’m Adam";
		String sentece3 = "Step on no pets.";  
		String sentece4 = "Top spot!";
		String sentece5 = "/A/b*l(e)   ` w{as I},||| ere <I >...saw$$$ Elba";
		
		assertEquals(true, sentenceInspector.isPalindrome(sentece1));
		assertEquals(true, sentenceInspector.isPalindrome(sentece2));
		assertEquals(true, sentenceInspector.isPalindrome(sentece3));
		assertEquals(true, sentenceInspector.isPalindrome(sentece4));
		assertEquals(true, sentenceInspector.isPalindrome(sentece5));
	}
	
	@Test
	public void sentenceFailureTest() {
		SentenceInspector sentenceInspector = new SentenceInspector();
		String sentece1 = "Top . post!";
		String sentece2 = "Wonderful-fool";
		String sentece3 = "Wild imagination!";  
		String sentece4 = "Automated Software Testing";
		
		assertEquals(false, sentenceInspector.isPalindrome(sentece1));
		assertEquals(false, sentenceInspector.isPalindrome(sentece2));
		assertEquals(false, sentenceInspector.isPalindrome(sentece3));
		assertEquals(false, sentenceInspector.isPalindrome(sentece4));
	}
}
