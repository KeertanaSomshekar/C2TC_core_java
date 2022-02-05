public class VowelsConsonants {

	public static void main(String[] args) {
		char ch = 'r';
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':	
			System.out.println(ch+" is a vowel");
	
			default: System.out.println(ch+" is a consonant");
		}
	}
}
