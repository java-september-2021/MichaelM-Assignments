package helloHumanController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class helloController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false,defaultValue="Human")String name,Model veiwModel ) {
		System.out.println("Hello");
		veiwModel.addAttribute("name",name);
		return "index.jsp";
		
	}

}
