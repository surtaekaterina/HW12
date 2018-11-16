package by.itacademy.hw12;

import java.util.List;

public class Paragraph {
	private List <Phrase> sentences;

	public Paragraph(List<Phrase> sentences) {
		super();
		this.sentences = sentences;
	}

	public List<Phrase> getSentences() {
		return sentences;
	}

	public void setSentences(List<Phrase> sentences) {
		this.sentences = sentences;
	}
	public void printParagraph() {
		for(Phrase phrase:sentences) {
			phrase.printPhrase();
		}
		}

	@Override
	public String toString() {
		String paragraphAsString = new String("");
		for(Phrase phrase:sentences) {
			paragraphAsString += phrase.toString();
		}
		return paragraphAsString;
	}
	
	
}
