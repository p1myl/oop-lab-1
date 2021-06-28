public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            if (isPrime(i))
                System.out.println(i);
        }
    }

    /*

    Метод для определения, является ли число простым

     */
    public static boolean isPrime(int n) {
        for (int i = 3; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
