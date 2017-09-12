package com.oracle.controller;

import com.oracle.entity.Hospital;
import com.oracle.entity.Patient1;
import com.oracle.mapper.HosMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/8.
 */
@Controller
public class HosController {
    @Autowired
    private HosMapper hosMapper;
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    @RequestMapping (value = "/denglu", method = {RequestMethod.POST,RequestMethod.GET})
    public String  login(){
        return "hospital/login1";
    }


    @RequestMapping(value = "Registration", method ={RequestMethod.GET,RequestMethod.POST})
    public String  main(){
          return "hospital/Registration";
    }
    @RequestMapping(value = "/login1", method = {RequestMethod.POST, RequestMethod.GET})
    public String login1(Hospital hospital,
                         Model model
    ) {

//        System.out.println(hospital.getPassword());
//        System.out.println(hospital.getUserid());
//        System.out.println(hospital.getUsername());
//        System.out.println(hospital.getEmpolyeeid());
     Hospital h = hosMapper.selectbyname(hospital);
     if (h != null) {
            model.addAttribute("newp", h);
            return "hospital/main";
        }
        return "error1";

    }

    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public String add(@RequestParam(value = "userid", required = false) Integer userid,
                      @RequestParam(value = "empolyeeid", required = false) Integer empolyeeid,
                      @RequestParam(value = "username", required = false) String username,
                      @RequestParam(value = "password", required = false) Integer Password,
                      @RequestParam(value = "limits", required = false) Integer limits

    ) {

        Hospital hospital = new Hospital();
        hospital.setUserid(userid);
        hospital.setEmpolyeeid(empolyeeid);
        hospital.setUsername(username);
        hospital.setPassword(Password);
        hospital.setLimits(limits);

        int result = hosMapper.addpeople(hospital);
        if (result > 0) {
            return "AddSuccess";
        }
        return "adddefault";
    }

    @RequestMapping(value = "/update")
    public String update(@RequestParam(value = "userid", required = false) Integer userid,
                         @RequestParam(value = "empolyeeid", required = false) Integer empolyeeid,
                         @RequestParam(value = "username", required = false) String username,
                         @RequestParam(value = "password", required = false) Integer password,
                         @RequestParam(value = "limits", required = false) Integer limits, Model model
    ) {
        Hospital hospital = new Hospital();
        hospital.setUserid(userid);
        hospital.setEmpolyeeid(empolyeeid);
        hospital.setUsername(username);
        hospital.setPassword(password);
        hospital.setLimits(limits);
        System.out.println(hospital.getUsername());
        System.out.println(hospital.getEmpolyeeid());
        System.out.println(hospital.getUserid());
        System.out.println(hospital.getLimits());
        System.out.println(hospital.getPassword());
        int updateresoult = hosMapper.update(hospital);
        if (updateresoult > 0) {
            return "updatesuccess";
        } else
            return "errorupdate";
    }

    //    @RequestMapping(value ="/guahao1" ,method = {RequestMethod.GET,RequestMethod.POST})
//    public String guahao(Patient1 patient1, Model model){
    //int resoult  = hosMapper.guahao(patient1);
//        System.out.println(patient1.getAge());
//        System.out.println(patient1.getDate());
//        System.out.println(patient1.getHospital_id());
//        System.out.println(patient1.getName());
//        System.out.println(patient1.getGuahao_id());
//      System.out.println(resoult);
//        if (resoult>0){
//            return "guahaosuccess";
//        }else
//            return "guahaoerror";
    @RequestMapping(value = "/guahao1", method = {RequestMethod.GET, RequestMethod.POST})
    public String add(Patient1 patient1,Model model){
               int result = hosMapper.guahao(patient1);
        System.out.println(patient1.getPeople_id());
        System.out.println(patient1.getAge());
        System.out.println(patient1.getSex());
               if (result>0){
                   return "redirect:guahaoselect";
               }
               else
                   return "error";
    }
@RequestMapping(value = "/select",method = {RequestMethod.GET,RequestMethod.POST})
public String select( Model model){
                     List<Hospital> list =   hosMapper.selectList();
                 model.addAttribute("list",list);
                 if (list!=null){
                     return "peoplelist";
                 }
    else
        return "sdf";
}
@RequestMapping(value = "/guahaoselect",method = {RequestMethod.GET,RequestMethod.POST})
    public  String  selectguhao(Model model) {
    List<Patient1> list = hosMapper.select();
    model.addAttribute("newp",list);
    if (list!=null){
        return "hospital/chaxunsuccess";
    }
    else {
        return "hospital/chaxunerror";
    }
}

    @RequestMapping("/delete")
    public String delete(@RequestParam("people_id") int people_id){
       hosMapper.deleteByPrimaryKey(people_id);
        return "redirect:guahaoselect";
    }
@RequestMapping("/update1")
    public String update(@RequestParam("people_id") int people_id,Model model){
        model.addAttribute("people_id",people_id);

        return "hospital/update";

}
@RequestMapping(value = "update2")
    public String update1(Patient1 patient1){
        hosMapper.updateByPrimaryKey(patient1);

         return "redirect:guahaoselect";

}
@RequestMapping(value = "tianjiaguahao")
    public String tianjiaguahao(){
        return "hospital/Registration";

}
@RequestMapping(value = "xiugai")
    public String xiugai(){
        return"hospital/xiugai";
        
}
@RequestMapping(value = "xiugai1")
    public String diugai(@RequestParam(value = "password",required = false) int password,
                                        @RequestParam(value = "newpassword",required = false) int newpassword,
                                        @RequestParam(value = "username",required = false) String username,
                         Model model){
     
    Hospital hospital = new Hospital();

    if (password == newpassword){
        hospital.setUsername(username);
        hospital.setPassword(password);
        hosMapper.gaimima(hospital);
    }
    
         return "hospital/login1";
          
        
        
}
    
}





