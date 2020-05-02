package com.atguigu.gmall.user.controller;


import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UmsMemberReceiveAddressService;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;



    /**
     *����
     * @return
     */
    @RequestMapping("/test/index")
    @ResponseBody
    public String index() {

        return "hello index";
    }

    /**
     * ��ȡ�����û�
     *
     * @return
     */
    @RequestMapping(value = "/get/user/list", method = RequestMethod.GET)
    @ResponseBody

    public List<UmsMember> getAllUser() {

        return userService.getAllUser();
    }

    /**
     * ����û�
     *
     * @param umsMember
     * @return
     */
    @RequestMapping(value = "/add/user", method = RequestMethod.POST)
    @ResponseBody
    public Integer addUser(UmsMember umsMember) {
        System.out.println(umsMember);

        return userService.addUser(umsMember);
    }

    /**
     * ɾ���û�
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/user/{id}")
    @ResponseBody
    public Integer removeUser(@PathVariable Integer id) {

        return userService.deleteUser(id);
    }
}






