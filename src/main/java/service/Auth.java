package service;

import jdk.jshell.execution.Util;
import model.Event;
import model.User;
import utils.UsersUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Auth {
    private UsersUtils usersUtils;

    public Auth(UsersUtils usersUtils) {
        this.usersUtils = usersUtils;
    }

    public void printMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("1.LOGIN");
            System.out.println("2.REGISTER");
            System.out.println("3.EXIT");
            System.out.println("ENTER YOUR CHOICE");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("ENTER YOUR PHONE NUMBER :");
                long phoneNumber = scanner.nextLong();
                System.out.println("ENTER OTP :");
                int otp = scanner.nextInt();
                ArrayList<User> users = usersUtils.getUsers();
                boolean isUserExit = users.stream().anyMatch(user -> user.getPhoneNumber() == phoneNumber);
                if (isUserExit) {
                    User loggInUser = users.stream().filter(user ->
                                    (user.getPhoneNumber() == phoneNumber) && (user.getEnterOtp() == otp))
                            .findFirst()
                            .get();
                    usersUtils.setLoggedInUser(loggInUser);
                    System.out.println("LOGIN SUCCESSFUL");
                    break;
                } else {
                    System.out.println("!!!INVALID NOT FOUND!!!");
                }
                System.out.println("INVALID USER!!!");

            } else if (choice == 2) {
                System.out.println("ENTER YOUR PHONE NUMBER :");
                long phoneNumber = scanner.nextLong();
                System.out.println("ENTER OTP :");
                int otp = scanner.nextInt();
                System.out.println("SUCCESSFULLY REGISTERED");
                ArrayList<User> users = usersUtils.getUsers();
                User user = new User(users.size() + 1, phoneNumber, otp, new ArrayList<>());
                users.add(user);
                System.out.println("!!!REGISTRATION SUCCESSFUL!!!!");

            } else if (choice == 3) {
                System.exit(0);
            } else {
                System.out.println("INVALID USER!!!");
            }
        }

    }


}
