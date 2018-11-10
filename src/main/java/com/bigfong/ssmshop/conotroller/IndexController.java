package com.bigfong.ssmshop.conotroller;

import com.bigfong.ssmshop.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class IndexController {

    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("employees", employeeService.listAll());

        System.out.println( employeeService.listAll());
        return "hello.btl";
    }
}
