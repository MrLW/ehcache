package com.lw.spring.ehcache;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations={"classpath:application.xml"})
public class EhcacheTest  extends AbstractJUnit4SpringContextTests{

	@Autowired  
    private EhcacheService ehcacheService;

    @Test  
    public void getTimestampTest() throws InterruptedException{  
        System.out.println("第一次调用：" + ehcacheService.getTime("param"));
        Thread.sleep(2000);
        System.out.println("2秒之后调用：" + ehcacheService.getTime("param"));
        Thread.sleep(11000);
        System.out.println("再过11秒之后调用：" + ehcacheService.getTime("param"));
    } 
}
