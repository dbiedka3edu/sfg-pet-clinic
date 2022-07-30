package kaloskaiagathos.sfgpetclinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owners","/ownerss/index","/ownerss/index.html"})
    public String listVets(){

        return "owners/index";
    }
}
