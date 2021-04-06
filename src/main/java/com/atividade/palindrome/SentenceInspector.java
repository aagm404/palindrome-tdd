package com.atividade.palindrome;

public class SentenceInspector {
	
	public Boolean isPalindrome(String sentence) {
		sentence = prepareSentence(sentence);
		String reversedSentence = new StringBuilder(sentence).reverse().toString();
		
		if (!sentence.isEmpty() && sentence.equals(reversedSentence)) {
			return true;
		}
		
		return false;
	}

	private String prepareSentence(String sentence) {
		sentence = sentence.replaceAll("[^\\w\\d]", "");
		sentence = sentence.replaceAll("[_]", "");
		sentence = sentence.trim().toLowerCase();
		return sentence;
	}
}
