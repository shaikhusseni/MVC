package springmvc;

import javax.servlet.http.HttpServletRequest;

//import org.apache.catalina.User;       due to  this  Ib got error at line 50.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;



@Controller
public class ContactController {
	
@Autowired
private UserService userService;

@ModelAttribute
public void commonDataForModel(Model model)	{
model.addAttribute("Header","learnCodeWith husseni");
model.addAttribute("Desc","Home for programming by durgesh sir channel");
	
}

	@RequestMapping("/contact")
	public String showForm(Model m)
	{
		System.out.println("creating form");
		return "contact";
		
	}
	

	
	@RequestMapping(path="/processform", method= RequestMethod.POST)
	
public String  handelForm(@ModelAttribute("user") User user, Model model)
{
	
		System.out.println(user);
		this.userService.createUser(user);
		
		
		return "success";
//		process

		
	
	
//	public String handleForm(HttpServletRequest request)
//	{
//	 String email=request.getParameter("email");
//		System.out.println("user email is"+email);
//		return ""; old  way
	
	
//	
//	@RequestMapping(path="/processform", method= RequestMethod.POST)
//	public String handleForm (
//			@RequestParam("useremail") String userEmail,
//			@RequestParam("username") String userName,
//			@RequestParam("userpassword") String userPassword,Model model)
//	{
//		User user=new User();
//		user.setUseremail(userEmail);
//		user.setUsername(userName);
//		user.setUserpassword(userPassword);
//		
//		System.out.println(user);
//		
//
		
		
//		System.out.println("user Emial:"+userEmail);
//		System.out.println("user Name:"+userName);
//		System.out.println("user Password:"+userPassword);
//	
//		model.addAttribute("email",userEmail);
//		model.addAttribute("name",userEmail);
//		model.addAttribute("password",userEmail);
//	 above all51-4 in one line 56
		
//		model.addAttribute("user",user);
//		return "success";
		
		
//}
	
}
}