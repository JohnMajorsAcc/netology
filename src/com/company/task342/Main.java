package com.company.task342;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Event> eventList = new ArrayList<>();

        eventList.add(new Movie("Knocking on Heaven's door", 1997, 16));
        eventList.add(new Theater("Anna Karenina",  2017, 16));
        eventList.add(new Movie("", 1997, 16));//"The 5th element"
        eventList.add(new Movie("Extreme Ops,", 2002, 12));
        eventList.add(new Theater("Shakespeare’s Sonnets", 2010, 16));

        validEvents(eventList);
    }

    private static void validEvents(List<Event> eventList) {
        for (Event event : eventList) {
            if(event.getTitle() == null || event.getTitle().length() < 1 || event.getAge() == 0 || event.getReleaseYear() == 0){
                throw new RuntimeException("Event " + event + " is not correct.");
            }
        }
        System.out.println("All events are correct!");
    }
}
