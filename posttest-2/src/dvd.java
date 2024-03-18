import java.util.Scanner;
import java.util.ArrayList;


public class dvd {
    private static void displayDVDs(ArrayList<dvd_film> dvds) {
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

    public static void main(String[] args) throws Exception {
        ArrayList<dvd_film> dvds = new ArrayList<>();
        Scanner sc =  new Scanner(System.in);
        int menu;
        
        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
    
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
                System.out.print( "Enter Release Year      : ");
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
                    break;
            
            case 2:
                displayDVDs(dvds);
                break;
            
            case 3:
            if (dvds.isEmpty()) {
                System.out.println("\n\033[0;91mNo DVD available. Please add DVD!");
            } else {
                int number;
                do {
                    displayDVDs(dvds);
                    System.out.print("\n\033[0;92mEnter DVD list number to update (press 0 to back to main menu): ");
                    number = sc.nextInt();
                    sc.nextLine();
                if(number < 1 || number > dvds.size()){
                    
                }
                else if (number != 0) {
                    int update = number - 1;
                    dvd_film dvd = dvds.get(update);
                    System.out.println("\n\033[0;96m╔══════════════════════════════════════╗");
                    System.out.println("║             UPDATE DVD               ║");
                    System.out.println("╠══════════════════════════════════════╣");
                    System.out.println("║ [1] Change DVD Name                  ║");
                    System.out.println("║ [2] Change DVD Genre                 ║");
                    System.out.println("║ [3] Change DVD Release Year          ║");
                    System.out.println("║ [4] Change DVD Director              ║");
                    System.out.println("║ [5] Change DVD Price                 ║");
                    System.out.println("║ [0] Back                             ║");
                    System.out.println("╚══════════════════════════════════════╝\n");
                    System.out.print("\033[0;95mPlease enter your option: ");
                    int change = sc.nextInt();
                    sc.nextLine();
                    if(change == 1){
                        System.out.print("Enter New DVD Name          : ");
                        String newdvdName = sc.nextLine();
                        dvd.setNewName(newdvdName);
                        System.out.println("\n\033[0;92mDVD Name updated Successfully!");
                    }
                    else if (change == 2){
                        System.out.print("Enter New DVD Genre         : ");
                        String newgenre = sc.nextLine();
                        dvd.setNewGenre(newgenre);
                        System.out.println("\n\033[0;92mDVD Genre updated Successfully!");
                    }
                    else if (change == 3){
                        System.out.print("Enter New DVD Release Year  : ");
                        int newReleaseYear = sc.nextInt();
                        sc.nextLine();
                        dvd.setNewYear(newReleaseYear);
                        System.out.println("\n\033[0;92mDVD Release Year updated Successfully!");
                    }
                    else if (change == 4){
                        System.out.print("Enter New DVD Director      : ");
                        String newDirector = sc.nextLine();
                        dvd.director = newDirector;
                        System.out.println("\n\033[0;92mDVD Director updated Successfully!");
                    }
                    else if (change == 5){
                        System.out.print("Enter New DVD Price         : ");
                        int newPrice = sc.nextInt();
                        sc.nextLine();
                        dvd.setNewPrice(newPrice);
                        System.out.println("\n\033[0;92mDVD Price updated Successfully!");
                    }
                    else if (change == 0){

                    }
                    else{
                        System.out.println("\n\033[0;91mPlease enter a valid number!");
                    }
                    displayDVDs(dvds);
                }
            } while (number != 0);
            
        }
            break;
            
            case 4:
                if(dvds.isEmpty()) {
                    System.out.println("\n\033[0;91mNo DVD available. Please add DVD!");
                }
                else{
                    displayDVDs(dvds);
                    System.out.print("Enter DVD list number to delete: ");
                    int number = sc.nextInt();
                    sc.nextLine();
                    if(number < 1 || number > dvds.size()){
                        System.out.println("\n\033[0;91mInvalid number, please try again!");
                    }
                    else{
                        if(number < 1 || number > dvds.size()){
                            System.out.println("\n\033[0;91mInvalid number, please try again!");
                        }
                        else{
                            int delete = number - 1;
                            dvds.remove(delete);
                            System.out.println("\n═════════════════════════════════════════════");
                            displayDVDs(dvds);
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