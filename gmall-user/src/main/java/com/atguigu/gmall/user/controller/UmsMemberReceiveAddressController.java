package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UmsMemberReceiveAddressController {

    @Autowired
    UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    /**
     * 根据用户的id查询用户地址
     *
     * @param memberId
     * @return
     */
    @RequestMapping(value = "/get/address/{memberId}", method = RequestMethod.GET)
    @ResponseBody
    public List<UmsMemberReceiveAddress> getUmsAddressByUserId(@PathVariable Integer memberId) {

        return umsMemberReceiveAddressService.getAddressByUmsMemberId(memberId);
    }

    /**
     * 根据地址id删除地址
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/remove/address/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Integer removeUmsAddressById(@PathVariable Integer id) {

        return umsMemberReceiveAddressService.removeUmsAddress(id);

    }

}
