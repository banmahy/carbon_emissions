package com.example.ceserver.controller;

import com.example.ceserver.service.impl.WeChatLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ClassName WeChatLoginController
 * @Author
 * @Date
 **/
@RestController
public class WeChatLoginController {

    @Autowired
    private WeChatLoginService weChatLoginService;

    @RequestMapping("/login")
    public ResponseEntity<Map<String,String>> weChatLogin(String code, String userInfo) {
        return ResponseEntity.ok(weChatLoginService.login(code, userInfo));
    }

}
