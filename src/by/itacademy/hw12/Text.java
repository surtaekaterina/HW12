package by.itacademy.hw12;

import java.util.List;

public class Text {
	List <Paragraph> paragraphs;

	public List<Paragraph> getParagraphs() {
		return paragraphs;
	}

	public void setParagraphs(List<Paragraph> paragraphs) {
		this.paragraphs = paragraphs;
	}

	public Text(List<Paragraph> paragraphs) {
		super();
		this.paragraphs = paragraphs;
	}
	
	public void printText() {
		for(Paragraph paragraph:paragraphs) {
			paragraph.printParagraph();
		}
		}

	@Override
	public String toString() {
		
		String textAsString = new String("");
		for(Paragraph paragraph:paragraphs) {
			textAsString += paragraph.toString();
		}
		return textAsString;
	}
	
	
	

}
