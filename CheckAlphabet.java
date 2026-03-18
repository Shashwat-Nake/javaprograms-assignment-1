public class CheckAlphabet {
    public static void main(String[] args) {
        char ch = 'A';

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            System.out.println("Alphabet");
        else
            System.out.println("Not Alphabet");
    }
}