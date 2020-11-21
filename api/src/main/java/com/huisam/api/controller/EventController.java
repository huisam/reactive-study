package com.huisam.api.controller;

import com.huisam.common.dto.EventDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @GetMapping("/event")
    public EventDto event() {
        return new EventDto("hi", "fjklsdjfoi", 2);
    }
}
