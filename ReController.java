package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public String one()
	{
		
		System.out.println("this is one handler");
		
//		RedirectView redirectView =new RedirectView();
//		redirectView.setUrl("http://www.google.com");
//		return  redirectView;
		return  "redirect:/enjoy"; 
		
		
		
		
	}
	@RequestMapping("/enjoy")
	public String two()
	{
		System.out.println("this is second handler");
		
		return "";
	}
	
	

}
