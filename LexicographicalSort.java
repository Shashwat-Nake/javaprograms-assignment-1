import java.util.Arrays;

public class LexicographicalSort {
    public static void main(String[] args) {
        String[] words = {"Banana", "Apple", "Mango"};

        Arrays.sort(words);

        for (String w : words)
            System.out.println(w);
    }
}