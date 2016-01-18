import java.util.Scanner;

public class Animal {
	public static final double FAVNUMBER = 1.1680;
	
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private byte age;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float height;
	
	protected static int numberOfAnimals = 0;
	
	static Scanner userinput = new Scanner(System.in);
	
	public Animal() {
		numberOfAnimals++;
		
		int sumOfNumbers = 5 + 1;
		System.out.println("5 + 1 = " + sumOfNumbers);
		
		System.out.print("Enter the name: \n");
		if (userinput.hasNextLine()) {
			this.setName(userinput.nextLine());
		}
		
		this.setFavoriteChar();
		this.setUniqueID();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the hasOwner
	 */
	public boolean isHasOwner() {
		return hasOwner;
	}

	/**
	 * @param hasOwner the hasOwner to set
	 */
	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	/**
	 * @return the age
	 */
	public byte getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(byte age) {
		this.age = age;
	}

	/**
	 * @return the uniqueID
	 */
	public long getUniqueID() {
		return uniqueID;
	}

	/**
	 * @param uniqueID the uniqueID to set
	 */
	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("Unique ID set to: " + this.uniqueID);
	}
	
	/**
	 * @param uniqueID the uniqueID to set
	 */
	public void setUniqueID() {
		this.uniqueID = (long) (Math.random() * 1000000);
		System.out.println("Unique ID set to: " + this.uniqueID);
	}

	/**
	 * @return the favoriteChar
	 */
	public char getFavoriteChar() {
		return favoriteChar;
	}

	/**
	 * @param favoriteChar the favoriteChar to set
	 */
	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}
	
	/**
	 * @param favoriteChar the favoriteChar to set
	 */
	public void setFavoriteChar() {
		int randomNum = (int) (Math.random() *126) + 1;
		this.favoriteChar = (char) randomNum;
		
		if (randomNum == 32) {
			System.out.println("Favorite char is space.");
		}
		else if (randomNum == 10) {
			System.out.println("Favorite char is newline.");
		}
		else {
			System.out.println("Favorite char is " + this.favoriteChar);
		}
		
		if ((randomNum > 97) && (randomNum < 122)) {
			System.out.println("Favorite char is a lowercase letter.");
		}
		else if (((randomNum > 97) && (randomNum < 122)) || ((randomNum > 64) && (randomNum < 91))) {
			System.out.println("Favorite char is a letter.");
		}
		
		int whichIsBigger = (50 > randomNum) ? 50 : randomNum;
		System.out.println("Bigger: " + whichIsBigger);
		
		switch (randomNum) {
		case 8:
			System.out.println("Fav char is backspace.");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("Fav char is something.");
		default:
			System.out.println("Nothing.");
			break;
		}
	}

	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	
	protected static void countTo(int startingNumber) {
		for (int i = startingNumber; i <= 10; i++) {
			if (i == 8) continue;
			System.out.println(i);
		}
	}
	
	protected static String printNumbers(int maxNumbers) {
		int i = 1;
		while (i < (maxNumbers / 2)) {
			System.out.println(i);
			i++;
			
			if (i == (maxNumbers / 2)) break;
		}
		
		Animal.countTo(maxNumbers/2);
		
		return "Done with that method.";
	}
	
	public static void guessMyNumber() {
		int number;
		
		do {
			System.out.println("Guess numebr up to 100.");
			
			while (!userinput.hasNextInt()) {
				String numberEntered = userinput.next();
				System.out.printf("%s is not a number.\n", numberEntered);
			}
			
			number = userinput.nextInt();
		} while (number != 50);
	}

	public String makeSound() {
		return "Grrr...";
	}
	
	public static void speakAnimal(Animal randAnimal) {
		System.out.println("Animal says: " + randAnimal.makeSound());
	}
	
	public static void main(String[] args) {
		Animal theAnimal = new Animal();
		System.out.println(theAnimal.makeSound());
		
		int[] favoriteNumbers = new int[20];
		favoriteNumbers[0] = 100;
		
		String[] stringArray = {"one", "two", "three", "four"};
		for (String word : stringArray) {
			System.out.println(word);
		}
	}
}
