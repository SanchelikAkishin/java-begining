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
import java.io.IOException;
import java.util.Scanner;

public class CalculArabicNumerals {
    public void arifmeticOperationsArabicNumerals() throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите пункт: ");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Выйти");
            int person = sc.nextInt();
            int result;
            if (person == 5) {
                break;
            } else if (person == 1) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Введите первое число: ");
                    int a = sc.nextInt();
                    if (a > 10 || a < 1) {
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("Число введенное пользователем больше 10 или меньше 1");
                            break;
                        }
                    } else if (a <= 10 && a >= 1) {
                        System.out.println("Введите второе число: ");
                        int b = sc.nextInt();
                        if (b > 10 || b < 1) {
                            try {
                                throw new IOException();
                            } catch (IOException e) {
                                System.out.println("Число введенное пользователем больше 10 или меньше 1");
                                break;
                            }
                        } else if (b <= 10 && b >= 1) {
                            System.out.print("a " + a);
                            System.out.println("b " + b);
                            result = a + b;
                            System.out.println("ответ: " + result);
                        }
                    }
                }
                    } else if (person == 2) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Введите первое число: ");
                    int a = sc.nextInt();
                    if (a > 10 || a < 1) {
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("Число введенное пользователем больше 10 или меньше 1");
                            break;
                        }
                    } else if (a <= 10 && a >= 1) {
                        System.out.println("Введите второе число: ");
                        int b = sc.nextInt();
                        if (b > 10 || b < 1) {
                            try {
                                throw new IOException();
                            } catch (IOException e) {
                                System.out.println("Число введенное пользователем больше 10 или меньше 1");
                                break;
                            }
                        } else if (b <= 10 && b >= 1) {
                            System.out.print("a " + a);
                            System.out.println("b " + b);
                            result = a - b;
                            System.out.println("ответ: " + result);
                        }
                    }
                }
                    } else if (person == 3) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Введите первое число: ");
                    int a = sc.nextInt();
                    if (a > 10 || a < 1) {
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("Число введенное пользователем больше 10 или меньше 1");
                            break;
                        }
                    } else if (a <= 10 && a >= 1) {
                        System.out.println("Введите второе число: ");
                        int b = sc.nextInt();
                        if (b > 10 || b < 1) {
                            try {
                                throw new IOException();
                            } catch (IOException e) {
                                System.out.println("Число введенное пользователем больше 10 или меньше 1");
                                break;
                            }
                        } else if (b <= 10 && b >= 1) {
                            System.out.print("a " + a);
                            System.out.println("b " + b);
                            result = a * b;
                            System.out.println("ответ: " + result);
                        }
                    }
                }
                    } else if (person == 4) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Введите первое число: ");
                    int a = sc.nextInt();
                    if (a > 10 || a < 1) {
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("Число введенное пользователем больше 10 или меньше 1");
                            break;
                        }
                    } else if (a <= 10 && a >= 1) {
                        System.out.println("Введите второе число: ");
                        int b = sc.nextInt();
                        if (b > 10 || b < 1) {
                            try {
                                throw new IOException();
                            } catch (IOException e) {
                                System.out.println("Число введенное пользователем больше 10 или меньше 1");
                                break;
                            }
                        } else if (b <= 10 && b >= 1) {
                            System.out.print("a " + a);
                            System.out.println("b " + b);
                            result = a - b;
                            System.out.println("ответ: " + result);
                        }
                    }
                }
                    } else {
                        System.out.println("Ошибка/ERROR");
                    }
                }
                System.out.println("Программа завершена");
            }
        }


