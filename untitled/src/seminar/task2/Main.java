package seminar.task2;

/**
 * Описать собственную коллекцию – список на основе массива.
 * Коллекция должна иметь возможность хранить любые типы данных, иметь методы добавления и удаления элементов.
 */
public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Andrey");
        myArrayList.add("Anna");
        myArrayList.add("Alena");
        myArrayList.add("Elena");
        System.out.println(myArrayList);
        myArrayList.remove(0);
        System.out.println(myArrayList);
        myArrayList.remove("Anna");
        System.out.println(myArrayList);


    }
}
