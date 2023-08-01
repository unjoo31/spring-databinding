package me.summerbell.demospringdatabinding.converterwithoutboot;

import org.springframework.core.convert.converter.Converter;

public class EventConverter implements Converter<String, Event> {
    @Override
    public Event convert(String source) {
        return new Event(Integer.parseInt(source));
    }
}
