package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

public class Farm implements Alive {

    private String owner;
    private Collection<Cow> cows = new ArrayList<Cow>();
    private Barn barn;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;

    }

    public void manageCows() {
        this.barn.takeCareOf(cows);
    }

    public String getOwner() {
        return this.owner;

    }
    @Override
    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }

    public String toString() {

        System.out.println("Farm owner: " + this.owner + "\nBarn bulk tank: " + this.barn.getBulkTank() + "");
        String str = "";

        if (this.cows.isEmpty()) {
            str += "No cows.";

         } else {
            System.out.println("Animals:");
            for (Cow cow : cows) {
                str += "        " + cow.toString();
                str += "\n";
            }
        }
        return str;
    }

    public void addCow(Cow cow) {
        this.cows.add(cow);
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.barn.installMilkingRobot(milkingRobot);
    }
}
