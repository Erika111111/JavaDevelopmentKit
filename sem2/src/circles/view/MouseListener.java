package circles.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// наследуется от слушателя нажатий мыши
public class MouseListener extends MouseAdapter {
    private MainWindow mainWindow;

    public MouseListener(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }// принимаем объект MainWindow

    @Override
    // переопределяем метод : используем метод по отпусканию мыши и проверяем какая кнопка мыши была нажата
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1){
            mainWindow.removeSprite(); // удаление спрайта
        } else if (e.getButton() == MouseEvent.BUTTON3) {
            mainWindow.addSprite(e.getX(), e.getY()); // добавление спрайта
        }
    }
}
