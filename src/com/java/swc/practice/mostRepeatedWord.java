package com.java.swc.practice;

public class mostRepeatedWord {

	public static void main(String[] args) {
		String words[] = { "arch", "apple", "apple", "apple", "application", "apples", "applications", "apple",
				"application", "banana", "banapple" };

		String prefix = "ap";

		String finalWord = mostRepeatedWordFinder(words, prefix);

		System.out.println("Most repeated word: " + finalWord);

	}

	public static String mostRepeatedWordFinder(String[] words, String prefix) {

		String filteredWords[] = new String[words.length];

		for (int i = 0; i < words.length; i++) {
			String wordMatch = null;
			for (int j = 0; j < prefix.length(); j++) {

				boolean charIsSame = false;

				charIsSame = words[i].charAt(j) == prefix.charAt(j);

				if (charIsSame == false) {
					break;
				}
				if ((prefix.length() - 1 == j) && charIsSame) {
					wordMatch = words[i];
				}
			}
			for (int x = 0; x < words.length; x++) {
				if (filteredWords[x] == null) {
					filteredWords[x] = wordMatch;
					wordMatch = null;
				}
			}

		}
		int nonNull = 0;
		for (int i = 0; i < filteredWords.length; i++) {
			if (filteredWords[i] != null) {
				nonNull++;
			}
		}

		// for checking on the most repeated word:
		String wordTemp = null;
		int counter = 1;
		int maxCounter = 1;

		for (int i = 0; i < nonNull; i++) {
			for (int j = 0; j < nonNull; j++) {
				if (i == j) {
					continue;
				}
				if (filteredWords[i].equals(filteredWords[j])) {
					counter++;
				}
			}
			if (counter > maxCounter) {
				maxCounter = counter;
				wordTemp = filteredWords[i];
			}
			counter = 1;
		}
//		System.out.println("most repeated word: " + wordTemp);

		return wordTemp;
	}
}
