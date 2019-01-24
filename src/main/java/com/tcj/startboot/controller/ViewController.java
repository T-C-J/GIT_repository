package com.tcj.startboot.controller;

import com.tcj.startboot.entity.Ch;
import com.tcj.startboot.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class ViewController {
    @RequestMapping("/")
    public ModelAndView index(){
        Map res = new HashMap();
        List l = new ArrayList();
        l.add(new User("1","1"));
        l.add(new User("2","2"));
        l.add(new User("13","3"));
        l.add(new User("14","51"));
        l.add(new User("145","154"));
        res.put("users",l);
        res.put("today",new Date());
        new Ch().ll();
//        res.put("user",u);
        res.put("name","hellllll");
        return new ModelAndView("first",res);
    }
}
