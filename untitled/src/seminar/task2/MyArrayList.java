package seminar.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] arr;
    private int size;

    public MyArrayList() {
        arr = new Object[10];
    }

    // метод добавления элемента в массив с проверкой есть ли еще место для добавления
    public void add(T element) {

        if (arr.length >= size) {
            Object[] arr2 = new Object[arr.length * 2];// создаем новый массив умножая  длину старого на 2
            System.arraycopy(arr, 0, arr2, 0, arr.length); // копируем
            arr = arr2; // переместили данные из первого массива во второй
        }
        arr[size++] = element;
    }

    public void remove(int index) {
        System.arraycopy(arr, index + 1, arr, index, arr.length - 1 - index); // использование метода для удаления элемента. мы перезаписываем массив в тот же самый массив, только начиная с позиции после удаляемого
        size--;
    }

    public void remove(T element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) { // т.е. мы идем по массиву и если наш очередной элемент массива равен элементу удаляемому то мы его удаляем
                remove(i); // после того как нашли удаляемый элемент в массиве вызвали метод ремув первый и удалилил его
                size--;
                return;

            }
        }
    }

    @Override
    public String toString() {
        StringBuilder strB = new StringBuilder();
        strB.append("[");
        if (size != 0) {
            strB.append(arr[0]);
        }
        for (int i = 1; i < size; i++) {
            strB.append(", ");
            strB.append(arr[i]);
        }
        strB.append("]");
        return strB.toString();
    }
}



