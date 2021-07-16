package Lesson8;

import javax.swing.*;
import java.awt.*;

public class Settings extends JFrame {

    private final JSlider slFieldSize;
    private final JSlider slDotsToWin;

    public Settings(GameWindow gameWindow) {
        setBounds(550, 550, 450, 450);
        setTitle("TicTacToe settings");

        int MIN_FIELD_SIZE = 3;
        int MAX_FIELD_SIZE = 10;
        slFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        slFieldSize.setMajorTickSpacing(1);
        slFieldSize.setPaintTicks(true);
        slFieldSize.setPaintLabels(true);
        slDotsToWin = new JSlider(MIN_FIELD_SIZE, MIN_FIELD_SIZE, MIN_FIELD_SIZE);
        slDotsToWin.setMajorTickSpacing(1);
        slDotsToWin.setPaintTicks(true);
        slDotsToWin.setPaintLabels(true);

        slFieldSize.addChangeListener(e -> slDotsToWin.setMaximum(slFieldSize.getValue()));

        setLayout(new GridLayout(5, 1));
        add(new Label("Choose your Field size:"));
        add(slFieldSize);
        add(new Label("Choose your win line length:"));
        add(slDotsToWin);

        JButton button = new JButton("Start");
        add(button);

        button.addActionListener(e -> {
            int fieldSize = slFieldSize.getValue();
            int winLength = slDotsToWin.getValue();

            GameCode.SIZE = fieldSize;
            GameCode.DOTS_TO_WIN = winLength;
            GameCode.initMap();
            GameCode.printMap();
            GameCode.isGameFinished = false;

            gameWindow.startNewGame(fieldSize, winLength);


            setVisible(false);
        });

        setVisible(false);
    }
}