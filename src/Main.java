import java.util.Scanner;

public class Main {
    public static boolean chekedDataPalindrome (String data) {
        int len = data.length();
        for (int i = 0; i < len / 2; i++) {
            int idx = len - i - 1;
            if (data.charAt(i) != data.charAt(idx)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        System.out.println(chekedDataPalindrome(data));
    }
}