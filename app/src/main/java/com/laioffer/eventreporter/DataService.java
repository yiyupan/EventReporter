package com.laioffer.eventreporter;

import java.util.ArrayList;
import java.util.List;

public class DataService {

    public static List<Event> getEventData() {
        List<Event> eventData = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            eventData.add(
                    new Event("Event", "1911 California Street, MTV, CA 94040", "This is a huge event")
            );
        }
        return eventData;
    }
}
