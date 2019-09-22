package com.example.demo.Controller;

import com.example.demo.Service.WordService;
import com.example.demo.repository.domain.Word;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@CrossOrigin
@RestController
public class HomeController {
    //这里有一点错误
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView game(HttpServletRequest request) {
//        request.getSession().setAttribute("msg", "ztype js files\n put in resources/static directory");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }
}
