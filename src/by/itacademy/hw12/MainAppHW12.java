package by.itacademy.hw12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainAppHW12 {

	static String redText = null;
	static String path = "d:\\my\\HW12\\src\\by\\itacademy\\hw12\\textdoc.txt";
	static String[] paragraphAsStrings = null;
	static String[] sentenceAsStrings = null;
	static String[] wordAsStrings = null;
	static File file = new File("d:\\\\my\\\\HW12\\\\src\\\\by\\\\itacademy\\\\hw12\\\\textdocresult.txt");
	static FileWriter writer;

	public static void main(String[] args) {

		redText = FileUtil.read(path);
		// PrintUtil.print(redText);
		paragraphAsStrings = redText.split("\t");
		// System.out.println("a");
		List<Character> tempCharacters = null;
		List<Word> tempPhrase = null;
		List<Phrase> tempParagraph = null;
		List<Paragraph> tempText = new ArrayList<Paragraph>();
		String resultText = new String();
		for (String paragraphAsString : paragraphAsStrings) {
			if (!paragraphAsString.equals("")) {
				tempParagraph = new ArrayList<Phrase>();
				// paragraph = paragraph.concat(" ");
				sentenceAsStrings = paragraphAsString.split("\\.");

				// System.out.println("a");
				for (String sentenceAsString : sentenceAsStrings) {
					tempPhrase = new ArrayList<Word>();

					// sentenceAsString = sentenceAsString.concat(".");
					wordAsStrings = sentenceAsString.split(" ");

					for (String wordAsString : wordAsStrings) {

						// wordAsString = wordAsString.concat(" ");
						tempCharacters = new ArrayList<Character>();
						for (char ch : wordAsString.toCharArray()) {
							tempCharacters.add(new Character(ch));
						}
						Word word = new Word(tempCharacters);
						tempPhrase.add(word);

						// word.printWord();
					}
					Phrase phrase = new Phrase(tempPhrase);
					tempParagraph.add(phrase);

				}
				Paragraph paragraph = new Paragraph(tempParagraph);
				tempText.add(paragraph);

			}

		}
		Text text = new Text(tempText);
		//text.printText();
		// System.out.println("a");
		resultText = text.toString();
		System.out.println(resultText);
		
		FileUtil.writeText(text);
		/*try {
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
			writer.write("Hey!");
			
			
			for(Paragraph paragraph : text.getParagraphs()) {
				for(Phrase phrase : paragraph.getSentences() ) {
					for(Word word : phrase.getSentence()) {
						for(Character character : word.getOneWord()) {
							writer.write(character.toString());

						}
						writer.write(" ");
					}
					writer.write(".");
				}
				writer.write("\t");
			}
			
			
			
			
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		
		
		

	}

}
