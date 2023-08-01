package me.summerbell.demospringdatabinding.converterwithoutboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @GetMapping("/events/{eventId}")
    public String getEvent(@PathVariable("eventId") Event event){
        return event.getId().toString();
    }
}
