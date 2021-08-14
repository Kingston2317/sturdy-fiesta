package org.example.storefinder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private static final String msg = "Success";

    @GetMapping("/api/test")
    public Response test() {
        return new Response(msg);
    }
}
