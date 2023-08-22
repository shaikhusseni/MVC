package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController2 {
	
	
	@RequestMapping("/husseni")
	public String husseni()
	{
		
		System.out.println("this is class2 okna bro and  controller4");
		return "index3";
	}
	
	@RequestMapping("/hai")
	public String hai()
	{
		
		System.out.println("this is class2 okna bro and  controller5");
		return "index4";
	}

	@RequestMapping("/hai2")
	public String hai2()
	{
		
		System.out.println("this is class2 okna bro and  controller6 and process of index1");
		return "index1";
	}

}
