package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //how we handle requests - when we type in a url and send a request
public class GreetingController {

	@RequestMapping("/greeting") //greeting part of request maps the path
	public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name); //saying it will read a name, but not required, if not specified, World
		return "greeting";	//a lot like a map, map key name and the name
		//greeting.html file 
	}
	
    //we can do it without defaults for a parameter
    // the parameter will be *required*
    @RequestMapping("/greetAgain")
    public String greetAgain(@RequestParam(value="name") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    
    // we can do it without the model
    @RequestMapping("/noModel")
    public String doFoo() {
        return "foo";
    }
}
