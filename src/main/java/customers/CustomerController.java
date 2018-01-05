package customers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	
	@Resource
	CustomerRepository customerRepo;
	
	@RequestMapping ("/customers") // this determines what the url is
	public String getAllCourses(Model model) {
	model.addAttribute("customers", customerRepo.findAll());
	return "customers"; // html fil
	
	
}

}