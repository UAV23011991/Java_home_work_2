/*
 * Напишите метод, который принимает на вход строку (String) и определяет является
 * ли строка палиндромом (возвращает boolean значение).
 */
package Java.h_w_2;

public class h_w_2_1 {
public static void main(String[] args) {
    System.out.println(hw1("543212345"));
}
    static boolean hw1(String input) {
        String temp = input.replace(" ", "");
        temp = temp.toLowerCase();
        char[] tempArr = temp.toCharArray();
        for (var i = 0; i < tempArr.length-1 / 2; i++) {
            if (tempArr[i] == tempArr[tempArr.length - i -1]) {
                continue;
            } else return false;
        }
        return true;
    }
    
}
