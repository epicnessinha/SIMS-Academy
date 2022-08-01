package org.academiadecodigo.bootcamp;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameScene extends SuperScene implements KeyboardHandler {
    private Picture shellby;

    private Picture spartans;


    private int incr;

    private ColisionDet colisionDet;

    public GameScene() {

    }

    public void init() {


    }

    public void backgroundShellby() {

        //picture shellbys
        Picture picture1 = new Picture(10, 10, "resources/classroomback3.png");
        picture1.draw();
        keyboardInit();
        shellby.draw();

    }

    public void backgroundSpartans() {
        //picture spartans
        Picture picture1 = new Picture(10, 10, "resources/classroomback3.png");
        picture1.draw();
        keyboardInit();
        spartans.draw();
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
        public void keyReleased (KeyboardEvent keyboardEvent){
            //sdasd
        }

        public int getWidth(){
        return shellby.getWidth();
        }

        public int getHeigth(){
        return shellby.getHeight();
        }

}
