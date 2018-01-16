import java.util.ArrayList;
import java.util.List;

public class Jumper implements Comparable<Jumper>{

    private String name;
    private int totalScore;
    private List<Integer> jumpHistory;

    public Jumper(String name) {
        this.name = name;
        this.totalScore = 0;
        this.jumpHistory = new ArrayList<Integer>();
    }


    @Override
    public int compareTo(Jumper comparable) {
        if (this.totalScore > comparable.totalScore) {
            return 1;
        } else if (this.totalScore < comparable.totalScore) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.totalScore + " points)";
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public void addJumpToHistory(int jump) {
        this.jumpHistory.add(jump);
    }

    public String getJumpHistoryString() {
        String str = "";

        for (Integer integer : jumpHistory) {
            str += integer + " m, ";
        }
        str = str.substring(0, str.length() - 2);

        return str;
    }
}