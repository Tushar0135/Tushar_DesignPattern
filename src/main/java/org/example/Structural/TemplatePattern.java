package org.example.Structural;

interface GameInterface
{
    public abstract void init();
    public abstract void begin();
    public abstract void end();

}

abstract class Game implements GameInterface {
    public final void playGame(){
        init();
        begin();
        end();
    }
}


class Ludo extends Game {
    public void init() {
        System.out.println("Ludo Game Initialized!");
    }
    public void begin() {
        System.out.println("Game Started. Welcome to in the Ludo game!");
    }
    public void end() {
        System.out.println("Game has now Finished!");
    }
}
class Chess extends Game {
    public void init() {
        System.out.println("Chess Game Initialized!");
    }
    public void begin() {
        System.out.println("Game Started. Welcome to in the chess game!");
    }
    public void end() {
        System.out.println("Game has now Finished!");
    }
}


public class TemplatePattern {
    public TemplatePattern()
    {
        Game chessGame=new Chess();
        Game LudoGame=new Ludo();
        chessGame.playGame();
        System.out.println("");
        LudoGame.playGame();
    }
}
