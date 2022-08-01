package org.academiadecodigo.bootcamp;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MenuScene extends SuperScene implements KeyboardHandler {

    private Picture picture;

    private boolean init;


    public MenuScene() {
        boolean init = false;
    }

    public void init() {

        //picture
        Picture picture1 = new Picture(10, 10, "resources/Intro.png");
        picture1.draw();
        keyboardInit();
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == keyboardEvent.KEY_SPACE && !init) {
            init = true;
            ChoosePlayer myChoosePlayer = new ChoosePlayer();
            myChoosePlayer.init();
        }
    }

    public void keyboardInit() {

        Keyboard myKeyboard = new Keyboard(this);
        // Press SPACE to start the game
        KeyboardEvent enterPress = new KeyboardEvent();
        enterPress.setKey(KeyboardEvent.KEY_SPACE);
        enterPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        myKeyboard.addEventListener(enterPress);

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        //njn
    }
}
