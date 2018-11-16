package by.itacademy.hw12;

import java.util.List;



public class Word {
	
	private List <Character> characters;

	public Word(List<Character> characters) {
		super();
		this.characters = characters;
	}

	public List<Character> getOneWord() {
		return characters;
	}

	public void setOneWord(List<Character> characters) {
		this.characters = characters;
	}
	
	public void printWord() {
		for(Character character: characters) {
			System.out.print(character.getSymbol());
		}
		System.out.print("   ");
	}

	@Override
	public String toString() {
	String wordAsString = new String("");
	for(Character character:characters) {
		wordAsString += character.toString();
	}
	return wordAsString;
	}



}
