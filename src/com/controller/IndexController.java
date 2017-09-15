package com.controller;

import com.pojo.LoadedImageFile;
import com.pojo.Product;

import org.apache.commons.lang.xwork.RandomStringUtils;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;


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

    @RequestMapping("/addProduct")
    public ModelAndView add(Product product) throws Exception {
        ModelAndView mav = new ModelAndView("showProduct");
        return mav;
    }

    @ResourceMapping("/jump")
    public ModelAndView jump() throws  Exception{
        ModelAndView mav = new ModelAndView("mew");
        return  mav;


    }

    @RequestMapping("/check")
    public ModelAndView check(HttpSession session) {
        Integer i = (Integer) session.getAttribute("count");
        if (i == null)
            i = 0;
        i++;
        session.setAttribute("count", i);
        ModelAndView mav = new ModelAndView("check");
        return mav;
    }

    @RequestMapping("/uploadImage")
    public ModelAndView uploadImage(HttpServletRequest request, LoadedImageFile file) throws IOException{
        String name = RandomStringUtils.randomAlphanumeric(10);
        String filename = name + ".gif";
        File newFile = new File(request.getServletContext().getRealPath("/image"),filename);
        newFile.getParentFile().mkdir();
        file.getImage().transferTo(newFile);

        ModelAndView mav = new ModelAndView("showUploadedFile");
        mav.addObject("iamgeName",filename);
        return mav;


    }
}

