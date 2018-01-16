import java.util.Scanner;

public class UserInterface{

    private Jumpers jumpers;
    private Scanner scan;
    private int round;

    public UserInterface() {
        this.scan = new Scanner(System.in);
        this.jumpers = new Jumpers();
        this.round = 1;
    }

    public void run() {
        getParticipants();

        System.out.println("\nThe tournament begins!\n");
        jump();

        System.out.println("\nThanks!\n");
        end();
    }

    private void end() {
        System.out.println("Tournament results:");
        System.out.println("Position    Name");

        jumpers.printStats();

    }

    private void jump() {

        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String input = scan.nextLine();

            if (input.contains("jump")) {
                System.out.println();
                System.out.println("Round "+round + "\n");
                jumpers.getJumpOrder();
                jumpers.runLogic();

            } else {
                break;
            }
        }
    }

    private void getParticipants() {
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while (true) {
            System.out.print("  Participant name: ");
            String name = scan.nextLine();

            if (name.isEmpty()) {
                break;
            }
            jumpers.add(new Jumper(name));
        }
    }








}