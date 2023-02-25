import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Enter a message: ");
            String message = scan.nextLine();

            System.out.println("Enter a secret key (between -25 and 25): ");
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
            System.out.println("Would you like to encode another message? (y/n)");
            String answer = scan.nextLine();
            if (!answer.equalsIgnoreCase("y") || !answer.equalsIgnoreCase("Y")) {
                running = false;
            }
        }
        scan.close();
    }
}
