public class IntFactorization {
    public static void main(String[] args) {
        sieveOfEratosthenes(100);
    }

    /*
    Метод позволяет найти все простые числа меньше или равные введенного значения.
    Представляет собой реализацию решета Эратосфена
     */
    private static int[] sieveOfEratosthenes(int factorNumber) {
        int[] tempArray = new int[factorNumber];
        for (int i=0; i<factorNumber; i++) tempArray[i] = 1;
        for (int k=2; k*k<factorNumber; k++){
            if (tempArray[k] == 1) {
                for (int j = k * k; j<factorNumber; j += k) tempArray[j] = 0;
            }
        }
        return tempArray;
    }
}
