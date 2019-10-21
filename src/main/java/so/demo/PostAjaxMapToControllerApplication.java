package so.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@SpringBootApplication
@Controller
public class PostAjaxMapToControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostAjaxMapToControllerApplication.class, args);
    }

    @GetMapping
    public String post() {
        return "post";
    }

    @PostMapping("/post")
    public void post(@RequestBody Map<String,String> data) {
        System.out.println(data);
    }

}
