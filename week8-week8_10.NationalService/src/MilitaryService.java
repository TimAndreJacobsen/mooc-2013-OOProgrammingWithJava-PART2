public class MilitaryService implements NationalService {

    private int daysLeft;

    public MilitaryService(int daysLeftAtStart) {
        this.daysLeft = daysLeftAtStart;
    }

    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }

    @Override
    public void work() {
        if (daysLeft > 0) {
            daysLeft--;
        }
    }
}
