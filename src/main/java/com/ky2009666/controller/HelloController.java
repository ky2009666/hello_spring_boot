package com.ky2009666.controller;

import com.ky2009666.properties.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ky2009666
 * @title: HelloController
 * @projectName hello_spring_boot
 * @description: TODO
 * @date 2019/8/23 17:24
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    /**
     * 定义组件.
     */
    @Autowired
    private ApplicationProperties applicationProperties;

    /**
     * SHOW HELLO
     *
     * @return
     */
    @GetMapping("/show")
    public String show() {
        String username = applicationProperties.getUsername();
        System.out.println("username = " + username);
        return "SUCCESSFUL";
    }

    /**
     * 显示INFO信息
     *
     * @param request  请求对象
     * @param response 响应对象
     * @return showInfo
     */
    @GetMapping("/showInfo")
    public String showInfo(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("request = " + request + ", response = " + response);
        System.out.println("request.getSession().getId() = " + request.getSession().getId());
        System.out.println("request = " + request);
        int DEFAULT_INITIAL_CAPACITY = 1 << 4;
        System.out.println("DEFAULT_INITIAL_CAPACITY = " + DEFAULT_INITIAL_CAPACITY);
        return request.getContextPath();
    }

    /**
     * 展示Asert用法
     *
     * @param phone
     * @return
     */
    @GetMapping("/showNo")
    public String showNo(String phone) {
        //Assert.notNull(phone, "手机号码不能为空");
        if (StringUtils.isEmpty(phone)) {
            System.out.println("phone 为空 ");
        }
        return phone;
    }
}
