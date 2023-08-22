package springmvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

//Update using @RequestMapping using on class

@RequestMapping("first")
public class HomeController {
	
	@RequestMapping(path="/home", method =RequestMethod.GET)
public String home(Model model)
{
		
		
		
		System.out.println("this is about  controller1");
		model.addAttribute("name", "husseni sharesa"); // key value 
		
		model.addAttribute("id",126);
		
		List<String> friends=new ArrayList<String>();
		friends.add("vandhana");
		friends.add("mandhana");
		friends.add("kindhana");
		friends.add("dengana");
		friends.add("pandana");
		model.addAttribute("f", friends);
		System.out.println("okna sir");
		return "index1";
	}
	
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about controller2");
		return "index4";
	}
	

}
