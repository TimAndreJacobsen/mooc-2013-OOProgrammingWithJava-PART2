public class Calculator {

    private Reader reader;
    private int statistics;

    public Calculator() {
        reader = new Reader();
        this.statistics = 0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void difference() {
        int[] input = getInput();

                System.out.println("difference of the values " + (input[0] - input[1]));
    }

    private void sum() {

        int[] input = getInput();

        System.out.println("Sum of the values " + (input[0] + input[1]));
    }

    private void product() {
        int[] input = getInput();

        System.out.println("product of the values " + (input[0] * input[1]));
    }

    private void statisticsTick() {
        this.statistics++;
    }

    private void statistics() {
        System.out.println("Calculations done " + this.statistics);
    }

    private int[] getInput() {
        int[] input = new int[2];

        System.out.println("Value1: ");
        input[0] = reader.readInteger();

        System.out.println("Value2: ");
        input[1] = reader.readInteger();

        statisticsTick();
        return input;
    }

}
