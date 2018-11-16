package by.itacademy.hw12;

public class Character {

	private char symbol;

	public Character(char symbol) {
		super();
		this.symbol = symbol;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		//String characterAsString = new String("");
		//characterAsString = String.valueOf(getSymbol());
		//return characterAsString;
		return String.valueOf(symbol);
	}

}
