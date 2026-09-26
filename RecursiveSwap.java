public class RecursiveSwap {
    public static void main(String[] args) {
        String messageToSwap = "pots&pans";
        reverseMessage(messageToSwap);
    }

    public static void reverseMessage(String message) {
        if(message.length() <= 1) {
            System.out.print(message);
        } else {
            System.out.print(message.charAt(message.length()-1));
            reverseMessage(message.substring(0, message.length()-1));
        }
    }
}
