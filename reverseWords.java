package questions;

public class reverseWords {
    public static void main(String[] args) {
        String str = "prasad prs as ds";
        String words[] = str.split("\\s+");

        StringBuilder reverseSen = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reverseSen.append(reversedWord.reverse()).append(" ");
        }

        System.out.println(reverseSen);
    }
}
