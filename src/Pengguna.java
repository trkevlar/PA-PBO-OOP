import java.util.ArrayList;
import java.util.Scanner;

public class Pengguna {
    private static ArrayList<String> usernames = new ArrayList<>();
    private static ArrayList<String> passwords = new ArrayList<>();
    private static ArrayList<String> roles = new ArrayList<>();
    private static ArrayList<Integer> ids = new ArrayList<>();
    private static Integer UserSaatIni;
    private static String UserName;
    private static String Password;

    public static void main(String[] args) throws Exception {
        // Login login = new Login("admin", "admin123", "admin", 1);
        Boolean Exit = true;
        Scanner input = new Scanner(System.in);
        do {
            try {
                String menu;
                System.out.println("");
                System.out.println("Menu Utama");
                System.out.println("1. Login");
                System.out.println("2. Register");
                System.out.println("3. Exit");
                System.out.println("");
                System.out.print("Pilih Menu: ");
                menu = input.nextLine();
                switch (menu) {
                    case "1":
                        // System.out.print("login");
                        System.out.print("Username: ");
                        UserName = input.nextLine();
                        System.out.print("Password: ");
                        Password = input.nextLine();
                        login(UserName, Password);
                        break;
                    case "2":
                        // System.out.print("register");
                        System.out.print("Username: ");
                        String username = input.nextLine();
                        System.out.print("Password: ");
                        String password = input.nextLine();
                        register(username, password, "user");
                        break;
                    case "3":
                        System.out.print("exit");
                        Exit = false;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (Exit == true);
        input.close();
    }

    static void register(String username, String password, String role) {
        if (usernames.contains(username)) {
            System.out.println("Username already exists.");
        } else {
            usernames.add(username);
            passwords.add(password);
            roles.add(role);
            ids.add(usernames.size());
            System.out.println("Registration successful.");
        }
    }

    static void login(String username, String password) {
        if (usernames.contains(username) && passwords.contains(password)) {
            int index = usernames.indexOf(username);
            String role = roles.get(index);
            int id = ids.get(index);
            System.out.println("Login successful.");
            System.out.println("Role: " + role);
            System.out.println("ID: " + id);
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
