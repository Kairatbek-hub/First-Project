package arabic_number;

public class ArabicNumberImpl implements ArabicNumberInterface {

    public void arabicNum(String[] strNumber) {
        int[] numbers = new int[2];
        // Turns every value in the numbersStr array into an integer
        // and puts it into the numbers array.
        numbers[0] = Integer.parseInt( strNumber[0] );
        numbers[1] = Integer.parseInt( strNumber[2] );
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[0] <= 10 & numbers[0] > 0 & numbers[1] <= 10 & numbers[1] > 0) {
                char operator = strNumber[1].charAt(0);
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
                    // operator doesn't match any case constant (+, -, *, /)
                    default:
                        System.out.println("Error operator!");
                        return;
                }
                System.out.println("Чыгуу:");
                System.out.println(result);
            } else {
                System.out.println("Error");
            }
            break;
        }
    }
}
