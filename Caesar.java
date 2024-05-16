public class Caesar{
public static void main (String[] args){
		Scanner az=new Scanner (System.in);
		char Letters[] = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 
    'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' , ' '};

		
		System.out.println("Enter a message: ");
		String InputLine = az.nextLine();
		char[] MainMessage = InputLine.toLowerCase().toCharArray();
    System.out.println("Encrypted message: ");
    
		for (int i=0; i<InputLine.length(); i++){
		for (int j=0; j<27; j++){
			if (MainMessage [i] == Letters[j]){
				 System.out.print(Letters[(j+3)%27]);
				 }
		 	}
			}
}
}
