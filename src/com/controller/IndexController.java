package com.controller;

import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by byebyejude on 2017/9/9.
 */
@Controller
@RequestMapping("")
public class IndexController {

    @RequestMapping("mew")
    public ModelAndView contorller(ModelAndView mav) {
        System.out.println("1111111111111111111111111111111");
       //   ModelAndView mav = new ModelAndView();
        mav.addObject("message","mew!!!!!!!!!!!!!");
        mav.setViewName("mew");
          return mav;

    }



}

