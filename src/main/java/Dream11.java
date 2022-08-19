import java.util.ArrayList;
import java.util.Scanner;

public class Dream11 {

    public static void main(String[] args) {
        users.add(new TOdelRTRUser(1, 987679, 123));
        users.add(new TOdelRTRUser(2, 819312, 121));

        System.out.println("DREAM11");
        System.out.println("ENTER YOUR CHOICE :");
        System.out.println("1.LOGIN");
        System.out.println("2.REGISTER");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {

            System.out.println("ENTER YOUR PHONE NUMBER :");
            long phoneNumber = scanner.nextLong();
            System.out.println("ENTER OTP :");
            int otp = scanner.nextInt();

            boolean isValid = users.stream().anyMatch(user ->
                    (user.getPhoneNumber() == phoneNumber) && (user.getOtp() == otp)
            );
            if (isValid) {
                System.out.println("CRICKET");
                System.out.println("SELECT MATCH");
                ArrayList<Match> matches = new ArrayList<>();
                matches.add(new Match(1, "IND vs ZIM"));
                matches.add(new Match(2, "AFG vs SA"));

                matches.forEach(match -> {
                    System.out.println(match.getId() + " . " + match.getMatchName());
                });
                System.out.println("ENTER YOUR MATCHES :");
                int match = scanner.nextInt();
                Match selectedMatch = matches.get(match - 1);


                ArrayList<Players> players = new ArrayList<Players>();
                players.add(new Players(1, "ROHIT SHARMA"));
                players.add(new Players(2, "SURYA KUMAR YADAV"));
                players.add(new Players(3, "RUBY CURL"));
                players.add(new Players(4, "JASPRIT BUMRAH"));
                players.add(new Players(5, "SEAN WILLIAMS"));
                players.add(new Players(6, "SIKANDAR RAZA"));
                players.add(new Players(7, "MOHAMMAD SHAMI"));
                players.add(new Players(8, "HARDHIK PANDYA"));
                players.add(new Players(9, "SHIKAR DHAWAN"));
                players.add(new Players(10, "BHUVANESHWAR KUMAR"));
                players.forEach(players1 -> {
                    System.out.println(players1.getId() + " . " + players1.getPlayerName());
                });
                System.out.println("CHOOSE PLAYERS :");
                int choosePlayer1 = scanner.nextInt();
                int choosePlayer2 = scanner.nextInt();
                int choosePlayer3 = scanner.nextInt();
                int choosePlayer4 = scanner.nextInt();
                System.out.println("!!!!....SUCESSFULLY CREATED.....!!!!");
            } else {
                System.out.println("Invalid Phone Number or OTP");
            }


        }
        else if (choice == 2){
            System.out.println("ENTER YOUR PHONE NUMBER :");
            int Choice = scanner.nextInt();
            System.out.println("ENTER OTP :");
            int Choice1 = scanner.nextInt();
            System.out.println("ENTER YOUR CHOICE :");
            System.out.println("1.LOGIN");
            System.out.println("2.REGISTER");

        }

        else {
            System.out.println("INVALID USER");
            System.out.println("ENTER YOUR CHOICE :");
            System.out.println("1.LOGIN");
            System.out.println("2.REGISTER");
        }
        }
    }
