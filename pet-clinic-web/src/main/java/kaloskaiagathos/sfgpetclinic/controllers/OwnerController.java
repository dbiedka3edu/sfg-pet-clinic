package kaloskaiagathos.sfgpetclinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class OwnerController {

    @RequestMapping({"/owners","/owners/index","/owners/index.html"})
    public String listVets(){

        return "owners/index";
    }


}
