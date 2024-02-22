package Module3.ClassWork;

public class Test1 {

    private static String reverseString(String s) {
        String reversed = "";

        for (int i = s.length()-1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    private static StringBuilder reverseWordsInSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words) {
            stringBuilder.append(reverseString(word) + " ");
        }

        return stringBuilder;
    }

    public static void main(String[] args) {
        System.out.println(reverseWordsInSentence("Dobby is free"));
    }

}
