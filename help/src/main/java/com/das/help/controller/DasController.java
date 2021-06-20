package com.das.help.controller;
import com.das.help.util.HttpClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/pay")
public class DasController {


    @RequestMapping("/test")  // 处理请求路径为/test的请求
    public String test(){
        return "测试成功";
    }

    @GetMapping("/create")
    public ModelAndView create(){
        //改成自己的以太坊地址
        String address = "0xadbfbe3fb52ed97d1595c5b524f8902c81141f1f";
        List<String>accountList = new ArrayList<String>();
        List<String>urlList = new ArrayList<String>();
        String url = "https://test-api.da.systems/v1/das_submitRegisterOrder";

        accountList.add("asdfasdfa.bit");
        accountList.add("bakkkkkk.bit");
        accountList.add("asfasdfa.bit");

        for (String account : accountList){
            String codeUrl = "";
            try {
                codeUrl = HttpClient.getCodeUrl(account);
            }catch (Exception e){

            }

            urlList.add(codeUrl);
        }
        /*{"jsonrpc":"2.0","id":3,"method":"das_submitRegisterOrder","params":[{"chain_type":1,"address":"0xadbfbe3fb52ed97d1595c5b524f8902c81141f1f","account":"asdfasfa.bit","pay_chain_type":4,"pay_token_id":"wx_cny","pay_address":"0xadbfbe3fb52ed97d1595c5b524f8902c81141f1f","pay_type":"wx_native","register_years":20,"inviter_account":"","account_char_str":[{"char_set_name":2,"char":"a"},{"char_set_name":2,"char":"s"},{"char_set_name":2,"char":"d"},{"char_set_name":2,"char":"f"},{"char_set_name":2,"char":"a"},{"char_set_name":2,"char":"s"},{"char_set_name":2,"char":"f"},{"char_set_name":2,"char":"a"},{"char_set_name":2,"char":"."},{"char_set_name":2,"char":"b"},{"char_set_name":2,"char":"i"},{"char_set_name":2,"char":"t"}]}]}*/
        Map<String,List> map=new HashMap<>();
        map.put("urlList",urlList);//将获得的codeUrl放入map中
        return new ModelAndView("create",map);//携带数据map到create.ftl页面
    }


}
