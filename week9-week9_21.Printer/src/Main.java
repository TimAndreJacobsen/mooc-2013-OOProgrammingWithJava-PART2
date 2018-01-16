
public class Main {

    public static void main(String[] args) throws Exception {
        // write some test code here
        // for testing purposes, project has files
        //    src/textfile.txt
        //    src/kalevala.txt

        Printer printer = new Printer("src/textfile.txt");

        System.out.println("IF IT CONTAINTS Väinämöinen!");
        printer.printLinesWhichContain("Väinämöinen");

        System.out.println("-----");

        System.out.println("PRINT ALL THE WORDS");
        printer.printLinesWhichContain("");

        System.out.println("-----");


    }
}
