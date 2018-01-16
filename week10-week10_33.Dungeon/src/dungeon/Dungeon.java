package dungeon;

import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    // Declaring
    private int height;
    private int width;
    private int vampires;
    private int moves;
    private boolean vampiresMove;

    private List<Vampire> vampireArrayList = new ArrayList<Vampire>();
    private UserInterface ui;
    private String[][] gameBoard;
    private Player p1;

    // Constructor
    public Dungeon(int boardHeight, int boardWidth, int vampiresAtStart, int moves, boolean vampiresMove) {

        this.ui = new UserInterface(this);
        String[][] gameBoard = new String[boardHeight][boardWidth];

        this.height = boardHeight;
        this.width = boardWidth;
        this.vampires = vampiresAtStart;
        this.moves = moves; // "moves determines the initial number of moves" - for who? player? if so why? DOES IT SET LAMP CHARGE?
        this.vampiresMove = vampiresMove;

        this.gameBoard = ui.generateDungeon(gameBoard);

        this.p1 = new Player(moves);


        for (int i = 0; i < vampiresAtStart; i++) {
            vampireArrayList.add(new Vampire(gameBoard, this));
        }

    }


    // Methods
    public void run() {



        ui.placePlayer(gameBoard, p1);

        ui.placeVampire(this.gameBoard, vampireArrayList);

        ui.printHUD(vampireArrayList);

        ui.printGameBoard(this.gameBoard);

        while (p1.getAlive())

            // Get movement input from user

            // Do the move

            // Move vampires

            // Update HUD

            // Print the changed board
            ui.render(gameBoard, p1, vampireArrayList);

    }


    // Getters
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getVampires() {
        return vampires;
    }

    public int getMoves() {
        return moves;
    }

    public boolean isVampiresMove() {
        return vampiresMove;
    }

    public List<Vampire> getVampireArrayList() {
        return vampireArrayList;
    }
}
