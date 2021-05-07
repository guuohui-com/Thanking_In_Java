package com.learn.test.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @功能职责:
 * @描述：
 * @作者: 郭辉
 * @创建时间: 2020-12-02
 * @copyright Copyright (c) 2020 中国软件与技术服务股份有限公司
 * @company 中国软件与技术服务股份有限公司
 */
@RestController
@RequestMapping("testCtrl")
public class test {

    @GetMapping("/hello")
    @ResponseBody
    public String test(){
        return "pong";
    }
}
