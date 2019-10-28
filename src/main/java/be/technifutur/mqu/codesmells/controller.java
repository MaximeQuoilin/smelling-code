package be.technifutur.mqu.codesmells;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/")public String main(){return "Classy";}
}
