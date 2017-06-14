package hello;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VirtualPetController {

	public VirtualPetController() {
		VirtualPet fido = new VirtualPet("fido", 80, 50);
		pets.put("fido", fido);
		pets.put("bobo",  new VirtualPet("bobo", 50, 60));
		pets.put("baby", new VirtualPet("baby", 40, 40));
	}

	private Map<String, VirtualPet> pets = new HashMap<>();

	@RequestMapping("/pets")
	public String fetchPets(Model model) {
		model.addAttribute("petsAsMap", pets);
		model.addAttribute("petsAsCollection", pets.values());
		return "petIteration";
	}

}
