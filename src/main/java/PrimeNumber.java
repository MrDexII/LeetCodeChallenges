public class PrimeNumber {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 100; i++) {
            boolean prime = isPrime(i);
            if (prime) {
                System.out.println(i + " ");
                count++;
            }
        }
        System.out.println("Value of prime numbers in 100: " + count);
    }

    public static boolean isPrime(long i) {
        // jeżeli podana liczba to 1 zwróć fałsz
        if (i == 1 || i == 0)
            return false;
            // jeżeli 2 to zwróć prawda
        else if (i == 2)
            return true;

        //jeżeli liczba jest parzysta to zwróć fałsz
        if (i % 2 == 0) {
            return false;
        }
        //jeżeli liczba przez którą dzielimy jest większa
        // niż pierwiastek kwadratowy z sprawdzanej liczby to przestań szukać
        int sqrt = (int) Math.sqrt(i) + 1;
        for (int j = 3; j < sqrt; j += 2) {
            //jeżeli jest nieparzysta i
            // ma resztę z dzielenia, to zwiększ licznik +2
            // następnie kontynuuj sprawdzanie
            if (i % j != 0) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
//https://www.java67.com/2014/01/how-to-check-if-given-number-is-prime.html