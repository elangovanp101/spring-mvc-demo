package com.luv2code.springdemo.mvc;

        import org.springframework.mock.web.DelegatingServletInputStream;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
       import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.servlet.ModelAndView;

        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @RequestMapping(value = "/" , method = RequestMethod.GET) // Default page
    public String MainPage() {
        System.out.println("check1");
        return "main-menu";
    }

    @RequestMapping("/add")
    public ModelAndView adding(HttpServletRequest request, HttpServletResponse response) {   // gets the inout from user and returns the model and View
        String k = "Welcome";
        String i = request.getParameter("test1");
        String j = request.getParameter("test2");
        //int k = i+j;
        if ((i.equals("Elan"))&& (j.equals("1234")) ){
            k = "Welcome";
        } else   {
            k = "Invalid Login";
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("main2");
        mv.addObject("result", k);
        System.out.println(mv);
        System.out.println(i+ "  "+ j+"  "+ k);
        return mv;

    }





}














