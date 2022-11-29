class Main {
    public static void main(String[] args) {
        System.out.println("enter your word: ");
        String word = System.console().readLine();
        int length = word.length();
        int forward = 0;
        int backward = length - 1;

        // loop through the word one way and save
        // loop through the word the opposit wsy and save
        // compare words

        while (backward > forward) {
            char forwardChar = word.charAt(forward++);
            char backwardChar = word.charAt(backward--);
            if (forwardChar != backwardChar) {
                // do something
            }

        }

    }
}