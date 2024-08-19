package com.example.currencyconverter.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/currency")
public class CurrencyConverterController {


    @GetMapping("/money")
    public String money() {
        return "money";
    }


    @GetMapping("")
    public ModelAndView getCurrency(
            @RequestParam("money") String money

    ) {
        ModelAndView modelAndView = new ModelAndView("CurrencyConverter");

        double amount = Double.parseDouble(money);


        double result = amount * 24000;
        modelAndView.addObject("amount", amount);
        modelAndView.addObject("result", result);

        return modelAndView;
    }
}
