package com.spring.mvc.chap03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/coffee")
public class CoffeeController {
    /**
     * @request - /coffee/order : GET
     * @response - /
      */
    @GetMapping("/order")
    public String coffeeOrder(){
        System.out.println("/coffee/order : GET 요청 발생!");
        return "chap03/coffee-form";
    }

    /*
    두번째요청
    /coffee/result : post
    응답
     */
    @PostMapping("/result")
    public String coffeeResult(String menu,
                               @RequestParam (defaultValue ="3000")  int price,
                               Model model) {
        System.out.println("menu = " + menu);
        System.out.println("price = " + price);

        model.addAttribute("menu",menu);
        model.addAttribute("p",price);

        return "chap03/coffee-result";
    }
}
