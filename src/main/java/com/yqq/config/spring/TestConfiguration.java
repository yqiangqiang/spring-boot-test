package com.yqq.config.spring;

import org.springframework.context.annotation.Configuration;

//
@Configuration  //等价于<Beans></Beans>
//@ComponentScan(basePackages = "com.yqq.spring")//等价于<context:component-scan base-package="com.dxz.demo"/>
//@EnableJpaRepositories(basePackages = {"com.yqq.spring.repository"})
//@EntityScan("com.yqq.spring") //扫描实体类
//
//@EnableAutoConfiguration //

//引入其他注解配置

/**
@ImportResource("classpath:applicationContext-configuration.xml")
**/
//@EnableConfigurationProperties(DocumentServerProperties.class)
public class TestConfiguration {


    // @Bean注解注册bean,同时可以指定初始化和销毁方法
    // @Bean(name="testBean",initMethod="start",destroyMethod="cleanUp")

    public TestConfiguration() {
        System.out.println("容器初始化。。。。");
    }

//    @Bean //等价于<Bean></Bean>
//    public TestBean testBean2() {
//        return new TestBean();
//    }



}
