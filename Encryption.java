import java.util.Scanner;

public class Encryption {


    static String encrypt(String text, int shift) {
        String encrypted = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            encrypted += (char)(ch + shift);
        }
        return encrypted;
    }


    static String decrypt(String text, int shift) {
        String decrypted = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            decrypted += (char)(ch - shift);
        }
        return decrypted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int shift = 3;

        String encryptedText = encrypt(text, shift);
        System.out.println("Encrypted Text: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}