import java.util.ArrayList;
import java.util.Scanner;

public class Pengguna {
  ArrayList<String> usernames = new ArrayList<>();
  ArrayList<String> passwords = new ArrayList<>();
  ArrayList<String> roles = new ArrayList<>();
  ArrayList<Integer> ids = new ArrayList<>();
  Integer UserSekarang;
  String menu = null;

  public Pengguna() {
    usernames.add("admin");
    passwords.add("admin");
    roles.add("admin");
    ids.add(usernames.size());
  }

  public Integer Menu() {
    Scanner input = new Scanner(System.in);
    System.out.println("====================================");
    System.out.println("Selamat datang di aplikasi kami");
    System.out.println("");
    System.out.println("1. Login");
    System.out.println("2. Register");
    System.out.println("3. Exit");
    System.out.println("");
    menu = input.nextLine();
    switch (menu) {
      case "1":
        System.out.println("Login");
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();
        Integer loginResult = login(username, password);
        if (loginResult == 1) { // Admin
          System.out.println("Login successful as admin2.");
          return 2;
        } else if (loginResult == 2) { // User
          return 3;
        } else {
          System.out.println("Login failed.");
          break;
        }
      case
          "2":
        System.out.println("Register");
        break;
      case "3":
        System.out.println("Exit");
        input.close();
        return 0;
      default:
        System.out.println("Inputan tidak valid");
    }
    return 1;
  }

  void register(String username, String password, String role) {
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

  Integer login(String username, String password) {
    if (usernames.contains(username) && passwords.contains(password)) {
      int index = usernames.indexOf(username);
      String role = roles.get(index);
      int id = ids.get(index);
      // System.out.println("Login successful.");
      // System.out.println("Role: " + role);
      // System.out.println("ID: " + id);
      UserSekarang = id;
      if (role.equals("admin")) {
        System.out.println("Login successful as admin.");
        return 1;
      } else if (role.equals("user")) {
        System.out.println("Login successful as user.");
        return 2;
      } else {
        System.out.println("Unknown role.");
        return 0;
      }
    } else {
      System.out.println("Invalid username or password.");
    }
    return 0;
  }
}

class admin extends Pengguna {
  @Override
  public Integer Menu() {
    System.out.println("Menu Admin");
    System.out.println("1. Add User");
    System.out.println("2. Delete User");
    System.out.println("3. View Users");
    System.out.println("4. Exit");
    Scanner input = new Scanner(System.in);
    super.menu = input.nextLine();
    switch (super.menu) {
      case "1":
        System.out.println("Add User");
        break;
      case "2":
        System.out.println("Delete User");
        break;
      case "3":
        System.out.println("View Users");
        break;
      case "4":
        System.out.println("Exit");
        return 1;
      default:
        System.out.println("Inputan tidak valid");
    }
    return 1;
  }
}
