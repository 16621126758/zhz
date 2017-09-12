package com.oracle.controller;

import com.oracle.entity.Login;
import com.oracle.mapper.HospitalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/8/4 0004.
 */
@Controller
public class HospitalController {
    @Autowired
    private HospitalMapper hospitalMapper;


    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public String login(@RequestParam(value = "username", required = false) String username,
                        @RequestParam(value = "userid", required = false) Integer userid,
                        @RequestParam(value = "employeeid", required = false) Integer employeeid,
                        @RequestParam(value = "password", required = false) String password,

                        Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Login login = new Login();

        login.setUserid(userid);
        login.setEmployeeid(employeeid);
        login.setUsername(username);
        login.setPassword(password);
        Login result = hospitalMapper.loginByNameAndPassword(login);
        Cookie[] cs = request.getCookies();
        Cookie cuname = new Cookie("username", username);
        Cookie cuserid = new Cookie("userid", "");
        Cookie cemployeeid = new Cookie("employeeid", "");
        Cookie pwd = new Cookie("pwd", password);
        for (Cookie c : cs) {
            cuname = new Cookie("username", username);
            cuserid = new Cookie("userid", userid.toString());
            cemployeeid = new Cookie("employeeid", employeeid.toString());
            pwd = new Cookie("pwd", password);
            cuname.setMaxAge(60 * 60 * 24);
            cuserid.setMaxAge(60 * 60 * 24);
            cemployeeid.setMaxAge(60 * 60 * 24);
            pwd.setMaxAge(60 * 24 * 60);
        }
        response.addCookie(cuname);
        response.addCookie(cuserid);
        response.addCookie(cemployeeid);
        response.addCookie(pwd);
        Login userresult = hospitalMapper.loginByNameAndPassword(login);
        if (userresult != null) {
            //login.setLimits(userresult.getLimits());
//                   登录成功
            //  List<Login> lists = (List<Login>) hospitalMapper.loginByNameAndPassword(login);
            // model.addAttribute("lists", lists);//回显用户信息
            model.addAttribute("currentUser", userresult);
            return "hospital/main";
        }
        return "                  GHJHJJGCVBNerror";
    }


    @RequestMapping(value = "/alertpwd", method = {RequestMethod.GET, RequestMethod.POST})
    public String alertPassword(){
        return "alertpwd";
    }


    @RequestMapping(value = "/alertpwd.do", method = {RequestMethod.GET, RequestMethod.POST})
    public String alertPassword(@RequestParam(value = "username", required = false)String username,
                                @RequestParam(value = "password", required = false) String password,
                                @RequestParam(value = "newpwd", required = false) String newpwd,
                                @RequestParam(value = "newpwd2", required = false) String newpwd2,
                                Model model) throws Exception {
        Login login = new Login();
        login.setUsername(username);
        login.setPassword(password);
        Login userresult = hospitalMapper.getAll(login);
        if (userresult != null && newpwd.equals(newpwd2)) {
            login.setUsername(username);
            login.setPassword(newpwd.toString());
            int result = hospitalMapper.updatePassword(login);
            if (result > 0) {
                return "login";
            }
        }
        return "error1";
    }

}
