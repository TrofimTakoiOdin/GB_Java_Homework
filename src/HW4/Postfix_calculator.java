package HW4;

import java.util.Scanner;
import java.util.Stack;

public class Postfix_calculator {
    public static void main(String[] args) {
        String[] str = UserInput();
        double result = Calculus(str);
        System.out.println("Искомый ответ: " + result);
    }

    private static Scanner user_in = new Scanner(System.in);

    private static String[] UserInput(){
        System.out.println("Введите ваше выражение на одной строке. Числа и символы через пробел.");
        System.out.println(">> ");
        String str = user_in.nextLine();
        String[] strings = str.split(" ");
        return strings;
    }

    private static boolean is_number(String str) throws NumberFormatException {
        try {
            Double.parseDouble(str);
            return true;
        }
        catch (NumberFormatException ex) {
            return false;
        }
    }
    private static double Calculus(String[] arr) {
        Stack<Double> stack = new Stack<Double>();

        for (int i = 0; i < arr.length; i++) {
            if (is_number(arr[i])) {
                stack.push(Double.parseDouble(arr[i]));
            }
            else {
                if (stack.size() >= 2){
                    double temp1 = stack.pop();
                    double temp2 = stack.pop();
                    switch (arr[i]) {
                        case "+":
                            stack.push(temp1 + temp2);
                            break;
                        case "-":
                            stack.push(temp2 - temp1);
                            break;
                        case "*":
                            stack.push(temp1 * temp2);
                            break;
                        case "/":
                            stack.push(temp2 / temp1);
                            break;
                        case "^":
                            stack.push((double) Math.pow(temp2, temp1));
                            break;
                        default:
                            break;
                    }

                }
                else {
                    System.out.println("Введено некорректное действие! Допустимы знаки:\n " +
                            "\"+\" - сложение\n \"-\" - вычитание\n \"/\" - деление\n \"*\" - умножение\n" +
                            "\"^\" - возведение в степень (слева от ^ показатель степени!)");
                    System.exit(0);
                }
            }
        }
        if (stack.size() == 1) {
            double result = stack.pop();
            return result;
        }
        else {
            System.out.println("Случилась ошибка!");
            return 0;
        }

        }
    }

