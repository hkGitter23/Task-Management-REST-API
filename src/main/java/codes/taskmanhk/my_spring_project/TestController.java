package codes.taskmanhk.my_spring_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public String getString() {
        return "Here is the string!";
    }
}
