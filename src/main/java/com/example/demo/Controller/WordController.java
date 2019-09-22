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
@RequestMapping("/word")
public class WordController {

    @Autowired
    private WordService wordService;

    @RequestMapping(value = "/getWord", method = RequestMethod.POST)
    public ArrayList<Word> get(Map map, HttpServletRequest request) {
        ArrayList<Word> arrayList = new ArrayList<Word>();
        System.out.println("getWord " + wordService.getWord().get(0));
        arrayList.addAll(wordService.getWord());
        return arrayList;
    }

    //这里有一点错误
//    @RequestMapping(value = "/ztype", method = RequestMethod.POST)
//    public ModelAndView game(HttpServletRequest request) {
////        request.getSession().setAttribute("msg", "ztype js files\n put in resources/static directory");
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("index");
//        return mav;
//    }

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView game(Map map, HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("index");
//        return mav;
//    }

    @RequestMapping(value = "/manage", method = RequestMethod.GET)
    public ModelAndView home(Map map, HttpServletRequest request) {
        ArrayList<Word> arrayList = new ArrayList<Word>();
        arrayList.addAll(wordService.getWord());
        System.out.println(arrayList.get(0));
        request.getSession().setAttribute("words", arrayList);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("manage");
        return mav;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> delete(
            @RequestParam(value = "ids[]", required = true) Long[] ids
    ) {
        System.out.println("this is delete");
        Map<String, String> ret = new HashMap<String, String>();
        if (ids == null) {
            ret.put("type", "error");
            ret.put("msg", "请选择要删除的数据!");
            return ret;
        }
        String idsString = "";
        for (Long id : ids) {
            idsString += id + ",";
        }
        idsString = idsString.substring(0, idsString.length() - 1);
        if (wordService.deleteArray(idsString) <= 0) {
            ret.put("msg", "删除失败!");
            return ret;
        }
        ret.put("msg", "修改成功!");
        return ret;
    }
}
