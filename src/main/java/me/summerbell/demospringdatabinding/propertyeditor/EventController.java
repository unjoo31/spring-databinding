package me.summerbell.demospringdatabinding.propertyeditor;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @InitBinder
    public void init(WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(Event.class, new EventPropertyEditor());
    }

    @GetMapping("/events/{eventId}")
    public String getEvent(@PathVariable("eventId") Event event){
        return event.getId().toString();
    }

}
