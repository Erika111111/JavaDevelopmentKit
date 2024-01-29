package task1;
/*
Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 */
public class Main {
    public static void main(String[] args) {
        int a = 5;
        double b = 1.4;
        System.out.println(Calculator.sum(a,b));
        System.out.println(Calculator.divide(a,b));
        System.out.println(Calculator.multiply(a,b));


    }
}
