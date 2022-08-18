package multi.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontHelloController {
     @RequestMapping("/")
    public String FrontIndex(){
        return "Front";
    }
}
