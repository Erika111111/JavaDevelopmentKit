package circles.sprites;

import common.MainCanvas;
import common.Sprite;

import java.awt.*;
import java.util.Random;

public class Ball extends Sprite {
    private static final Random random = new Random();
    private Color color;
    private float vX; // величина изменения х
    private float vY; // величина изменения у

    public Ball(int x, int y){
        super(x, y);
        halfHeight = 20 + random.nextFloat(50);
        halfWidth = halfHeight;
        color = new Color(random.nextInt());
        vX = 100 + random.nextFloat(200);
        vY = 100 + random.nextFloat(200);
    }

    @Override
    // метод изменения координаты спрайта
    public void update(MainCanvas canvas, float deltaTime) {
        x += vX * deltaTime;
        y += vY * deltaTime;

        if (getLeft() < canvas.getLeft()){
            setLeft(canvas.getLeft());
            vX = -vX;
        }
        if (getRight() > canvas.getRight()){
            setRight(canvas.getRight());
            vX = -vX;
        }
        if (getTop() < canvas.getTop()){
            setTop(canvas.getTop());
            vY = -vY;
        }
        if (getBottom() > canvas.getBottom()) {
            setBottom(canvas.getBottom());
            vY = -vY;
        }
    }

    @Override
    // метод отрисовки шара
    public void render(MainCanvas canvas, Graphics g) {
        g.setColor(color); // установка цвета рисования
        g.fillOval((int) getLeft(), (int) getTop(), (int) getWidth(), (int) getHeight());
    }
}
