import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class admin implements user {

    private String username;
    private String password;

    public admin(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    static ArrayList<dvd_film> dvd = new ArrayList<dvd_film>();
    static ArrayList<dvd_film> dvd() {
        return dvd;
    }

    static ArrayList<duration> dvd1 = new ArrayList<duration>();
    static ArrayList<duration> dvd1() {
        return dvd1;
    }

    static ArrayList<actor> dvd2 = new ArrayList<actor>();
    static ArrayList<actor> dvd2() {
        return dvd2;
    }

    static ArrayList<rating> dvd3 = new ArrayList<rating>();
    static ArrayList<rating> dvd3() {
        return dvd3;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public final static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws IOException {
        menuadmin();
    }

    public static void menuadmin() throws IOException {
        while (true) {
            cls();
            System.out.println("\033[0;96m╔══════════════════════════════════════╗");
            System.out.println("║           BlurayFlix Store           ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║ [1] ADD DVD                          ║");
            System.out.println("║ [2] DISPLAY DVD                      ║");
            System.out.println("║ [3] UPDATE DVD                       ║");
            System.out.println("║ [4] DELETE DVD                       ║");
            System.out.println("║ [0] EXIT                             ║");
            System.out.println("╚══════════════════════════════════════╝\n");
            System.out.print("\033[0;95mPlease enter your option: ");
            int menu = Integer.parseInt(br.readLine());

            if (menu == 1) {
                cls();
                createDVD();
                cls();
            } else if (menu == 2) {
                cls();
                displayDVD();
                cls();
            } else if (menu == 3) {
                cls();
                upDVD();
                cls();
            } else if (menu == 4) {
                cls();
                deleteDVD();
                cls();
            } else if (menu == 0) {
                return;
            } else {
                System.out.println("Please Enter Valid Number!");
            }
        }
    }

    public static void createDVD() throws IOException {
        System.out.println("\n\033[0;93m╔══════════════════════════════════════╗");
        System.out.println("║              ADD DVD                 ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println(" [1] ADD MOVIE LIST WITH DURATION");
        System.out.println(" [2] ADD MOVIE LIST WITH ACTOR");
        System.out.println(" [3] ADD MOVIE LIST WITH RATING");
        System.out.println(" [0] EXIT");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.print("\033[0;95mPlease enter your option: ");
        int choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1:
                System.out.println("\n\033[0;93m╔══════════════════════════════════════╗");
                System.out.println("║              ADD DVD                 ║");
                System.out.println("╚══════════════════════════════════════╝");
                System.out.print("Enter DVD Name          : ");
                String adddvdName = br.readLine();
                System.out.print("Enter Genre             : ");
                String addgenre = br.readLine();
                System.out.print("Enter Release Year      : ");
                int addreleaseYear = Integer.parseInt(br.readLine());
                System.out.print("Enter Director's Name   : ");
                String adddirector = br.readLine();
                System.out.print("Enter Price             : ");
                int addprice = Integer.parseInt(br.readLine());
                System.out.print("Enter Duration          : ");
                int addduration = Integer.parseInt(br.readLine());
                createDVD1(adddvdName, addgenre, addreleaseYear, adddirector, addprice, addduration);
                break;

            case 2:
                System.out.println("\n\033[0;93m╔══════════════════════════════════════╗");
                System.out.println("║              ADD DVD                 ║");
                System.out.println("╚══════════════════════════════════════╝");
                System.out.print("Enter DVD Name          : ");
                String adddvdName1 = br.readLine();
                System.out.print("Enter Genre             : ");
                String addgenre1 = br.readLine();
                System.out.print("Enter Release Year      : ");
                int addreleaseYear1 = Integer.parseInt(br.readLine());
                System.out.print("Enter Director's Name   : ");
                String adddirector1 = br.readLine();
                System.out.print("Enter Price             : ");
                int addprice1 = Integer.parseInt(br.readLine());
                System.out.print("Enter Actor             : ");
                String addactor = br.readLine();
                createDVD2(adddvdName1, addgenre1, addreleaseYear1, adddirector1, addprice1, addactor);
                break;

            case 3:
                System.out.println("\n\033[0;93m╔══════════════════════════════════════╗");
                System.out.println("║              ADD DVD                 ║");
                System.out.println("╚══════════════════════════════════════╝");
                System.out.print("Enter DVD Name          : ");
                String adddvdName2 = br.readLine();
                System.out.print("Enter Genre             : ");
                String addgenre2 = br.readLine();
                System.out.print("Enter Release Year      : ");
                int addreleaseYear2 = Integer.parseInt(br.readLine());
                System.out.print("Enter Director's Name   : ");
                String adddirector2 = br.readLine();
                System.out.print("Enter Price             : ");
                int addprice2 = Integer.parseInt(br.readLine());
                System.out.print("Enter Rating            : ");
                double addrating = Double.parseDouble(br.readLine());
                createDVD3(adddvdName2, addgenre2, addreleaseYear2, adddirector2, addprice2, addrating);
                break;

        }
    }

    public static void displayDVD() throws IOException {
        cls();
        System.out.println("\n\033[0;97m╔══════════════════════════════════════╗");
        System.out.println("             \033[0;97mDVD Movie List");
        System.out.println("========================================");
        System.out.println("║ [1] Movie List With Duration         ║");
        System.out.println("║ [2] Movie List With Actor            ║");
        System.out.println("║ [3] Movie List With Rating           ║");
        System.out.println("╚══════════════════════════════════════╝\n");
        System.out.print("\033[0;95mPlease enter your option: ");
        int show = Integer.parseInt(br.readLine());

        switch (show) {
            case 1:
                if (dvd1.isEmpty()) {
                    System.out.println("\n\033[0;91mNo DVD available. Please add DVD!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread sleep interrupted");
                    }
                    System.out.println("\nPress Enter to go back to main menu...");
                    Scanner sc = new Scanner(System.in);
                    sc.nextLine();
                } else {
                    System.out.println("\n\033[0;97m╔══════════════════════════════════════╗");
                    System.out.println("             \033[0;97mDVD Movie List");
                    System.out.println("========================================");
                    for (int i = 0; i < dvd1.size(); i++) {
                        System.out.println(i + 1 + ". DVD Name        : " + dvd1.get(i).getNewName());
                        System.out.println("   Genre           : " + dvd1.get(i).getNewGenre());
                        System.out.println("   Release Year    : " + dvd1.get(i).getNewYear());
                        System.out.println("   Director        : " + dvd1.get(i).getDirector());
                        System.out.println("   Duration        : " + dvd1.get(i).getDuration());
                        System.out.println("   Price           : " + dvd1.get(i).getNewPrice());
                    }
                    System.out.println("╚══════════════════════════════════════╝");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread sleep interrupted");
                    }
                    System.out.println("\nPress Enter to go back to main menu...");
                    Scanner sc = new Scanner(System.in);
                    sc.nextLine();
                }
                break;

            case 2:
                if (dvd2.isEmpty()) {
                    System.out.println("\n\033[0;91mNo DVD available. Please add DVD!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread sleep interrupted");
                    }
                    System.out.println("\nPress Enter to go back to main menu...");
                    Scanner sc = new Scanner(System.in);
                    sc.nextLine();
                } else {
                    System.out.println("\n\033[0;97m╔══════════════════════════════════════╗");
                    System.out.println("             \033[0;97mDVD Movie List");
                    System.out.println("========================================");
                    for (int i = 0; i < dvd2.size(); i++) {
                        System.out.println(i + 1 + ". DVD Name        : " + dvd2.get(i).getNewName());
                        System.out.println("   Genre          : " + dvd2.get(i).getNewGenre());
                        System.out.println("   Release Year   : " + dvd2.get(i).getNewYear());
                        System.out.println("   Director       : " + dvd2.get(i).getDirector());
                        System.out.println("   Actor          : " + dvd2.get(i).getActor());
                        System.out.println("   Price          : " + dvd2.get(i).getNewPrice());
                    }
                    System.out.println("╚══════════════════════════════════════╝");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread sleep interrupted");
                    }
                    System.out.println("\nPress Enter to go back to main menu...");
                    Scanner sc = new Scanner(System.in);
                    sc.nextLine();
                }
                break;

            case 3:
                if (dvd3.isEmpty()) {
                    System.out.println("\n\033[0;91mNo DVD available. Please add DVD!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread sleep interrupted");
                    }
                    System.out.println("\nPress Enter to go back to main menu...");
                    Scanner sc = new Scanner(System.in);
                    sc.nextLine();

                } else {
                    System.out.println("\n\033[0;97m╔══════════════════════════════════════╗");
                    System.out.println("             \033[0;97mDVD Movie List");
                    System.out.println("========================================");
                    for (int i = 0; i < dvd3.size(); i++) {
                        System.out.println(i + 1 + ". DVD Name        : " + dvd3.get(i).getNewName());
                        System.out.println("   Genre          : " + dvd3.get(i).getNewGenre());
                        System.out.println("   Release Year   : " + dvd3.get(i).getNewYear());
                        System.out.println("   Director       : " + dvd3.get(i).getDirector());
                        System.out.println("   Rating         : " + dvd3.get(i).getRating());
                        System.out.println("   Price          : " + dvd3.get(i).getNewPrice());
                    }
                    System.out.println("╚══════════════════════════════════════╝");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread sleep interrupted");
                    }
                    System.out.println("\nPress Enter to go back to main menu...");
                    Scanner sc = new Scanner(System.in);
                    sc.nextLine();
                }
                break;
        }
    }

    public static void upDVD() throws IOException {
        System.out.println("\n\033[0;93m╔══════════════════════════════════════╗");
        System.out.println("║             UPDATE DVD               ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.print("Enter DVD Name to Update: ");
        String dvdName = br.readLine();
        cls();
        System.out.println("\n\033[0;95mChoose what to update:");
        System.out.println(" [1] Update Duration");
        System.out.println(" [2] Update Actor");
        System.out.println(" [3] Update Rating");
        System.out.println(" [0] Exit");
        System.out.print("\033[0;95mPlease enter your option: ");
        int choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1:
                System.out.print("Enter new Duration: ");
                int newDuration = Integer.parseInt(br.readLine());
                updateDVD1(dvdName, newDuration);
                break;

            case 2:
                System.out.print("Enter new Actor: ");
                String newActor = br.readLine();
                updateDVD2(dvdName, newActor);
                break;

            case 3:
                System.out.print("Enter new Rating: ");
                double newRating = Double.parseDouble(br.readLine());
                updateDVD3(dvdName, newRating);
                break;

            case 0:
                break;

            default:
                System.out.println("Invalid option!");
                break;
        }
    }

    public static void deleteDVD() throws IOException {
        System.out.println("\n\033[0;95mChoose what to Delete:");
        System.out.println(" [1] Based On Duration");
        System.out.println(" [2] Based On Actor");
        System.out.println(" [3] Based On Rating");
        System.out.println(" [0] Exit");
        System.out.print("\033[0;95mPlease enter your option: ");
        int del = Integer.parseInt(br.readLine());
        switch (del) {
            case 1:
                for (int i = 0; i < dvd1.size(); i++) {
                    dvd1.remove(i);
                    System.out.println("DVD with duration deleted successfully!");
                    i--;
                }
                displayDVD();
                break;
            case 2:
                for (int i = 0; i < dvd2.size(); i++) {
                    dvd2.remove(i);
                    System.out.println("DVD with actor deleted successfully!");
                    i--;
                }
                displayDVD();
                break;
            case 3:
                for (int i = 0; i < dvd3.size(); i++) {
                    dvd3.remove(i);
                    System.out.println("DVD with rating deleted successfully!");
                    i--;
                }
                displayDVD();
                break;
        }
    }

    public static void createDVD1(String adddvdName, String addgenre, int addreleaseYear, String adddirector,
            int addprice, int addduration) {
        duration drt = new duration(adddvdName, addgenre, addreleaseYear, adddirector, addprice, addduration);
        dvd1.add(drt);
        drt.addDVD();
    }

    public static void createDVD2(String adddvdName1, String addgenre1, int addreleaseYear1, String adddirector1,
            int addprice1, String addactor) {
        actor act = new actor(adddvdName1, addgenre1, addreleaseYear1, adddirector1, addprice1, addactor);
        dvd2.add(act);
        act.addDVD();
    }

    public static void createDVD3(String adddvdName2, String addgenre2, int addreleaseYear2, String adddirector2,
            int addprice2, double addrating) {
        rating rtg = new rating(adddvdName2, addgenre2, addreleaseYear2, adddirector2, addprice2, addrating);
        dvd3.add(rtg);
        rtg.addDVD();
    }

    public static void updateDVD1(String dvdName, int newDuration) {
        for (duration dvd : dvd1) {
            if (dvd.getNewName().equals(dvdName)) {
                dvd.setDuration(newDuration);
                System.out.println("DVD updated successfully!");
                return;
            }
        }
        System.out.println("DVD not found!");
    }

    public static void updateDVD2(String dvdName, String newActor) {
        for (actor dvd : dvd2) {
            if (dvd.getNewName().equals(dvdName)) {
                dvd.setActor(newActor);
                System.out.println("DVD updated successfully!");
                return;
            }
        }
        System.out.println("DVD not found!");
    }

    public static void updateDVD3(String dvdName, double newRating) {
        for (rating dvd : dvd3) {
            if (dvd.getNewName().equals(dvdName)) {
                dvd.setRating(newRating);
                System.out.println("DVD updated successfully!");
                return;
            }
        }
        System.out.println("DVD not found!");
    }

}