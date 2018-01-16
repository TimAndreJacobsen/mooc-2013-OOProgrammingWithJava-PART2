package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

public class Barn {

    private MilkingRobot milkingRobot;
    private BulkTank bulkTank;


    public Barn(BulkTank tank) {
        this.bulkTank = tank;
    }

    public BulkTank getBulkTank() {
        return this.bulkTank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(this.bulkTank);
    }

    public void takeCareOf(Cow cow) {
        if (this.milkingRobot == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        } else
        milkingRobot.milk(cow);
    }

    public void takeCareOf(Collection<Cow> cows) {
        if (this.milkingRobot == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        } else {
            for (Milkable cow : cows) {
                milkingRobot.milk(cow);
            }
        }

    }

    public void setMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
    }

    public String toString() {
        return this.bulkTank.toString();
    }
}
