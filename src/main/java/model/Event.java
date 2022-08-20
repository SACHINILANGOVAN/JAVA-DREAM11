package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private int id;
    private int price;
    private String match;
    ArrayList<Player> players = new ArrayList<>();

}
