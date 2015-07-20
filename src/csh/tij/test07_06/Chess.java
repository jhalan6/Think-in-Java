package csh.tij.test07_06;
import csh.tij.test00_00.*;
class Game {
  Game(int i) {
    Print.print("Game constructor");
  }
}

class BoardGame extends Game {
  BoardGame(int i) {
    super(i);
    Print.print("BoardGame constructor");
  }
}	

public class Chess extends BoardGame {
	Chess() {
		super(1);
    Print.print("Chess constructor");
  }
  public static void main(String[] args) {
    @SuppressWarnings("unused")
	Chess x = new Chess();
  }
}
/*Implicit super constructor BoardGame() is undefined. 
 * Must explicitly invoke another constructor
 */
