package SRC;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Enter a message: ");
            String message = scan.nextLine();

            System.out.println("Enter a secret key (0 - 25): ");
            int keyVal = Integer.parseInt(scan.nextLine());

            String output = "";
            for (int i = 0; i < message.length(); i++) {
                char input = message.charAt(i);

                // check if the character is a letter or a space
                if (Character.isLetter(input)) {
                    // calculate the encoded character
                    char encodedChar = (char)(input + keyVal);
                    // if the encoded character is not a letter, adjust it to wrap around the alphabet
                    if ((Character.isLowerCase(input) && encodedChar > 'z') || (Character.isUpperCase(input) && encodedChar > 'Z')) {
                        encodedChar -= 26;
                    } else if ((Character.isLowerCase(input) && encodedChar < 'a') || (Character.isUpperCase(input) && encodedChar < 'A')) {
                        encodedChar += 26;
                    }
                    // add the encoded character to the output string
                    output += encodedChar;
                } else {
                    // if the character is not a letter, add it to the output string without encoding
                    output += input;
                }
            }
            System.out.println("Encoded Message: ");
            System.out.println(output);

            // prompt the user to continue or exit
            System.out.println("Would you like to decode a message? (y/n)");
            String answer = scan.nextLine().toLowerCase();

            if (answer.equals("y")){
                System.out.println("Enter the message to decode: ");
                String decodeMessage = scan.nextLine();

                System.out.println("Enter a secret key (0 - 25): ");
                int keyVal2 = Integer.parseInt(scan.nextLine());

                String output2 = "";
                for (int i = 0; i < decodeMessage.length(); i++) {
                    char input = decodeMessage.charAt(i);
                    // check if the character is a letter or a space
                    if (Character.isLetter(input)) {
                        // calculate the decoded character
                        char decodedChar = (char)(input - keyVal2);
                        // if the decoded character is not a letter, adjust it to wrap around the alphabet
                        if ((Character.isLowerCase(input) && decodedChar > 'z') || (Character.isUpperCase(input) && decodedChar > 'Z')) {
                            decodedChar -= 26;
                        } else if ((Character.isLowerCase(input) && decodedChar < 'a') || (Character.isUpperCase(input) && decodedChar < 'A')) {
                            decodedChar += 26;
                        }
                        // add the decoded character to the output string
                        output2 += decodedChar;
                    } else {
                        // if the character is not a letter, add it to the output string without decoding
                        output2 += input;
                    }
                }
                System.out.println("Decoded Message: ");
                System.out.println(output2);
                System.out.println("Would you like to quit the program(y/n):");
                String quit = scan.nextLine();
                if (!quit.toLowerCase().contains("n")) {
                    running = false;
                }
            } else if(answer.equals("n")){
                running = false;
            }
        }
        scan.close();
    }
}