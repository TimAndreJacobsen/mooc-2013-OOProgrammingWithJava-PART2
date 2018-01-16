public class Calculator {

    private int sum;

    public Calculator() {
        this.sum = 0;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void addition(int x) {
        this.sum += x;
    }

    public void subtraction(int x) {
        this.sum -= x;
    }

    public void reset() {
        this.sum = 0;
    }
}
