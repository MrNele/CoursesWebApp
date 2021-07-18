package com.example.courseswebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CoursesController {
    @RequestMapping("courses")
   // @ResponseBody
//    public String courses(String cname, HttpSession session)
    public ModelAndView courses(@RequestParam("cname") String coursename)
    {
//        session.setAttribute("cname",cname);
        ModelAndView mv=new ModelAndView();
            mv.addObject("cname",coursename);
            mv.setViewName("course");
        return mv;
    }
}
