import arabic_number.ArabicNumberImpl;
import roman_number.RomanNumberImpl;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
      ArabicNumberImpl arabicNumber = new ArabicNumberImpl();
      RomanNumberImpl romanNumber = new RomanNumberImpl();

        Scanner scanner = new Scanner( System.in );
        System.out.println("Киргизуу:(1 ден 10 го чейинки араб же рим цифраларын пробел аркылуу жазыныз " +
                "(Мисалы: 2 + 2 же II * V анан Enter))");

        // This inputs the numbers and stores as one whole string value
        // (e.g. if user entered 1 2 3, input = "1 2 3").
        String input = scanner.nextLine();

        // This splits up the string every at every space and stores these
        // values in an array called numbersStr. (e.g. if the input variable is
        // "1 2 3", numbersStr would be {"1", "2", "3"} )
        String[] numbersStr = input.split(" ",3);
        // Checking numbers for type:roman,arabic or non of them
        for (int i = 0; i < numbersStr.length; i++) {
            if((numbersStr[0].equals("I") | numbersStr[0].equals("II") | numbersStr[0].equals("III") | numbersStr[0].equals("IV")
                    | numbersStr[0].equals("V") | numbersStr[0].equals("VI") | numbersStr[0].equals("VII") | numbersStr[0].equals("VIII")
                    | numbersStr[0].equals("IX") | numbersStr[0].equals("X")) & (numbersStr[2].equals("I") | numbersStr[2].equals("II")
                    | numbersStr[2].equals("III") | numbersStr[2].equals("IV") | numbersStr[2].equals("V") | numbersStr[2].equals("VI")
                    | numbersStr[2].equals("VII") | numbersStr[2].equals("VIII") | numbersStr[2].equals("IX") | numbersStr[2].equals("X"))) {
                romanNumber.romanNum(numbersStr);
                break;
            } else if((numbersStr[0].equals("1") | numbersStr[0].equals("2") | numbersStr[0].equals("3") | numbersStr[0].equals("4")
                    | numbersStr[0].equals("5") | numbersStr[0].equals("6") | numbersStr[0].equals("7") | numbersStr[0].equals("8")
                    | numbersStr[0].equals("9") | numbersStr[0].equals("10")) & (numbersStr[2].equals("1") | numbersStr[2].equals("2")
                    | numbersStr[2].equals("3") | numbersStr[2].equals("4") | numbersStr[2].equals("5") | numbersStr[2].equals("6")
                    | numbersStr[2].equals("7") | numbersStr[2].equals("8") | numbersStr[2].equals("9") | numbersStr[2].equals("10"))){

                arabicNumber.arabicNum(numbersStr);
                break;
            } else{
                System.out.println("ERROR");
                break;
            }
        }
    }
}
