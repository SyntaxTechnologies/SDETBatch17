package class26;

public class Q6 {
    public static char findFirstNonRepeatingChar(String str) {
        char [] cArr=str.toCharArray();
        for (char currentChar : cArr) {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (currentChar == c) {
                    count++;
                }
            }
            if (count == 1) {
                return currentChar;
            }
        }
        return 0;
    }
    public static void main(String[] args) {

        char firstNonRepChar = findFirstNonRepeatingChar("abracadabra");
        if (firstNonRepChar != 0) {
            System.out.println("The first non-repeating character is: " + firstNonRepChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
