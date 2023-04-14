import java.util.Arrays;
import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String input = scn.nextLine();

        if (!(input.contains("+") || input.contains("/") || input.contains("-") || input.contains("*"))) {
            try {
                throw new Exception("Cтрока не является математической операцией");
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }

        //System.out.println("Вы ввели: " + input);
        String result = calc(input);
        System.out.println(result);
    }

    public static String calc(String input) {

        Map<Integer, String> tr = new HashMap<Integer, String>();
        tr.put(1, "I");
        tr.put(2, "II");
        tr.put(3, "III");
        tr.put(4, "IV");
        tr.put(5, "V");
        tr.put(6, "VI");
        tr.put(7, "VII");
        tr.put(8, "VIII");
        tr.put(9, "IX");
        tr.put(10, "X");
        tr.put(11, "XI");
        tr.put(12, "XII");
        tr.put(13, "XIII");
        tr.put(14, "XIV");
        tr.put(15, "XV");
        tr.put(16, "XVI");
        tr.put(17, "XVII");
        tr.put(18, "XVIII");
        tr.put(19, "XIX");
        tr.put(20, "XX");
        tr.put(21, "XXI");
        tr.put(22, "XXII");
        tr.put(23, "XXIII");
        tr.put(24, "XXIV");
        tr.put(25, "XXV");
        tr.put(26, "XXVI");
        tr.put(27, "XXVII");
        tr.put(28, "XXVIII");
        tr.put(29, "XXIX");
        tr.put(30, "XXX");
        tr.put(31, "XXXI");
        tr.put(32, "XXXII");
        tr.put(33, "XXXIII");
        tr.put(34, "XXXIV");
        tr.put(35, "XXXV");
        tr.put(36, "XXXVI");
        tr.put(37, "XXXVII");
        tr.put(38, "XXXVIII");
        tr.put(39, "XXXIX");
        tr.put(40, "XL");
        tr.put(41, "XLI");
        tr.put(42, "XLII");
        tr.put(43, "XLIII");
        tr.put(44, "XLIV");
        tr.put(45, "XLV");
        tr.put(46, "XLVI");
        tr.put(47, "XLVII");
        tr.put(48, "XLVIII");
        tr.put(49, "XLIX");
        tr.put(50, "L");
        tr.put(51, "LI");
        tr.put(52, "LII");
        tr.put(53, "LIII");
        tr.put(54, "LIV");
        tr.put(55, "LV");
        tr.put(56, "LVI");
        tr.put(57, "LVII");
        tr.put(58, "LVIII");
        tr.put(59, "LIX");
        tr.put(60, "LX");
        tr.put(61, "LXI");
        tr.put(62, "LXII");
        tr.put(63, "LXIII");
        tr.put(64, "LXIV");
        tr.put(65, "LXV");
        tr.put(66, "LXVI");
        tr.put(67, "LXVII");
        tr.put(68, "LXVIII");
        tr.put(69, "LXIX");
        tr.put(71, "LXXI");
        tr.put(72, "LXXII");
        tr.put(73, "LXXIII");
        tr.put(74, "LXXIV");
        tr.put(75, "LXXV");
        tr.put(76, "LXXVI");
        tr.put(77, "LXXVII");
        tr.put(78, "LXXVIII");
        tr.put(79, "LXXIX");
        tr.put(81, "LXXXI");
        tr.put(82, "LXXXII");
        tr.put(83, "LXXXIII");
        tr.put(84, "LXXXIV");
        tr.put(85, "LXXXV");
        tr.put(86, "LXXXVI");
        tr.put(87, "LXXXVII");
        tr.put(88, "LXXXVIII");
        tr.put(89, "LXXXIX");
        tr.put(90, "XC");
        tr.put(91, "XCI");
        tr.put(92, "XCII");
        tr.put(93, "XCIII");
        tr.put(94, "XCIV");
        tr.put(95, "XCV");
        tr.put(96, "XCVI");
        tr.put(97, "XCVII");
        tr.put(98, "XCVIII");
        tr.put(99, "XCIX");
        tr.put(100, "C");

        // ищем оператора в выражении
        char oper = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                oper = c;
                break;
            }
        }
        //System.out.println("Найден оператор: " + oper);

        //Разделяем выражение на отдельные числа
        String[] parts = input.split("[+-/*]");
        String num1 = parts[0].trim();
        String num2 = parts[1].trim();

        if (parts.length > 2){
            try {
                throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }

        //System.out.println("Первое: " + num1);
        //System.out.println("Второе: " + num2);

        String[] validRim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] validArab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        int arabNum1 = 0;
        int arabNum2 = 0;
        int AraRim = 0;
        if (Arrays.asList(validRim).contains(num1) && Arrays.asList(validRim).contains(num2)) {
            // оба числа находятся в диапазоне римских цифр
            arabNum1 = Arrays.asList(validRim).indexOf(num1) + 1;
            arabNum2 = Arrays.asList(validRim).indexOf(num2) + 1;
            AraRim = 1;
        } else if (Arrays.asList(validArab).contains(num1) && Arrays.asList(validArab).contains(num2)) {
            // оба числа находятся в диапазоне арабских цифр
            arabNum1 = Integer.parseInt(num1);
            arabNum2 = Integer.parseInt(num2);
            AraRim = 2;
        } else {
            try {
                throw new Exception("Используются одновременно разные системы счисления");
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
            //System.out.println("// числа не находятся в диапазоне или находятся в разных диапазонах"); // числа не находятся в диапазоне или находятся в разных диапазонах
        }

        int resu = 0;
        switch (oper) {
            case '+':
                resu = arabNum1 + arabNum2;
                break;
            case '-':
                resu = arabNum1 - arabNum2;
                break;
            case '*':
                resu = arabNum1 * arabNum2;
                break;
            case '/':
                resu = arabNum1 / arabNum2;
                break;
        }

        try {
            if (AraRim == 1 && resu <= 0){
                throw new Exception("В римской системе нет отрицательных чисел");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }


        String result = ("");
        if(AraRim == 1){
            result = tr.get(resu);
        }else if (AraRim == 2){
            result = "" + resu;
        }

        return "Ответ: " + result;
    }
}