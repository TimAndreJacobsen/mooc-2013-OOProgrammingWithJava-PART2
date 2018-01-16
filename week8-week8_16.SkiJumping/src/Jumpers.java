import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

public class Jumpers{

    private int round = 0;


    private ArrayList<Jumper> jumpersfromClass;

    public Jumpers() {
        this.jumpersfromClass = new ArrayList<Jumper>();
    }

    public void add(Jumper jumper) {
        jumpersfromClass.add(jumper);
    }

    public void getJumpOrder() {
        Collections.sort(jumpersfromClass);
        //Collections.reverse(jumpersfromClass);

        System.out.println("Jumping order:");

        for (int i = 0; i < jumpersfromClass.size(); i++) {

            System.out.println("  " + (i+1) + ". " + jumpersfromClass.get(i).toString());
        }
        System.out.println();
    }

    public void runLogic() {
        Random rand = new Random();
        round++;
        System.out.println("Results of round " + round);

        Collections.sort(jumpersfromClass);
        for (Jumper jump : jumpersfromClass) {
            System.out.println("  " + jump.getName());

            int totalScore = jump.getTotalScore();
            // random.nextInt(max - min + 1) + min
            int jumpScore = rand.nextInt(120 - 60 + 1) + 60;
            System.out.println("    length: " + jumpScore);
            jump.addJumpToHistory(jumpScore);

            int judges = judgesJudging();
            jumpScore = jumpScore + judges;
            jump.setTotalScore(jumpScore + totalScore);
        }
        System.out.println();
    }

    private int judgesJudging() {
        Random rand = new Random();
        int[] ints = new int[5];
        for (int i = 0; i < 5; i++) {
            ints[i] = rand.nextInt(20) ;
        }
        System.out.println("    judge votes: " + intArrayToString(ints));
        int result = 0;
        Arrays.sort(ints);
        for (int i = 0; i < 3; i++) {
            result += ints[i+1];
        }

        return result;
    }

    private String intArrayToString(int[] array) {
        String s = "[";

        for (int i = 0; i < array.length; i++) {
            s += array[i] + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s + "]";
    }

    public void printStats() {
        int i = 1;
        Collections.sort(jumpersfromClass);
        Collections.reverse(jumpersfromClass);
        for (Jumper jumper : jumpersfromClass) {
            System.out.println(i + "           " + jumper.toString());
            System.out.println("            jump lengths: " + jumper.getJumpHistoryString());
            i++;
        }
    }
}