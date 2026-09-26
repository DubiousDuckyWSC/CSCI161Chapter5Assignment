public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(power(2, 6));
    }
    private static double power(int x, int n) {
        int result = x;
        for (int i = 1; i < n; i++) {
            result*=x;
        }
        return result;
    }
}
