
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder strBuild = new StringBuilder();

        for (int i = 0; i < t.length; i++) {

            if (i % 4 == 0) {
                strBuild.append("\n ");
            }
            strBuild.append(t[i]);

            if (i < t.length - 1) {
                strBuild.append(", ");
            }
        }
        return "{" + strBuild + "\n}";
    }
}
