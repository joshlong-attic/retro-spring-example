package demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
class MessageApiRestController {

    @GetMapping("/hi")
    Map<String, String> msg() {
        return Collections.singletonMap("greeting", "Hello, world!");
    }
}
