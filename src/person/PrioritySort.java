package person;

import java.util.Comparator;

public class PrioritySort  implements Comparator<PersonBase> {

    @Override
    public int compare(PersonBase o1, PersonBase o2) {
        return Integer.compare(o2.priority, o1.priority);
    }
}