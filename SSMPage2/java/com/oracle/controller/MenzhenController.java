package com.oracle.controller;

import com.oracle.entity.Medicine;
import com.oracle.entity.Patient1;
import com.oracle.entity.Patientinfo;
import com.oracle.mapper.MedMapper;
import com.oracle.mapper.MenzhenMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/11.
 */
@Controller
public class MenzhenController {
    @Autowired
    private MenzhenMapper menzhenMapper;
    @Autowired
    private MedMapper medMapper;
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    @RequestMapping(value = "/menzhen",method = {RequestMethod.GET,RequestMethod.POST})
    public String selectAllpatient(@RequestParam(value = "guahao_id",required = false)String guahao_id,Model model){
        Patient1 patient1 = new Patient1();
        patient1.setGuahao_id(guahao_id);
        List<Patient1> list = menzhenMapper.selectAllPatient(patient1);
        model.addAttribute("list",list);
        return "menzhen/menzhenlist";
    }
    @RequestMapping(value = "/kanbing/{guahao_id}" )
    public String kanbing(@PathVariable String guahao_id,Model model){
        System.out.println(guahao_id);
            Patient1 patient1= menzhenMapper.selecrtbing(guahao_id);
        
        
        
            model.addAttribute("kanbing",patient1);
            return "menzhen/kanbing";
    }
    @RequestMapping(value = "save",method = {RequestMethod.GET,RequestMethod.POST})
    public String save(Patientinfo patientinfo,Model model){
        System.out.println(patientinfo.getRoom());
        System.out.println(patientinfo.getGuahao_id());
        menzhenMapper.save(patientinfo);
       List<Medicine> list=  medMapper.getAllMedicine();
       
        model.addAttribute("list",list);
        
   

        return "menzhen/kaiyao";
    }
    @RequestMapping(value = "/kaiyao1",method = {RequestMethod.GET,RequestMethod.POST})
    public  String kaiyao(){
        return "menzhen/kaiyao";
       
    }

}
