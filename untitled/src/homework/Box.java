package homework;

import java.util.ArrayList;
import java.util.List;

// параметр Т использован для обозначения обобщения Box и ограничен Fruit т.е. в коробку нельзя положить ничего кроме фруктов
public class Box <T extends Fruit>{
    private final List<T> container;// список фруктов

    public Box() {
        container = new ArrayList<>();
    }
    void add(T fruit){ // т.е. мы передаем тот фрукт который изначально выбран
        container.add(fruit);
    }
    float getWeight(){
        return container.get(0).getWeight() * container.size();
    }

    }

