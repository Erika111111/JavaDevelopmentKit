package circles.view;

import circles.exceptions.BallsOverflowException;
import common.CanvasRepaintListener;
import common.Interactable;
import common.MainCanvas;
import circles.sprites.Background;
import circles.sprites.Ball;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MainWindow extends JFrame implements CanvasRepaintListener, Thread.UncaughtExceptionHandler {
    private static final int WIDTH = 800;// ширина
    private static final int HEIGHT = 600; // высота
    private static final String TITLE = "Circles"; // заголовок
    private static final int DEFAULT_COUNT_SPRITES = 10; // минимальное количество спрайтов
    private static final int MAX_COUNT_SPRITES = 15; // максимальное количество
    private static final Random random = new Random();

    private Interactable[] sprites; // массив спрайтов
    private int countSprites; // количество спрайтов на экране

    /**
     * конструктор
     */
    public MainWindow(){
        setDefaultCloseOperation(EXIT_ON_CLOSE); // закрытие приложения при закрытии окна
        setSize(WIDTH, HEIGHT); // размер окна
        setTitle(TITLE); // заголовок

        initSprites(); // наш метод
        MainCanvas canvas = new MainCanvas(this); // создается объект MainCanvas это класс который отвечает за отрисовку
        add(canvas); //добавляем на граф экран

        addMouseListener(new MouseListener(this)); // добавляется слушатель нажатий

        setVisible(true); // видимость окна
    }

    private void initSprites() {
        sprites = new Interactable[MAX_COUNT_SPRITES]; // создается массив
        sprites[0] = new Background(); // на нолевой позиции устанавливается фон
        countSprites = 1; // и далее добавляются значения спрайтов до значения дефолт
        for (int i = 1; i < DEFAULT_COUNT_SPRITES; i++) {
            addSprite(random.nextInt(WIDTH), random.nextInt(HEIGHT));
        }
    }

    // метод принимает позицию и в ней создается спрайт(наш класс Ball)
    public void addSprite(int x, int y){
        if (countSprites >= MAX_COUNT_SPRITES){ // если кол во спрайтов >= максимальному кол ву то выдает ошибку(отдельный класс наследник от runtimeexeption)
            throw new BallsOverflowException();
        }
        sprites[countSprites++] = new Ball(x, y);
    }

    // метод удаления спрайта
    public void removeSprite(){
        if (countSprites <= 1){
            return;
        }
        countSprites--;
    }

    // метод который позволяет отрисовывать
    public void onDrawFrame(MainCanvas canvas, Graphics g, float deltaTime){
        update(canvas, deltaTime);
        render(canvas, g);
    }

    // обновить
    private void update(MainCanvas canvas, float deltaTime){
        for (int i = 0; i < countSprites; i++) {
            sprites[i].update(canvas, deltaTime);
        }
    }
    //
    private void render(MainCanvas canvas, Graphics g){
        for (int i = 0; i < countSprites; i++) {
            sprites[i].render(canvas, g);
        }
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        if (e instanceof BallsOverflowException){
            e.fillInStackTrace();
        }
    }
}
