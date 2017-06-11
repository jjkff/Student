
package j.controller;

import j.model.User;
import j.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {
 
	public UserService userService;
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping("/add")
	public String addUser(Model model){
		model.addAttribute(new User());
		return "user/add";
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addUser(User u ,Model model){
		userService.addUser(u);
		return "redirect:/list";
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String listUser(Model model){
		model.addAttribute("users",userService.queryAll());
		return "user/list";
	}
	
	@RequestMapping(value="{id}",method=RequestMethod.GET)
	public String show(Model model,@PathVariable int id){
		model.addAttribute(userService.queryById(id));
	    return "user/show";
	}
	
	@RequestMapping(value="/{id}/update",method=RequestMethod.GET)
	public String update(@PathVariable int id,Model model){
		model.addAttribute(userService.queryById(id));
		return "user/update";
	}
	
	@RequestMapping(value="/{id}/update",method=RequestMethod.POST)
	public String updateUser(@PathVariable int id,User user,BindingResult bt){
		User u = new User();
		u.setId(id);
		u.setUsername(user.getUsername());
		u.setPassword(user.getPassword());
		u.setEmail(user.getEmail());
		u.setNickname(user.getNickname());
		userService.updateUser(u);
		return "redirect:/list";
	}
	@RequestMapping(value="/{id}/delete",method=RequestMethod.GET)
	public String delete(@PathVariable int id){
		userService.delete(id);
		return "redirect:/list";
	}
	
}
