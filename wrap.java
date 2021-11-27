
class wrap{
    public static void main(String[] args) {
        System.out.println(Wrap("hello world this is just a dummy text for testing", 4));
    }

    // start method
    public static String Wrap(String text,int numberOfWords){
        text = text.strip();
        String wrappedText = "";
        String word = "";
        int wordCounter = 0;
        for (char letter : text.toCharArray()) {
            if(letter == ' '){
                if(wordCounter == numberOfWords){
                    wrappedText += "\n";
                    wordCounter = 0;
                }
                wrappedText += word;
                wrappedText += " ";
                word = "";
                wordCounter += 1;
            }
            else{
                word += letter;
            }
        }
        wrappedText += word;
        word = "";
        wordCounter += 1;
        return wrappedText;
    }
    // end method
}







































