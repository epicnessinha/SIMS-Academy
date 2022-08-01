package org.academiadecodigo.bootcamp;

public enum Teams {
    SHELLBYS(0),
    SPARTANS(1);


    private int players;
    Teams(int players){
        this.players=players;
    }

    public int getPlayers(){
        return this.players;
    }

}
