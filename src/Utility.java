public class Utility {

    public static boolean getReason(String word, String possibleAnswer, String[] Answers) {
        for (int k = 0; k < word.length() * getFactorial(word.length() - 1); k++) {
            if (possibleAnswer.equals(Answers[k])) {
                return false;
            }
        }
        return true;
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
