package homework;

public class Orange implements Fruit{
    private static final float weightOrange = 1.5f;

    @Override
    public float getWeight() {
        return weightOrange;
    }

    @Override
    public String toString() {
        return "Orange";
    }
}
