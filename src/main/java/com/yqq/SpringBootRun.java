package com.yqq;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yqq.config.spring.DataSourceConfig;
import com.yqq.config.swagger.SwaggerConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@EnableAutoConfiguration
//@Import({TestConfiguration.class, SwaggerConfig.class})
//@EnableJpaRepositories(basePackages = {"com.yqq.spring.repository"})
//@EntityScan("com.yqq.spring")

//@EnableConfigurationProperties(DocumentServerProperties.class)

//@Api(value = "SayController|一个用来测试swagger注解的控制器")

@SpringBootApplication
@Import({
        DataSourceConfig.class,
        SwaggerConfig.class
})

public class SpringBootRun {
//
//
//    @Autowired
//    DocumentServerProperties documentServerProperties;
//
//    @Autowired
//    GoodsInfoService goodsInfoService;
//
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello Word!";
    }
//
//    @RequestMapping("t")
//    @ResponseBody
//    String test() {
////        System.out.println(documentServerProperties);
//
//        List l = goodsInfoService.findAll();
//        String s = JSON.toJSONString(l);
//        System.out.println("----------------------goods-----------------------");
//        for (Object o : l) {
//            System.out.println(JSONObject.toJSONString(o));
//        }
//
//        System.out.println("---------------------------------------------");
//
//
//        List l2 = goodsInfoService.findAllColor();
//        System.out.println("----------------------color-----------------------");
//        for (Object o : l2) {
//            System.out.println(JSONObject.toJSONString(o));
//        }
//        System.out.println("---------------------------------------------");
//
//        Color color = goodsInfoService.findColorByValue("白色");
//        GoodsInfo goodsInfo = color.getGoodsInfo();
//        return JSONObject.toJSONString(color);
//    }
//
//
//    @ResponseBody
//    @RequestMapping(value ="/getUserName", method= RequestMethod.GET)
//    @ApiOperation(value="根据用户编号获取用户姓名", notes="test: 仅1和2有正确返回")
//    @ApiImplicitParam(paramType="query", name = "userNumber", value = "用户编号", required = true, dataType = "Integer")
//    public String getUserName(@RequestParam Integer userNumber){
//        if(userNumber == 1){
//            return "张三丰";
//        }
//        else if(userNumber == 2){
//            return "慕容复";
//        }
//        else{
//            return "未知";
//        }
//    }


    public static void main(String[] args) {


        SpringApplication.run(SpringBootRun.class, args);

    }

}
