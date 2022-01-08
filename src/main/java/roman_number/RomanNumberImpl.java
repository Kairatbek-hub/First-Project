package roman_number;

public class RomanNumberImpl implements RomanNumberInterface {

    public void romanNum(String[] strBlock) {
        for (int i = 0; i < strBlock.length; i++) {
            if ("I".equals(strBlock[i])) {
                strBlock[i] = "1";
            } else if ("II".equals(strBlock[i])) {
                strBlock[i] = "2";
            } else if ("III".equals(strBlock[i])) {
                strBlock[i] = "3";
            } else if ("IV".equals(strBlock[i])) {
                strBlock[i] = "4";
            } else if ("V".equals(strBlock[i])) {
                strBlock[i] = "5";
            } else if ("VI".equals(strBlock[i])) {
                strBlock[i] = "6";
            } else if ("VII".equals(strBlock[i])) {
                strBlock[i] = "7";
            } else if ("VIII".equals(strBlock[i])) {
                strBlock[i] = "8";
            } else if ("IX".equals(strBlock[i])) {
                strBlock[i] = "9";
            } else if ("X".equals(strBlock[i])) {
                strBlock[i] = "10";
            }
        }

        int[] numbers = new int[2];
        numbers[0] = Integer.parseInt(strBlock[0]);
        numbers[1] = Integer.parseInt(strBlock[2]);
        // OPTIONAL: Prints out each value in the numbers array.
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[0] <= 10 & numbers[0] > 0 & numbers[1] <= 10 & numbers[1] > 0) {
                char operator = strBlock[1].charAt(0);
                int result;
                switch (operator) {
                    case '+':
                        result = numbers[0] + numbers[1];
                        break;
                    case '-':
                        result = numbers[0] - numbers[1];
                        break;
                    case '*':
                        result = numbers[0] * numbers[1];
                        break;
                    case '/':
                        result = numbers[0] / numbers[1];
                        break;
                    default:
                        System.out.println("Error operator!");
                        return;
                }
                System.out.println("Чыгуу:");
                convertToRoman(result);
            } else {
                System.out.println("Error numbers");
            }
            break;
        }
    }

    public static void convertToRoman(int number) {
        if (number < 0 || number > 1500) {
            System.out.println("This number cannot be converted");
        } else {
            System.out.println(convert(number));
        }
    }

    public static String romanDigit(int n, String one, String five, String ten) {

        if (n >= 1) {
            if (n == 1) {
                return one;
            } else if (n == 2) {
                return one + one;
            } else if (n == 3) {
                return one + one + one;
            } else if (n == 4) {
                return one + five;
            } else if (n == 5) {
                return five;
            } else if (n == 6) {
                return five + one;
            } else if (n == 7) {
                return five + one + one;
            } else if (n == 8) {
                return five + one + one + one;
            } else if (n == 9) {
                return one + ten;
            }
        }
        return "";
    }

    public static String convert(int number) {
        // L=50,C=100,D=500,M=1000;

        String romanOnes = romanDigit(number % 10, "I", "V", "X");
        number /= 10;
        String romanTens = romanDigit(number % 10, "X", "L", "C");
        number /= 10;
        String romanHundreds = romanDigit(number % 10, "C", "D", "M");
        number /= 10;
        String romanThousands = romanDigit(number % 10, "M", "", "");

        String result = romanThousands + romanHundreds + romanTens + romanOnes;
        return result;

    }
}
