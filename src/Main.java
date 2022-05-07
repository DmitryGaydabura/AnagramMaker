import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        giveAnagramTo("lander");
    }

    public static void giveAnagramTo(String word) {
        String[] letters = new String[word.length()];
        String possibleAnswer = "";
        int t = 0;

        for (int i = 0; i < word.length(); i++) {
            letters[i] = String.valueOf(word.charAt(i));

        }

        String[] Answers = new String[word.length() * Utility.getFactorial(word.length() - 1)];
        for (int i = 0; i < word.length() * Utility.getFactorial(word.length() - 1); i++) {
            Answers[i] = " ";

        }
        int i = 0;
        while (i < word.length() * Utility.getFactorial(word.length() - 1)) {


            String[] WordBuffer = new String[word.length()];

            for (int f = 0; f < word.length(); f++) {
                WordBuffer[f] = "";
            }


            int j = 0;

            while (j < word.length()) {
                int Rand = (int) (Math.random() * letters.length);
                if (letters[Rand] != null) {
                    WordBuffer[j] += letters[Rand];
                    letters[Rand] = null;
                    j++;
                }
            }


            for (int l = 0; l < word.length(); l++) {
                possibleAnswer += WordBuffer[l];
            }
// метод проверки
            boolean reason;

            reason = Utility.getReason(word, possibleAnswer, Answers);


            if (reason == true) {
                Answers[i] = possibleAnswer;

                i++;
            } else {
                t++;
            }


            for (int k = 0; k < word.length(); k++) {
                WordBuffer[k] = "";
            }
            for (int l = 0; l < word.length(); l++) {
                letters[l] = String.valueOf(word.charAt(l));
            }
            possibleAnswer = "";

        }
        Arrays.sort(Answers);


        for (int j = 1; j < word.length() * Utility.getFactorial(word.length() - 1) + 1; j++) {
            System.out.print(" " + Answers[j - 1]);
            if(j % Utility.getFactorial(word.length() - 1) == 0){
                System.out.println();
            }
        }


    }






}
