//package edu.poly.controller;
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import edu.poly.entity.Account;
//import edu.poly.service.UserService;
//
//
//@Controller
//public class RegisterController {
//	@Autowired
//    private UserService userService;
//
//    @GetMapping("/register")
//    public String showRegistrationForm(Model model) {
//        model.addAttribute("account", new Account());
//        return "account/register";
//    }
//
//    @PostMapping("/register")
//    public String registerUser(@ModelAttribute("account") Account account, Model model) {
//    	account.setIsadmin(false);
//        if (userService.isUserExist(account.getMand())) {
//            model.addAttribute("error", "Tên người dùng đã tồn tại");
//            return "register";
//        }
//
//        userService.createAccount(account);
//        return "redirect: /account/login"; // chuyển hướng đến trang đăng nhập sau khi đăng ký thành công
//    }
//}
