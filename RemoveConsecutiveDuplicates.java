public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String input = "aaabbccdee";
        String result = removeConsecutiveDuplicates(input);
        System.out.println("Output: " + result);
    }

    public static String removeConsecutiveDuplicates(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        char previousChar = str.charAt(0);
        sb.append(previousChar);

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar != previousChar) {
                sb.append(currentChar);
                previousChar = currentChar;
            }
        }

        return sb.toString();
    }
}
