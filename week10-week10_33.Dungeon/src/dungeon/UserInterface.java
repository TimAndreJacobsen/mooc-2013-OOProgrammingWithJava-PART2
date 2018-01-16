package dungeon;


import java.util.ArrayList;
import java.util.List;


public class UserInterface {

    private Dungeon dungeon;
    private Player player;
    private Vampire vampire;

    public UserInterface(Dungeon dungeon) {
        this.dungeon = dungeon;
    }

    // Methods
    public void printGameBoard(String[][] gameBoard) {

        for (int row = 0; row < gameBoard.length; row++) {

            for (int column = 0; column < gameBoard[row].length; column++) {
                System.out.print(gameBoard[row][column]);
            }
            System.out.println();
        }
    }

    public String[][] generateDungeon(String[][] gameBoard) {

        for (int row = 0; row < gameBoard.length; row++) {

            for (int column = 0; column < gameBoard[row].length; column++) {

                gameBoard[row][column] = ".";
            }
        }
        return gameBoard;
    }

    public void placeVampire(String[][] gameBoard, List<Vampire> vampires) {

        for (Vampire v : vampires) {
            int x = v.getX();
            int y = v.getY();

            gameBoard[x][y] = "v";
        }

    }

    public void placePlayer(String[][] gameBoard, Player player) {
        int x = player.getX();
        int y = player.getY();

        gameBoard[x][y] = "@";
    }

    public void render(String[][] gameBoard, Player player, List<Vampire> vampires) {

        // Place player
        placePlayer(gameBoard, player);

        // update vampire coord, update player coord, update lamp charge

        // print static UI elements: line 1 = lamp charge
        // line 3 -> +1 perActor-> line n = Actor + " " + x coord + y coord

        // render gameboard

    }

    public void printHUD(ArrayList<Vampire> vampires) {
        System.out.println(player.getLampCharge()+"\n");
        System.out.println("@ " + player.getX() + " " + player.getY());

        for (Vampire v : vampires) {
            System.out.println("v " + v.getX() + " " + v.getY());
        }
        System.out.println();
    }




}
