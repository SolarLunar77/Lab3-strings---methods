import java.util.Scanner;
public class StringLab {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a word to be capitalized: ");		
		String word = scan.nextLine();
		capitalize(word);
		
		
		System.out.println("Please enter a phrase about Waldo: ");
		String phrase = scan.nextLine();
		System.out.println(wheresWaldo(phrase));
		

		System.out.println("Please enter your first word to be arranged alphabetically: ");
		String a = scan.nextLine();
		System.out.println("Please enter your second word to be arranged alphabetically: ");
		String b = scan.nextLine();
		firstThingsFirst(a, b);
		

		System.out.println("Please enter a word to reverse: ");
		String word2 = scan.nextLine();
		reverse(word2);
		
		
		System.out.println("Please enter a word to letterize vertically: ");
		String word3 = scan.nextLine();
		letterize(word3);
		
		scan.close();
	}
	
	
	
	public static void capitalize(String word) {
	
		System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());
		
	} 
	
	
	public static int wheresWaldo(String phrase) {
		
		return(phrase.indexOf("Waldo"));
		
		//*takes a string and returns the location (index) 
		//*in the string where the word “Waldo” first appears.
		
	}
	
	
	
	public static void firstThingsFirst(String a, String b) {
			 
				char initial = a.charAt(0);
				char second = b.charAt(0);		
				
				if ((int)initial < (int)second) {
					System.out.println(a + " " + b);
				} else if 
					((int)initial > (int)second) {
					System.out.println(b + " " + a);
				} else 
					 {
					System.out.println(b + " " + a);
				}
		
		//*takes two strings, prints the string that comes first alphabetically, 
		//*then prints the other.
	}

	public static void reverse(String s) {
		
		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--){
			reverse = reverse + s.charAt(i);
			
		}
		
		System.out.println(reverse);
		

		
		// takes a string and prints it backwards
		//E.g. for “happy”, it prints “yppah”
		
	}
	
	public static void letterize(String word) {
		
		char letter;
		String firstWord;
		
		
		for (int i = 0; i < word.length(); i++){ 
			letter = word.charAt(i);
			System.out.println(letter);
			
		}
			
		
//		Takes a word. Prints it out one letter per line. 
//		Hint: Use aloop.E.g. for “Java”, it prints 
//		J
//		a
//		v
//		a
	}

}

