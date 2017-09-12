package com.oracle.controller;

import com.oracle.entity.Patientinfo;
import com.oracle.mapper.BingfangMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Administrator on 2017/8/14.
 */
@Controller
public class BingfangController {
        @Autowired
        private BingfangMapper bingfangMapper;
        @RequestMapping(value = "/bingfang1", method ={RequestMethod.GET,RequestMethod.POST})
        public String bingfang(@RequestParam(value = "guahao_id",required = false)String guahao_id,Model model){
                Patientinfo patientinfo = new Patientinfo();
                patientinfo.setGuahao_id(guahao_id);
                List<Patientinfo> list = bingfangMapper.selectpatientinfo(patientinfo);
                model.addAttribute("list",list);
                return "bingfang/bingfanginfo";
        }
        @RequestMapping(value = "/bingfang")
        public String bingfang(Model model){
                List<Patientinfo> list = bingfangMapper.selectroom();
                model.addAttribute("list",list);
                return "bingfang/bingfanginfo";
        }
        @RequestMapping(value = "deletebingfang/{people_id}")
        public String deletebingfang(@PathVariable int people_id,Model model){
                System.out.println(people_id);
                bingfangMapper.deleteroom(people_id);
                return "redirect:/bingfang";
                
        }
}
