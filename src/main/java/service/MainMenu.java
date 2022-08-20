package service;

import model.Event;
import model.Player;
import model.User;
import utils.EventUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    private Auth auth;
    private EventUtil eventUtil;
    private User loggedIUnUser;


    public MainMenu(Auth auth, EventUtil eventUtil, User loggedIUnUser) {
        this.auth = auth;
        this.eventUtil = eventUtil;
        this.loggedIUnUser = loggedIUnUser;
    }

    Scanner scanner = new Scanner(System.in);

    public void printMainMenu() {
        System.out.println("1.SELECT EVENT");
        System.out.println("2.VIEW HISTORY");
        System.out.println("3.LOGOUT");
        System.out.println("ENTER YOUR CHOICE :");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                printEvent();
                break;
            }
            case 2: {
                printHistory();
                break;

            }
            case 3: {
                System.exit(0);

            }
            default: {
                System.out.println("INVALID CHOICE!!!");

            }
        }
    }

    public void printEvent() {
        eventUtil.getEvents().forEach(event -> System.out.println(event.getId() + " - " + event.getMatch()));
        System.out.println("ENTER YOUR CHOICE : ");
        int eventChoice = scanner.nextInt();
        Event selectedEvent = eventUtil.getEvents().get(eventChoice - 1);
        System.out.println("=***Players***=");
        selectedEvent.getPlayers().forEach(player -> {
            System.out.println(player.getId() + ". " + player.getName());
        });
        System.out.println("SELECT 4 Players :");

        String playerOne = scanner.next();
        String playerTwo = scanner.next();
        String playerThree = scanner.next();
        String playerFour = scanner.next();

        ArrayList<Event> events = loggedIUnUser.getEvents();

        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(1, playerOne));
        players.add(new Player(2, playerTwo));
        players.add(new Player(3, playerThree));
        players.add(new Player(4, playerFour));

        Event event = new Event(events.size() + 1,
                selectedEvent.getPrice(), selectedEvent.getMatch(), players);
        events.add(event);

        loggedIUnUser.setEvents(events);
        printMainMenu();

    }

    public void printHistory() {
        ArrayList<Event> events = loggedIUnUser.getEvents();

        if (events.size() > 0) {
            System.out.println("***Events***");
            events.forEach(event -> {
                System.out.println(event.getId() + " - " + event.getMatch() + " - Rs." + event.getPrice());
                System.out.println("***PLayer***");
                event.getPlayers().forEach(player -> System.out.println(player.getId() + " - " + player.getName()));
            });
            printEvent();
        } else {
            System.out.println("No Events");
            printMainMenu();
        }

    }
}
