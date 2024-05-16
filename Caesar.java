import java.util.*;
import java.lang.*;

public class CaesarCipher {
    private char Letters[] = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 
    'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' , ' '};

    public String encrypt(String message, int shift) {
        char[] MainMessage = message.toLowerCase().toCharArray();
        StringBuilder encryptedMessage = new StringBuilder();

        for (int i=0; i<message.length(); i++){
            for (int j=0; j<27; j++){
                if (MainMessage[i] == Letters[j]){
                    encryptedMessage.append(Letters[(j+shift)%27]);
                }
            }
        }
        return encryptedMessage.toString();
    }

    public String decrypt(String message, int shift) {
        return encrypt(message, 27-shift); // Since there are 27 characters (including space), subtracting the shift from 27 gives the reverse shift.
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner az = new Scanner(System.in);
        CaesarCipher cipher = new CaesarCipher();

        System.out.println("Enter a message: ");
        String InputLine = az.nextLine();

        String encrypted = cipher.encrypt(InputLine, 3);
        System.out.println("Encrypted message: " + encrypted);

        String decrypted = cipher.decrypt(encrypted, 3);
        System.out.println("Decrypted message: " + decrypted);
    }
}
