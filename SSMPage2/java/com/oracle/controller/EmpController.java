package com.oracle.controller;

import com.oracle.mapper.EmpMapper;
import com.oracle.service.empService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/8/21.
 */
@Controller
public class EmpController {
        @Autowired
        private  empService empService;
@RequestMapping(value = "/emp")
public String login(){
        return "emp/denglu";
}
        @RequestMapping(value = "/emplist")
        public String selectEmp(Model model) {
                model.addAttribute("list", empService.SelectEmp());

          return "emp/emplist";
        }
        @RequestMapping(value = "/deleteemp/{eid}")
        public String deleteEmp(@PathVariable int eid, Model model, HttpServletRequest req){
                System.out.println(eid);
        empService.DeleteEmp(eid);
        return "redirect:/emplist";
        }

}
