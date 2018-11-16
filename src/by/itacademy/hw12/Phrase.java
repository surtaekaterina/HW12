package by.itacademy.hw12;

import java.util.List;

public class Phrase {
	private List <Word> sentence;

	public Phrase(List<Word> sentence) {
		super();
		this.sentence = sentence;
	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}
	
	public void printPhrase() {
		for(Word word:sentence) {
			word.printWord();
		}
			
	}

	@Override
	public String toString() {
		String phraseAsText = new String("");
		for(Word word:sentence) {
			phraseAsText += word.toString();
		}
		return phraseAsText;
	}

}
