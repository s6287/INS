import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the plaintext: ");
        String plaintext = scanner.nextLine();

        System.out.print("Enter the key (shift): ");
        int key = scanner.nextInt();

        String ciphertext = encrypt(plaintext, key);
        System.out.println("Ciphertext: " + ciphertext);

        scanner.close();
    }

    private static String encrypt(String plaintext, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char currentChar = plaintext.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                char encryptedChar = (char) ((currentChar + key - 'A' + 26) % 26 + 'A');
                result.append(encryptedChar);
            } else if (Character.isLowerCase(currentChar)) {
                char encryptedChar = (char) ((currentChar + key - 'a' + 26) % 26 + 'a');
                result.append(encryptedChar);
            } else {
                // If the character is not a letter, leave it unchanged
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
