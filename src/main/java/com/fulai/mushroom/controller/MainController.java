package com.fulai.mushroom.controller;

import com.fulai.mushroom.dao.CaseMapper;
import com.fulai.mushroom.dao.demoMapper;
import com.fulai.mushroom.entity.Case;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author ：chen
 * @date ：Created in 2019/11/6 14:03
 */
@Controller
@RequestMapping(value="/")
public class MainController {

    @Autowired
    public demoMapper demoMapper;
    @Autowired
    public CaseMapper caseMapper;

    @RequestMapping(value ="index.html")
    public String index()  {
        return  "index";
    }
    @RequestMapping(value ="about.html")
    public String about()  {
        return  "about";
    }
    @RequestMapping(value ="news.html")
    public String news()  {
        return  "news";
    }

    @RequestMapping(value ="products.html")
    public String products()  {
        return  "products";
    }

    @RequestMapping(value ="case.html")
    public ModelAndView case1()  {
        ModelAndView mv  = new ModelAndView();
        mv.setViewName("case");
        List<Case>  caseList = caseMapper.findCase();
        mv.addObject("caseList",caseList);
        return mv;
    }
    @RequestMapping(value ="contact.html")
    public String contact()  {
        return  "contact";
    }

    @RequestMapping(value ="login.html")
    public String login()  {
        return  "login";
    }

    @RequestMapping(value ="admin.html")
    public String admin(String userName, String password, HttpServletRequest request)  {
        if ("admin".equals(userName)&&"123456".equals(password)){
            HttpSession session = request.getSession();
            session.setAttribute("user","admin");
            return "admin";
        }
        //TODO
        return  "admin";
    }
}
