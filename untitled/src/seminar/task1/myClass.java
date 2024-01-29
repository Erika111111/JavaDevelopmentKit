package seminar.task1;

import java.io.DataInput;
import java.io.InputStream;

public class myClass <T extends Comparable<T>,V extends InputStream & DataInput,K extends Number>{
    private T variable1;
    private V variable2;
    private K variable3;

    public myClass(T variable1, V variable2, K variable3) {
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.variable3 = variable3;
    }

    public T getVariable1() {
        return variable1;
    }

    public V getVariable2() {
        return variable2;
    }

    public K getVariable3() {
        return variable3;
    }

    public void printName(){
        System.out.println("Имя класса для переменной  Т :" + variable1.getClass().getName());// метод возвращает имя класса
        System.out.println("Имя класса для переменной  V :" + variable2.getClass().getName());
        System.out.println("Имя класса для переменной  K :" + variable3.getClass().getName());
    }


}
