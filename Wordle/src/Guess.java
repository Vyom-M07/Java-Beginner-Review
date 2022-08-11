
public class Guess {

        private String guess;
        private String target;
        private char[] result = new char[5];

        public Guess(String guess, String target) {

                this.guess = guess;
                this.target = target;
                match();

        }

        private char[] match() {

                result = new char[5];
                char[] guessArray = guess.toUpperCase().toCharArray();
                char[] targetArray = target.toUpperCase().toCharArray();

                for (int i = 0; i < 5; i++) {

                        char cw = targetArray[i];
                        char ci = guessArray[i];

                        if (cw == ci) {
                                result[i] = ci;
                                targetArray[i] = 0;
                        }

                        else {
                                boolean foundMatch = false;

                                for (int j = 0; j < 5; j++) {
                                        if (ci == targetArray[j]) {
                                                result[i] = Character.toLowerCase(ci);
                                                targetArray[j] = 0;
                                                foundMatch = true;
                                                break;
                                        }

                                }
                                if (foundMatch == false) {
                                        result[i] = '*';
                                }
                        }

                }

                return result;
        }

        public char[] getResults() {
                return result;
        }
}