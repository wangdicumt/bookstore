package cumt.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cumt.domain.User;
import cumt.service.UserService;



@Controller
public class UserController {
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView login(
			String loginname,String password,
			ModelAndView mv,
			HttpSession session
			){
		
		User user = userService.login(loginname, password);
		if(user!=null){
			session.setAttribute("user", user);
			mv.setView(new RedirectView("/SpringMVCMyBatisGradle/goodmanage"));
		}else{
			mv.addObject("message", "用户名或密码错误！");
			mv.setViewName("userLoginForm");
		}
		return mv;
	}
	
	
	
	@RequestMapping("/register")
	public String register(@Valid @ModelAttribute User user,Errors errors,Model m){
		if(errors.hasErrors()){
			return "userRegisterFrom";
		}
		
		userService.register(user);
		m.addAttribute("message", "注册成功，请登录！");
		return "userLoginForm";
	}
	
	@RequestMapping("/changePassword/{id}")
	public String changePassword(String password,@PathVariable int id, Model m){
		userService.updatePassword(password, id);
		m.addAttribute("message", "密码修改成功，请重新登录！");
		return "changepasswordSuccess";
	}
}
