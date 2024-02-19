/*Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b.
 Данные передаются в одну строку (смотри пример)! Решения, в которых каждое число и арифмитеческая операция передаются с новой строки считаются неверными.
Калькулятор умеет работать как с арабскими (1,2,3,4,5...), так и с римскими (I,II,III,IV,V...) числами.
Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.
Калькулятор умеет работать только с целыми числами.
Калькулятор умеет работать только с арабскими или римскими цифрами одновременно,
при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.
При вводе римских чисел, ответ должен быть выведен римскими цифрами, соответственно, при вводе арабских - ответ ожидается арабскими.
При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.
Результатом операции деления является целое число, остаток отбрасывается.
Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль.
Результатом работы калькулятора с римскими числами могут быть только положительные числа, если результат работы меньше единицы, выбрасывается исключение

 */
public class CalculRomanNumerals {
    private int rNum;

    private static int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    private static String[] letters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public CalculRomanNumerals(int arabic) {
        if (arabic < 1) {
            throw new NumberFormatException("Чсило не может быть отрицательным");
        }
        if (arabic > 3999) {
            throw new NumberFormatException("Число не может быть больше");
        }
        rNum = arabic;
    }

    public CalculRomanNumerals(String roman) {
        if (roman.length() == 0) {
            throw new NumberFormatException("Нет римской цифры");
        }
        roman = roman.toUpperCase();

        int i = 0;
        int arabic = 0;

        while (i < roman.length()) {
            char letter = roman.charAt(i);
            int number = LetToNum(letter);

            if (number < 1) {
                throw new NumberFormatException("Нет такой цифры в римском стиле !");
            }
            i++;

            if (i == roman.length()) {
                arabic += number;
            } else {
                int nextNumber = LetToNum(roman.charAt(i));
                if (nextNumber > number) {
                    arabic += (nextNumber - number);
                    i++;
                } else {
                    arabic += number;
                }
            }
        }
        if (arabic > 3999) {
            throw new NumberFormatException("Не может быть больше допустимого в римском стиле");
        }
        rNum = arabic;
    }

    public int LetToNum(char letter) {
        switch (letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    public String toString() {
        String roman = " ";
        int n = rNum;

        for (int i = 0; i < numbers.length; i++) {
            while (n >= numbers[i]) {
                roman += letters[i];
                n -= numbers[i];
            }
        }
        return roman;
    }

    public int toInt() {
        return rNum;
    }

}