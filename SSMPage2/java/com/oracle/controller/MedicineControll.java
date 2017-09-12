package com.oracle.controller;

import com.oracle.entity.Medicine;
import com.oracle.mapper.MedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * Created by Administrator on 2017/8/10.
 */
@Controller
public class MedicineControll {
    @Autowired
    private MedMapper medMapper;

//在文本框中接受值的 时候要写required，并且在写查询的时候要穿对象
    @RequestMapping(value = "/medlist", method = {RequestMethod.GET,RequestMethod.POST})
    public String medlist(@RequestParam(value = "mname",required = false)String mname,Model model){
        Medicine medicine= new Medicine();
        medicine.setMname(mname);
        List<Medicine>list =  medMapper.mohuselect(medicine);
        model.addAttribute("medlist",list);
        return "medicine/medlist";

    }

    @RequestMapping(value = "/deletemed",method = {RequestMethod.GET,RequestMethod.POST})
    public String delect(@RequestParam ( "mid" ) int mid,Model model) {
       medMapper.deletemed(mid);
        System.out.println(mid);

            return "redirect:medlist";


    }

    @RequestMapping(value = "addmed",method = {RequestMethod.GET,RequestMethod.POST})
    public String addmed(){
        return "medicine/addmed";
    }

    @RequestMapping(value = "addmed1", method = {RequestMethod.POST,RequestMethod.GET})
    public String addmed1(Medicine medicine,Model model){
         medMapper.addmed(medicine);
        return "redirect:medlist";
    }

    @RequestMapping(value = "updatemed",method = {RequestMethod.GET,RequestMethod.POST})
    public String updatemed(@RequestParam("mid")int mid,Model model){
        model.addAttribute("mid",mid);
        return "medicine/updatemed";
    }

    @RequestMapping(value = "updatemed1",method = {RequestMethod.GET,RequestMethod.POST})
    public String updatemed1(Medicine medicine){


                              medMapper.updatemed(medicine);

                              return "redirect:medlist";

    }





}
