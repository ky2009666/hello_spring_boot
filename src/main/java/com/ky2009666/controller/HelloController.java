package com.ky2009666.controller;

import com.ky2009666.properties.ApplicationProperties;
import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
