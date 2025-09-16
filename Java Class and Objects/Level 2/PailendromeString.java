class PalindromeChecker {
    // Attribute
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if text is a palindrome
    public boolean isPalindrome() {
        String cleaned = text.replaceAll("\\s+", "").toLowerCase(); // remove spaces, ignore case
        int left = 0, right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display result
    public void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: It is a palindrome.\n");
        } else {
            System.out.println("Result: It is NOT a palindrome.\n");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("Madam");
        PalindromeChecker p2 = new PalindromeChecker("Racecar");
        PalindromeChecker p3 = new PalindromeChecker("Hello World");

        p1.displayResult();
        p2.displayResult();
        p3.displayResult();
    }
}
