public class Main {
    public static void main(String[] args) {
        int base = 3;
        int exponent = 15;
        int modulus = 10;

        String binaryExponent = toBinary(exponent);
        int potencyValue = squareAndMultiplyRecursive(base, binaryExponent, modulus);

        print(binaryExponent, potencyValue);
    }

    public static String toBinary(int exponent) {
        StringBuilder binaryNumber = new StringBuilder();

        while (exponent > 0) {
            if (exponent % 2 == 0) binaryNumber.insert(0, "Q");
            else binaryNumber.insert(0, "QM");

            exponent /= 2;
        }

        return binaryNumber.toString();
    }

    public static int squareAndMultiply(int base, String binaryExponent, int modulus) {
        int result = base;
        int countMultiplications = 0;

        for (int i = 2; i < binaryExponent.length(); i++) {
            if (binaryExponent.charAt(i) == 'Q') result = (result * result) % modulus;
            else result = (result * base) % modulus;
            countMultiplications++;
        }
        System.out.println("Multiplications: " + countMultiplications);
        return result;
    }

    public static int squareAndMultiplyRecursive(int base, String binaryExponent, int modulus) {
        if (binaryExponent.length() == 0) return 1;

        char lastDigit = binaryExponent.charAt(binaryExponent.length() - 1);
        int result = squareAndMultiplyRecursive(base, binaryExponent.substring(0, binaryExponent.length() - 1), modulus);

        if (lastDigit == 'Q') result = (result * result) % modulus;
        else result = (result * base) % modulus;

        return result;
    }

    public static void print(String binaryExponent, int potencyValue) {
        System.out.println("Potency Value: " + potencyValue);
        System.out.println("Binary String: " + binaryExponent);
    }
}