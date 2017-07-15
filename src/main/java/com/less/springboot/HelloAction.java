package com.less.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wangli0 on 2017/7/15.
 * github https://github.com/wangli0
 * blog http://www.jianshu.com/u/79a88a044955
 * website: http://need88.com
 */
@Controller
@EnableAutoConfiguration
public class HelloAction {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "<p>Hello SpringBoot</p>";
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloAction.class, args);
    }
}
