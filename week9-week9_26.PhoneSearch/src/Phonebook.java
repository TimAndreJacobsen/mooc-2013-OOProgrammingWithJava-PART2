import java.util.*;

public class Phonebook {

    private Scanner scan = new Scanner(System.in);

    // List of all the names that are the keys of the hashmaps (should probably be a set)
    private List<String> listOfKeys = new ArrayList<String>();
    // key - name, value List of phonenumbers
    private Map<String, List<String>> phonebook = new HashMap<String, List<String>>();
    // key - name, value street
    private Map<String, String> addressbookStreet = new HashMap<String, String>();
    // key - name, value city
    private Map<String, String> addressbookCity = new HashMap<String, String>();


    public void start() {
        printMenu(scan);
    }

    private void deleteAll() {
        System.out.print("whose information: ");
        String name = scan.nextLine();
        System.out.println();

        listOfKeys.remove(name);
        phonebook.remove(name);
        addressbookCity.remove(name);
        addressbookStreet.remove(name);
    }

    private void getKeyFromValueInList() {    // get the number

        System.out.print("number: ");
        String number = scan.nextLine();

        for (String key : listOfKeys) {

            if (phonebook.get(key).contains(number)) ;
            System.out.println(" " + key);
            System.out.println();
            return;
        }
        System.out.println(" not found");
        System.out.println();
    }

    private void add(String name, String phoneNumber) {
        if (phonebook.get(name) == null) { // If name entry does not exist yet
            phonebook.put(name, new ArrayList<String>()); // make a new key + list
            phonebook.get(name).add(phoneNumber); // Store number in key's list
            listOfKeys.add(name); // adds key to keyList

        } else phonebook.get(name).add(phoneNumber); // store number in key's list
        listOfKeys.add(name);
    }

    private void printNumbers(Map phonebook, String name) {

        List<List> numbers = new ArrayList<List>();
        if ((List<List>) phonebook.get(name) != null) {
            numbers = (List<List>) phonebook.get(name);

            for (int i = 0; i < numbers.size(); i++) {
                System.out.println(" " + numbers.get(i));
            }
        }
    }

    private void printNumbers2(Map phonebook, String name) {
        List<List> numbers = new ArrayList<List>();

        if ((List<List>) phonebook.get(name) != null) {
            System.out.println("  phone numbers:");
            numbers = (List<List>) phonebook.get(name);

            for (int i = 0; i < numbers.size(); i++) {
                System.out.println("   " + numbers.get(i));
            }
            return;
        }
        System.out.println("  phone number not found");
    }

    private void addUser() {
        System.out.print("whose number: ");
        String name = scan.nextLine();
        System.out.print("number: ");
        String number = scan.nextLine();
        System.out.println();
        this.add(name, number);
    }

    private void searchByName() {

        System.out.print("whose number: ");
        String name = scan.nextLine();

        if (this.phonebook.get(name) == null) {
            System.out.println("  not found");
            System.out.println();

        } else {
            printNumbers(phonebook, name);
            System.out.println();
        }
    }

    private void printFull() {
        System.out.print("keyword (if empty, all listed): ");
        String keyword = scan.nextLine();

        if (keyword.isEmpty()) {

            for (String name : listOfKeys) {
                System.out.print("  address");

                if (addressbookCity.get(name) == null) {
                    System.out.println(" unknown");

                } else {
                    System.out.println(": " + addressbookStreet.get(name) + " " + addressbookCity.get(name));
                }
                printNumbers2(phonebook, name);
                System.out.println();
            }

        } else {
            if (listOfKeys.contains(keyword)) {
                String name = keyword;
                System.out.print("  address");

                if (addressbookCity.get(name) == null) {
                    System.out.println(" unknown");

                } else {
                    System.out.println(": " + addressbookStreet.get(name) + " " + addressbookCity.get(name));
                }
                printNumbers2(phonebook, name);
                System.out.println();
            }
        }
    }

    private void printIntro() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        System.out.println();
    }


    private void printMenu(Scanner scan) {

        printIntro();

        while (true) {

            System.out.print("command: ");
            String userInput = scan.nextLine();


            // ADD USER TO PHONEBOOK
            if (userInput.equals("1")) {
               addUser();

                // SEARCH FOR USER BY NAME
            } else if (userInput.equals("2")) {
               searchByName();

                // SEARCH FOR USER BY NUMBER
            } else if (userInput.equals("3")) {
                getKeyFromValueInList();
            }


            // ADD USER TO ADDRESSBOOK
            else if (userInput.equals("4")) {
                System.out.print("whose address: ");
                String name = scan.nextLine();

                System.out.print("street: ");
                String street = scan.nextLine();

                System.out.print("city: ");
                String city = scan.nextLine();
                System.out.println();

                addressbookStreet.put(name, street);
                addressbookCity.put(name, city);

                // PRINTS ALL USER INFO
            } else if (userInput.equals("5")) {

                System.out.print("Whose information: ");
                String name = scan.nextLine();
                System.out.print("  address");

                if (addressbookCity.get(name) == null) {
                    System.out.println(" unknown");

                } else {
                    System.out.println(": " + addressbookStreet.get(name) + " " + addressbookCity.get(name));
                }

                ////////////////////// PHONE NUMBERS ////////////////////////////////////////

                printNumbers2(phonebook,name);
                System.out.println();

                // DELETE ALL PERSONAL INFO
            } else if (userInput.equals("6")) {
                deleteAll();

            } else if (userInput.equals("7")) {
                printFull();

            } else if (userInput.equals("x")) {
                break;
            }
        }
    }









}

