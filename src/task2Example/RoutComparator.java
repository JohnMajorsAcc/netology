package task2Example;

import java.util.Comparator;

public class RoutComparator implements Comparator<TransportSchedule> {

    @Override
    public int compare(TransportSchedule o1, TransportSchedule o2) {
        return o1.getRoute().compareTo(o2.getRoute());
    }
}
