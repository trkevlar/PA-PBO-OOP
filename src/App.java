public class App {
    public static void main(String[] args) throws Exception {

        boolean selesai = false;
        Integer adminExit = 0;
        Integer userExit = 0;
        Pengguna pengguna = new Pengguna();
        admin admin = new admin();
        user user = new user();
        do {
            adminExit = 0;
            userExit = 0;
            Integer done = pengguna.Menu();
            if (done == 0) {
                selesai = true;
            } else if (done == 2) { // ke menu admin
                while (adminExit == 0) {
                    System.out.println("Selamat datang admin");
                    adminExit = admin.Menu();
                }

            } else if (done == 3) { // ke menu user
                while (userExit == 0) {
                    System.out.println("Selamat datang user");
                    userExit = user.Menu();
                }
            }
        } while (selesai == false);
    }
}
