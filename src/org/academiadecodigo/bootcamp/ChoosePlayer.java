package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class ChoosePlayer extends SuperScene implements KeyboardHandler {

    Picture picture;
    private static Teams teams;

    private boolean init = false;

    public ChoosePlayer(){
         init = false;
    }

    public void init() {
        //background
        Rectangle myRectangle = new Rectangle(10, 10, 800, 800);
        myRectangle.setColor(Color.PINK);
        myRectangle.fill();
        //picture background
        /*Picture pictureBackground = new Picture(10, 10, "resources/classroomback3.png");
        pictureBackground.draw();*/

        //picture Player Shellbys
        Picture pictureShellbys = new Picture(10, 10, "resources/Choose Player.png");
        pictureShellbys.draw();


        /*//picture Player Spartacus

        Picture pictureSpartans = new Picture(330, 400, "resources/spartacus_choose.png");
        pictureSpartans.grow(-100,-100);
        pictureSpartans.draw();
        Text text = new Text(330, 500, "Press right to choose SSHpartans");
        text.draw();*/



        keyboardInit();

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        GameScene gameScene1 = new GameScene();
        if(keyboardEvent.getKey() == keyboardEvent.KEY_LEFT && !init){
            init = true;
            teams = Teams.SHELLBYS;
            gameScene1.backgroundShellby();
        }

        if(keyboardEvent.getKey() == keyboardEvent.KEY_RIGHT && !init){
            init = true;
            teams = Teams.SPARTANS;
            gameScene1.backgroundSpartans();
        }


    }
    public void keyboardInit() {

        Keyboard myKeyboard = new Keyboard(this);
        // Press LEFT to select Shellbys
        KeyboardEvent LeftPress = new KeyboardEvent();
        LeftPress.setKey(KeyboardEvent.KEY_LEFT);
        LeftPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        myKeyboard.addEventListener(LeftPress);

        //Press RIGHT to select Spartans
        KeyboardEvent RightPress = new KeyboardEvent();
        RightPress.setKey(KeyboardEvent.KEY_RIGHT);
        RightPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        myKeyboard.addEventListener(RightPress);


    }
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        //
    }

    public static final Teams getPlayers() {
        return teams;
    }
}
