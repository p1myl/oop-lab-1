public class Palindrome {
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)){
                System.out.printf("%s is a palindrome\n", s);
            } else {
                System.out.printf("%s is not a palindrome\n", s);
            }
        }
    }

    /*

    Метод для получения обратной строки от заданной

     */
    public static String reverseString(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--){
            r += s.charAt(i);
        }
        return r;
    }

    /*

    Метод для определения, является ли строка палиндромом

     */
    public static boolean isPalindrome(String s){
        return reverseString(s).equals(s);
    }
}
