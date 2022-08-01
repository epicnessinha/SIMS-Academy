package org.academiadecodigo.bootcamp;

public class ColisionDet {

    private int x;

    private int y;

    public ColisionDet(){

    }

    public boolean colisionDetetor(int x, int y){
        if(x > 100){
            return false;
        }

        return true;

    }
}

