class Main {
    public static void main(String[] args) {
        System.out.println("enter your word: ");
        String word = System.console().readLine();

        int length = word.length() - 1;
        int counter = 0;
        boolean endProgram = false;

        while (endProgram == false) {
            while (counter < length / 2) {
                if (word.charAt(counter) == word.charAt(length)) {

                    counter++;
                    length--;
                    System.out.println("letter matched");
                }

                else {
                    endProgram = true;
                    System.out.println("not a palindrome");
                }
            }
        }

        if (counter > length && endProgram == false) {
            System.out.println("PALINDROME!!!!!!");
        }

    }
}