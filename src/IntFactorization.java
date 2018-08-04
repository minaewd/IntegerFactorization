public class IntFactorization {
    public static void main(String[] args) {
        trialDivision(65);
    }

    /*
    Метод позволяет найти все простые числа меньше или равные введенного значения.
    Представляет собой реализацию решета Эратосфена
     */
    private static int[] sieveOfEratosthenes(int factorNumber) {
        int[] tempArray = new int[factorNumber];
        for (int i=2; i<factorNumber; i++) tempArray[i] = 1;
        for (int k=2; k*k<factorNumber; k++){
            if (tempArray[k] == 1) {
                for (int j = k * k; j<factorNumber; j += k) tempArray[j] = 0;
            }
        }
        return tempArray;
    }

    /*
    Метод позволяет факторизовать введенное число на простые множители методом подбора делителей
     */
    private static StringBuffer trialDivision(int factorNumber) {
        int[] primes = sieveOfEratosthenes(factorNumber);
        String result = "";
        for (int i=2; i<primes.length; i++) {
            if (primes[i] == 1) {
                while ((factorNumber % i == 0) & (factorNumber != 0)) {
                    factorNumber = factorNumber / i;
                    result += Integer.toString(i) + " * ";
                }
            }
        }
        StringBuffer str = new StringBuffer(result);
        str.delete(str.length()-3, str.length());
        return str;
    }
}
