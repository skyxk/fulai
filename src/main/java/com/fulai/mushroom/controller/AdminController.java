package com.fulai.mushroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author ：chen
 * @date ：Created in 2019/11/8 16:50
 */
@Controller
@RequestMapping(value="/admin/")
public class AdminController {



    @RequestMapping(value ="addProduct.html")
    public String addProduct()  {
        return  "products/add";
    }

    @RequestMapping(value ="addNews.html")
    public String addNews()  {
        return  "news/add";
    }

    @RequestMapping(value ="addCase.html")
    public String addCase()  {
        return  "case/add";
    }


}
