package hgm.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/hello")
public class Controller {

	
	@GetMapping("/world")
    public String Metod(@RequestBody String parametre) {
        return "Merhaba" + parametre;
	}

}