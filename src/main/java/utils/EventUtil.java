package utils;

import model.Event;
import model.Player;

import java.util.ArrayList;

public class EventUtil {
    private ArrayList<Event> events = new ArrayList<>();

    public ArrayList<Event> getEvents() {
        return events;

    }

    public void loadEvent() {
        ArrayList<Player> event1 = new ArrayList<>();
        event1.add(new Player(1, "Rohit Sharma"));
        event1.add(new Player(2, "SURYA KUMAR YADAV"));
        event1.add(new Player(3, "RUBY CURL"));
        event1.add(new Player(4, "JASPRIT BUMRAH"));
        event1.add(new Player(5, "SEAN WILLIAMS"));
        event1.add(new Player(6, "SIKANDAR RAZA"));
        event1.add(new Player(7, "MOHAMMAD SHAMI"));
        event1.add(new Player(8, "HARDHIK PANDYA"));
        event1.add(new Player(9, "SHIKAR DHAWAN"));
        event1.add(new Player(10, "BHUVANESHWAR KUMAR"));
        events.add(new Event(1, 299, "IND vs ZIM", event1));
        ArrayList<Player> event2 = new ArrayList<>();
        event2.add(new Player(1, "DAVIT MILLER"));
        event2.add(new Player(2, "DEWAL BREWIS"));
        event2.add(new Player(3, "RASHID KHAN"));
        event2.add(new Player(4, "MOHAMMAD NABI"));
        event2.add(new Player(5, "ASGAR AFGAN"));
        event2.add(new Player(6, "MOHAMMAD SHEZHAD"));
        event2.add(new Player(7, "CHIRS MORRIS"));
        event2.add(new Player(8, "ABD"));
        event2.add(new Player(9, "JACQUES KALIS"));
        event2.add(new Player(10, "ASIM AMLA"));
        events.add(new Event(2, 299, "AFG vs SA", event2));


    }
}
