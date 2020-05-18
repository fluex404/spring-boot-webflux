package com.fluex404.springbootwebflux.api;

import com.fluex404.springbootwebflux.model.Usage;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Date;
import java.util.Random;

@RestController
public class UsageAPI {

    /**
     * Flux for list
     * Mono for object
     */

//    @CrossOrigin("*") or @CrossOrigin(allowedHeaders = "*")
    // SSE must use TEXT_EVENT_STREAM_VALUE by default spring produce APPLICATION_JSON_VALUE
    @GetMapping(value="/event/usages", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Usage> getUsageResources(){
        Random r = new Random();

        // this will push data every 1 secound
        return Flux.interval(Duration.ofSeconds(1))
                .map(p -> (
                        new Usage(
                                r.nextInt(101),
                                r.nextInt(101),
                                new Date())
                ));
    }
}
