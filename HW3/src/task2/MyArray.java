package task2;

import java.util.ArrayList;

/*
Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа по парно.
 */
public class MyArray {
    private int[] array;
    private int[] array2;


    /**
     * конструктор принимающий 2 массива
     * @param array массив 1
     * @param array2 массив 2
     */
    public MyArray(int[] array, int[] array2) {
        this.array = array;
        this.array2 = array2;
    }

    /**
     * метод стравнения двух массивов
     * @param array1 1 массив
     * @param array2 2 массив
     * @return результат
     * @param <T> обобщение
     */
    public static <T> boolean compareArrays(T[] array1, T[] array2) {

        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;

    }
}


