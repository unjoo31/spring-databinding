package me.summerbell.demospringdatabinding.formatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @GetMapping("/events/{eventsId}")
    public String getEvent(@PathVariable("eventsId") Event event){
        return event.getId().toString();
    }
}
