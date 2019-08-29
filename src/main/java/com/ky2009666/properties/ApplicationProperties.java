package com.ky2009666.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ky2009666
 * @title: ApplicationProperties
 * @projectName hello_spring_boot
 * @description: TODO
 * @date 2019/8/29 16:56
 */
@Component
@ConfigurationProperties(prefix = "my")
@Data
public class ApplicationProperties {
    /**
     * 用户名.
     */
    private String username;
    /**
     * 密码.
     */
    private String password;
}
