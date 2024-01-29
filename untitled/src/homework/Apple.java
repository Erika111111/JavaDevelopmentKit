package homework;

public class Apple implements Fruit{
    private static final float weightApple = 1.0f;

    @Override
    public float getWeight() {
        return weightApple;
    }

    @Override
    public String toString() {
        return "Apple";
    }
}
