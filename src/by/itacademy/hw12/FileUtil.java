package by.itacademy.hw12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

	static File file = new File("d:\\\\my\\\\HW12\\\\src\\\\by\\\\itacademy\\\\hw12\\\\textdocresult.txt");
	static FileWriter writer;

	static String read(String path) {
		FileReader fr = null;
		BufferedReader br = null;
		String line = null;
		StringBuilder text = new StringBuilder();
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {

				text.append(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return text.toString();

	}

	static File writeText(Text text) {
		try {
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
			//writer.write("Hey!");
			
			
			for(Paragraph paragraph : text.getParagraphs()) {
				writer.write("\t");
				for(Phrase phrase : paragraph.getSentences() ) {
					for(Word word : phrase.getSentence()) {
						for(Character character : word.getOneWord()) {
							writer.write(character.toString());

						}
						writer.write(" ");
					}
					writer.write(".");
				}
				writer.write("\n");
			}
			
			
			
			
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return file;
	}
}