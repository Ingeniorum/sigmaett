package com.ingeniorum.sigmaett;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ingeniorum.sigmaett.dao.DataService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController
{
    @Autowired
    private DataService service;

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model)
    {
        System.out.println("Home " + service.getName());
        model.addAttribute("name", service.getName());
        return "home";
    }

    @RequestMapping(value = "/name", method = RequestMethod.POST)
    public String setName(@RequestParam("name") String name)
    {
        System.out.println("setName " + name);
        service.setName(name);
        return "redirect:/";
    }

    @RequestMapping(value = "/ajaxtest", method = RequestMethod.POST)
    public @ResponseBody String getTime(@RequestParam("field1") String field1,
            @RequestParam("field2") String field2)
    {
        Random rand = new Random();
        float r = rand.nextFloat() * 100;
        String result = "<br>Next Random # is <b>" + r
                + "</b>. Generated on <b>" + new Date().toString()
                + " field1 = " + field1 + " field2 = " + field2 + "</b>";
        System.out
                .println("Debug Message from CrunchifySpringAjaxJQuery Controller.."
                        + new Date().toString());
        return result;
    }
}
