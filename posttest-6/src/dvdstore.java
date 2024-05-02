import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class dvdstore {
    static admin user = new admin("admin", "admin123");
    static ArrayList<dvd_film> dvd = admin.dvd();
    static ArrayList<duration> dvd1 = admin.dvd1();
    static ArrayList<actor> dvd2 = admin.dvd2();
    static ArrayList<rating> dvd3 = admin.dvd3();

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, InterruptedException {
        boolean login = false;
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║           BlurayFlix Store           ║");
            System.out.println("════════════════════════════════════════");
            System.out.println("  [1] Login");
            System.out.println("  [0] Exit");
            System.out.println("════════════════════════════════════════");
            System.out.print("Please enter your choice: ");
            int choice = Integer.parseInt(br.readLine());
    
            switch (choice) {
                case 1:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                    System.out.print("  Username  : ");
                    String username = br.readLine();
                    System.out.print("  Password  : ");
                    String password = br.readLine();
    
                    if (username.equals("admin") && password.equals("admin123")) {
                        login = true;
                        System.out.println("\n");
                        System.out.println("  Welcome Back Admin ^_^");
                        Thread.sleep(3000);
                        admin.menuadmin();
                    } else {
                        System.out.println("\n");
                        System.out.println("   Invalid Username or Password");
                        Thread.sleep(2000);
                    }
                    break;
    
                case 0:
                    System.out.println("\nGoodbye!");
                    return;
    
                default:
                    System.out.println("\nInvalid choice. Please try again.");
                    Thread.sleep(2000);
                    break;
            }
    
        } while (!login);
    }
}
    