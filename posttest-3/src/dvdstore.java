import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class dvdstore {

    private static ArrayList<dvd_film> dvds = new ArrayList<>();
    private static ArrayList<duration> drt = new ArrayList<>();
    private static ArrayList<actor> act = new ArrayList<>();
    private static ArrayList<rating> rtg = new ArrayList<>();

    public static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void displayDVDs() {
        if (dvds.isEmpty()) {
            System.out.println("\n\033[0;91mNo DVD available. Please add DVD!");
            return;
        } else {
            Scanner sc = new Scanner(System.in);

            do {
                System.out.println("\n\033[0;97m╔══════════════════════════════════════╗");
                System.out.println("             \033[0;97mDVD Movie List");
                System.out.println("========================================");
                System.out.println("║ [1] Regular Movie List               ║");
                System.out.println("║ [2] Movie List With Duration         ║");
                System.out.println("║ [3] Movie List With Actor            ║");
                System.out.println("║ [4] Movie List With Rating           ║");
                System.out.println("║ [0] Back                             ║");
                System.out.println("╚══════════════════════════════════════╝\n");
                System.out.print("\033[0;95mPlease enter your option: ");

                int show = 0;

                try {
                    show = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid option.");
                    sc.nextLine();
                    return;
                }

                switch (show) {
                    case 1:
                        regularList(dvds);
                        break;

                    case 2:
                        withDrt(drt);
                        break;

                    case 3:
                        withAct(act);
                        break;

                    case 4:
                        withRtg(rtg);
                        break;
                    case 0:
                        return;

                }

            } while (true);
        }
    }

    private static void regularList(ArrayList<dvd_film> dvds) {
        if (dvds.isEmpty()) {
            System.out.println("\n\033[0;91mNo DVD available. Please add DVD!");
        } else {
            System.out.println("\n\033[0;97m╔══════════════════════════════════════╗");
            System.out.println("             \033[0;97mDVD Movie List");
            System.out.println("========================================");
            for (int i = 0; i < dvds.size(); i++) {
                dvd_film dvd = dvds.get(i);
                System.out.println(+(i + 1) + ". DVD Name     : " + dvd.getNewName());
                System.out.println("   Genre        : " + dvd.getNewGenre());
                System.out.println("   Release Year : " + dvd.getNewYear());
                System.out.println("   Director     : " + dvd.director);
                System.out.println("   Price        : Rp. " + dvd.getNewPrice());
                System.out.println("========================================");
                System.out.println("----------------------------------------");
            }
            System.out.println("╚══════════════════════════════════════╝");
        }
    }

    private static void withDrt(ArrayList<duration> drt) {
        boolean Add = false;
        if (drt.isEmpty()) {
            System.out.println("\n\033[0;91mNo DVD available. Please add DVD!");
        } else {
            System.out.println("\n\033[0;97m╔══════════════════════════════════════╗");
            System.out.println("             \033[0;97mDVD Movie List");
            System.out.println("========================================");
            for (int i = 0; i < drt.size(); i++) {
                dvd_film dvd = drt.get(i);
                if (dvd instanceof duration) {
                    duration dvd1 = (duration) dvd;
                    System.out.println(+(i + 1) + ". DVD Name     : " + dvd1.getNewName());
                    System.out.println("   Genre        : " + dvd1.getNewGenre());
                    System.out.println("   Release Year : " + dvd1.getNewYear());
                    System.out.println("   Director     : " + dvd1.director);
                    System.out.println("   Duration     : " + dvd1.getDuration() + " Hour");
                    System.out.println("   Price        : Rp. " + dvd1.getNewPrice());
                    System.out.println("========================================");
                    System.out.println("----------------------------------------");
                }
            }
            System.out.println("╚══════════════════════════════════════╝");
        }

    }

    private static void withAct(ArrayList<actor> act) {
        if (act.isEmpty()) {
            System.out.println("\n\033[0;91mNo DVD available. Please add DVD!");
        } else {
            System.out.println("\n\033[0;97m╔══════════════════════════════════════╗");
            System.out.println("             \033[0;97mDVD Movie List");
            System.out.println("========================================");
            for (int i = 0; i < act.size(); i++) {
                dvd_film dvd = act.get(i);
                if (dvd instanceof actor) {
                    actor dvd2 = (actor) dvd;
                    System.out.println(+(i + 1) + ". DVD Name     : " + dvd2.getNewName());
                    System.out.println("   Genre        : " + dvd2.getNewGenre());
                    System.out.println("   Release Year : " + dvd2.getNewYear());
                    System.out.println("   Director     : " + dvd2.director);
                    System.out.println("   Actor        : " + dvd2.getActor());
                    System.out.println("   Price        : Rp. " + dvd2.getNewPrice());
                    System.out.println("========================================");
                    System.out.println("----------------------------------------");
                }
            }
            System.out.println("╚══════════════════════════════════════╝");
        }

    }

    private static void withRtg(ArrayList<rating> rtg) {
        if (rtg.isEmpty()) {
            System.out.println("\n\033[0;91mNo DVD available. Please add DVD!");
        } else {
            System.out.println("\n\033[0;97m╔══════════════════════════════════════╗");
            System.out.println("             \033[0;97mDVD Movie List");
            System.out.println("========================================");
            for (int i = 0; i < rtg.size(); i++) {
                dvd_film dvd = rtg.get(i);
                if (dvd instanceof rating) {
                    rating dvd3 = (rating) dvd;
                    System.out.println(+(i + 1) + ". DVD Name     : " + dvd3.getNewName());
                    System.out.println("   Genre        : " + dvd3.getNewGenre());
                    System.out.println("   Release Year : " + dvd3.getNewYear());
                    System.out.println("   Director     : " + dvd3.director);
                    System.out.println("   Rating       : " + dvd3.getRating());
                    System.out.println("   Price        : Rp. " + dvd3.getNewPrice());
                    System.out.println("========================================");
                    System.out.println("----------------------------------------");
                }
            }
            System.out.println("╚══════════════════════════════════════╝");
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int menu;

        while (true) {
            cls();
            System.out.println("\033[0;96m╔══════════════════════════════════════╗");
            System.out.println("║           BlurayFlix Store           ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║ [1] Add DVD                          ║");
            System.out.println("║ [2] Display DVD                      ║");
            System.out.println("║ [3] Update DVD                       ║");
            System.out.println("║ [4] Delete DVD                       ║");
            System.out.println("║ [0] Exit                             ║");
            System.out.println("╚══════════════════════════════════════╝\n");
            System.out.print("\033[0;95mPlease enter your option: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\n\033[0;93m╔══════════════════════════════════════╗");
                    System.out.println("║              ADD DVD                 ║");
                    System.out.println("╚══════════════════════════════════════╝");
                    System.out.print("Enter DVD Name          : ");
                    String dvdName = sc.nextLine();
                    System.out.print("Enter Genre             : ");
                    String genre = sc.nextLine();
                    System.out.print("Enter Release Year      : ");
                    int releaseYear = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Director's Name   : ");
                    String director = sc.nextLine();
                    System.out.print("Enter Price             : ");
                    int price = sc.nextInt();
                    sc.nextLine();
                    dvd_film newDVD = new dvd_film(dvdName, genre, releaseYear, director, price);
                    dvds.add(newDVD);
                    System.out.println("\n\033[0;92mDVD added Successfully!");

                    System.out.print("Add Another DVD Detail? (y/n): ");
                    String choice = sc.nextLine();

                    if (!choice.equalsIgnoreCase("n")) {
                        boolean plus = true;
                        while (plus) {
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("\n\033[0;93m╔══════════════════════════════════════╗");
                            System.out.println("║         ADD ANOTHER DETAIL           ║");
                            System.out.println("╠══════════════════════════════════════╣");
                            System.out.println("║ [1] Duration                         ║");
                            System.out.println("║ [2] Actor                            ║");
                            System.out.println("║ [3] Rating                           ║");
                            System.out.println("║ [0] Exit                             ║");
                            System.out.println("╚══════════════════════════════════════╝\n");
                            System.out.print("\033[0;95mPlease enter your option: ");
                            int detail;
                            detail = sc.nextInt();
                            sc.nextLine();

                            if (detail == 1) {
                                System.out.print("\033[0;95mEnter Duration       : ");
                                int duration = sc.nextInt();
                                sc.nextLine();
                                duration dvd1 = new duration(dvdName, genre, releaseYear, director, price, duration);
                                drt.add(dvd1);

                            } else if (detail == 2) {
                                System.out.print("\033[0;95mEnter Actor's Name   : ");
                                String actor = sc.nextLine();
                                actor dvd2 = new actor(dvdName, genre, releaseYear, director, price, actor);
                                act.add(dvd2);
                            } else if (detail == 3) {
                                System.out.print("\033[0;95mEnter Rating         : ");
                                double rating = sc.nextDouble();
                                sc.nextLine();
                                rating dvd3 = new rating(dvdName, genre, releaseYear, director, price, rating);
                                rtg.add(dvd3);
                            } else if (detail == 0) {
                                plus = false;
                            } else {
                                System.out.println("Invalid Detail!");
                            }

                        }
                    }
                    break;

                case 2:
                    cls();
                    displayDVDs();
                    cls();
                    break;

                case 3:
                    if (dvds.isEmpty()) {
                        System.out.println("\n\033[0;91mNo DVD available. Please add DVD!");
                    } else {
                        int number;
                        do {
                            displayDVDs();
                            System.out.print(
                                    "\n\033[0;92mEnter DVD list number to update (press 0 to back to main menu): ");
                            number = sc.nextInt();
                            sc.nextLine();
                            if (number < 1 || number > dvds.size()) {

                            } else if (number != 0) {
                                int update = number - 1;
                                dvd_film dvd = dvds.get(update);
                                System.out.println("\n\033[0;96m╔══════════════════════════════════════╗");
                                System.out.println("║             UPDATE DVD               ║");
                                System.out.println("╠══════════════════════════════════════╣");
                                System.out.println("║ [1] Change DVD Name                  ║");
                                System.out.println("║ [2] Change DVD Genre                 ║");
                                System.out.println("║ [3] Change DVD Release Year          ║");
                                System.out.println("║ [4] Change DVD Director              ║");
                                System.out.println("║ [5] Change DVD Duration              ║");
                                System.out.println("║ [6] Change DVD Actor                 ║");
                                System.out.println("║ [7] Change DVD Rating                ║");
                                System.out.println("║ [8] Change DVD Price                 ║");
                                System.out.println("║ [0] Back                             ║");
                                System.out.println("╚══════════════════════════════════════╝\n");
                                System.out.print("\033[0;95mPlease enter your option: ");
                                int change = sc.nextInt();
                                sc.nextLine();
                                if (change == 1) {
                                    System.out.print("Enter New DVD Name          : ");
                                    String newdvdName = sc.nextLine();
                                    dvd.setNewName(newdvdName);
                                    System.out.println("\n\033[0;92mDVD Name updated Successfully!");
                                } else if (change == 2) {
                                    System.out.print("Enter New DVD Genre         : ");
                                    String newgenre = sc.nextLine();
                                    dvd.setNewGenre(newgenre);
                                    System.out.println("\n\033[0;92mDVD Genre updated Successfully!");
                                } else if (change == 3) {
                                    System.out.print("Enter New DVD Release Year  : ");
                                    int newReleaseYear = sc.nextInt();
                                    sc.nextLine();
                                    dvd.setNewYear(newReleaseYear);
                                    System.out.println("\n\033[0;92mDVD Release Year updated Successfully!");
                                } else if (change == 4) {
                                    System.out.print("Enter New DVD Director      : ");
                                    String newDirector = sc.nextLine();
                                    dvd.director = newDirector;
                                    System.out.println("\n\033[0;92mDVD Director updated Successfully!");
                                } else if (change == 5) {
                                    for (duration drt : drt) {
                                        System.out.print("Enter New DVD Duration      : ");
                                        int newDuration = sc.nextInt();
                                        sc.nextLine();
                                        drt.setDuration(newDuration);
                                        System.out.println("\n\033[0;92mDVD Duration updated Successfully!");
                                    }
                                } else if (change == 6) {
                                    for (actor act : act) {
                                        System.out.print("Enter New DVD Actor        : ");
                                        String newActor = sc.nextLine();
                                        act.setActor(newActor);
                                        System.out.println("\n\033[0;92mDVD Actor updated Successfully!");
                                    }
                                } else if (change == 7) {
                                    for (rating rtg : rtg) {
                                        System.out.print("Enter New DVD Rating       : ");
                                        double newRating = sc.nextDouble();
                                        sc.nextLine();
                                        rtg.setRating(newRating);
                                        System.out.println("\n\033[0;92mDVD Actor updated Successfully!");
                                    }
                                } else if (change == 8) {
                                    System.out.print("Enter New DVD Price       : ");
                                    int newPrice = sc.nextInt();
                                    dvd.setNewPrice(newPrice);
                                    System.out.println("\n\033[0;92mDVD Price updated Successfully!");
                                } else {
                                    System.out.println("\n\033[0;91mInvalid Option! Try Again.");
                                }
                                displayDVDs();
                            }
                        } while (number != 0);

                    }
                    break;

                case 4:
                    if (dvds.isEmpty()) {
                        System.out.println("\n\033[0;91mNo DVD available. Please add DVD!");
                    } else {
                        displayDVDs();
                        System.out.print("Enter DVD list number to delete: ");
                        int number = sc.nextInt();
                        sc.nextLine();
                        if (number < 1 || number > dvds.size()) {
                            System.out.println("\n\033[0;91mInvalid number, please try again!");
                        } else {
                            if (number < 1 || number > dvds.size()) {
                                System.out.println("\n\033[0;91mInvalid number, please try again!");
                            } else {
                                int delete = number - 1;
                                dvds.remove(delete);
                                System.out.println("\n═════════════════════════════════════════════");
                                displayDVDs();
                                System.out.println("\n\033[0;92mDVD deleted Successfully!");
                            }
                        }
                    }
                    break;
                case 0:
                    System.out.println("\n\033[0;97mExiting program...");
                    System.exit(0);
                    break;
            }
            System.out.println("\n\033[0;93mPress enter to return to the main menu...");
            sc.nextLine();

        }
    }
}