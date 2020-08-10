package task2Example;

import org.jetbrains.annotations.NotNull;

import java.time.LocalTime;

public class TransportSchedule implements Comparable<TransportSchedule> {
    private Transport type;
    private String route;
    private LocalTime time;

    public TransportSchedule(Transport type, String route, LocalTime time) {
        this.type = type;
        this.route = route;
        this.time = time;
    }


    public Transport getType() {
        return type;
    }

    public String getRoute() {
        return route;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public int compareTo(@NotNull TransportSchedule o) {
        return this.time.compareTo(o.getTime());
    }
}
