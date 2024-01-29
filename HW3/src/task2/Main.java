package task2;


import java.util.Arrays;

import static task2.MyArray.compareArrays;

/*
Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа по парно.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{1,2,3,4};
        Integer[] arr2 = new Integer[]{1,2,3,4};
        System.out.println(compareArrays(arr1, arr2));

        String[] str1 = new String[]{"hy", "its", "my"};
        String[] str2 = new String[]{"df", "ers", "as"};
        System.out.println(compareArrays(str1, str2));


    }



}
