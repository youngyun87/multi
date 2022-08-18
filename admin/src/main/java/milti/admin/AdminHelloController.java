package milti.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminHelloController {

    @RequestMapping("/")
    public String adminIndx(){
        return "admin";
    }
}
