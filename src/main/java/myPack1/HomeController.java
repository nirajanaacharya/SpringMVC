package myPack1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/add")
    public String add(){
        return "display.jsp";
    }
}
