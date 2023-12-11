public class Main {
    public static void main(String[] args) {
        int base = 46;
        int exponent = 78;
        int modulus = 1277;

        String binaryExponent = toBinary(exponent);
        int result = squareAndMultiplyRecursive(base, binaryExponent, modulus);

        print(binaryExponent, result);
    }

    public static String toBinary(int exponent) {
        StringBuilder binaryNumber = new StringBuilder();

        while (exponent > 0) {
            binaryNumber.insert(0, exponent % 2);
            exponent /= 2;
        }

        return binaryNumber.toString();
    }

    public static int squareAndMultiply(int base, String binaryExponent, int modulus) {
        int result = base;
        int countMultiplications = 0;

        for (int i = 1; i < binaryExponent.length(); i++) {
            result = (result * result) % modulus;
            if (binaryExponent.charAt(i) == '1') result = (result * base) % modulus;
            countMultiplications++;
        }
        System.out.println("Multiplications: " + countMultiplications);
        return result;
    }

    public static int squareAndMultiplyRecursive(int base, String binaryExponent, int modulus) {
        if (binaryExponent.length() == 0) return 1;

        char lastDigit = binaryExponent.charAt(binaryExponent.length() - 1);
        int result = squareAndMultiplyRecursive(base, binaryExponent.substring(0, binaryExponent.length() - 1), modulus);

        result = (result * result) % modulus;
        if (lastDigit == '1') result = (result * base) % modulus;

        return result;
    }

    public static void print(String binaryExponent, int result) {
        System.out.println("Result: " + result);
        System.out.println("Binary String: " + binaryExponent);
    }
}