package farmsimulator;

public class MilkingRobot  {

    private BulkTank bulkTank;

    public MilkingRobot() {
        this.bulkTank = null;
    }

    public BulkTank getBulkTank() {
        if (this.bulkTank == null) {
            return null;
        } else {
            return this.bulkTank;
        }
    }

    public void setBulkTank(BulkTank bulkTank) {
        this.bulkTank = bulkTank;
    }

    public void milk(Milkable milkable) {
        if (this.bulkTank == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        } else {
            this.bulkTank.addToTank(milkable.milk());
        }
    }

}
