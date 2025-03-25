import java.util.Scanner;

class PalindromeeChecker {
    // Attribute
    private String text;

    // Constructor
    public PalindromeeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Removing special characters & converting to lowercase
        int left = 0, right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
        }
    }

    public static void main(String[] args) {
        // Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();

        // Creating an object of PalindromeChecker
        PalindromeeChecker checker = new PalindromeeChecker(input);

        // Displaying the result
        checker.displayResult();

        scanner.close();
    }
}
