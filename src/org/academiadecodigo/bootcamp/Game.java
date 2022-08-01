package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game  implements KeyboardHandler {

    private MenuScene menuScene;

    private ChoosePlayer choosePlayer;

    private GameScene gameScene;

    private Picture shellby;

    private Picture spartans;

    private ColisionDet colisionDet;
    public Game() {
        menuScene = new MenuScene();

        choosePlayer = new ChoosePlayer();

        gameScene = new GameScene();

        shellby = new Picture(350, 700, "resources/shellby_game.png");
        spartans = new Picture(350, 700, "resources/spartacus_game.png");

    }
    
    public void init() {
       menuScene.init();
    }



    public void goToGamePage() {

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        Teams type;

        type = ChoosePlayer.getPlayers();
        colisionDet = new ColisionDet();

        switch (type) {
            case SHELLBYS:


                if (keyboardEvent.getKey() == KeyboardEvent.KEY_D) {
                    if (colisionDet.colisionDetetor(this.x, this.y) == true) {
                        return;
                    }
                    this.x += incr;
                    shellby.translate(incr, 0);
                }

                if (keyboardEvent.getKey() == KeyboardEvent.KEY_S) {
                    if (colisionDet.colisionDetetor(this.x, this.y) == true) {
                        return;
                    }
                    this.y += incr;
                    shellby.translate(0, incr);
                }

                if (keyboardEvent.getKey() == KeyboardEvent.KEY_W) {
                    if (colisionDet.colisionDetetor(this.x, this.y) == true) {
                        return;
                    }
                    this.y -= incr;
                    shellby.translate(0, -incr);
                }

                if (keyboardEvent.getKey() == KeyboardEvent.KEY_A) {
                    if (colisionDet.colisionDetetor(this.x, this.y) == true) {
                        return;
                    }
                    this.x -= incr;
                    shellby.translate(-incr, 0);
                }
                break;

            case SPARTANS:


                if (keyboardEvent.getKey() == KeyboardEvent.KEY_D) {
                    if (colisionDet.colisionDetetor(this.x, this.y) == true) {
                        return;
                    }
                    this.x += incr;
                    spartans.translate(incr, 0);

                }

                if (keyboardEvent.getKey() == KeyboardEvent.KEY_S) {
                    if (colisionDet.colisionDetetor(this.x, this.y) == true) {
                        return;
                    }
                    this.y += incr;
                    spartans.translate(0, incr);
                }

                if (keyboardEvent.getKey() == KeyboardEvent.KEY_W) {
                    if (colisionDet.colisionDetetor(this.x, this.y) == true) {
                        return;
                    }
                    this.y -= incr;
                    spartans.translate(0, -incr);
                }

                if (keyboardEvent.getKey() == KeyboardEvent.KEY_A) {
                    if (colisionDet.colisionDetetor(this.x, this.y) == true) {
                        return;
                    }
                    this.x -= incr;
                    spartans.translate(-incr, 0);
                }
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public void keyboardInit() {
        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent rightPressed = new KeyboardEvent();
        rightPressed.setKey(KeyboardEvent.KEY_D);
        rightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent downPressed = new KeyboardEvent();
        downPressed.setKey(KeyboardEvent.KEY_S);
        downPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent leftPressed = new KeyboardEvent();
        leftPressed.setKey(KeyboardEvent.KEY_A);
        leftPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent upPressed = new KeyboardEvent();
        upPressed.setKey(KeyboardEvent.KEY_W);
        upPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(rightPressed);
        keyboard.addEventListener(downPressed);
        keyboard.addEventListener(leftPressed);
        keyboard.addEventListener(upPressed);

    }
}






