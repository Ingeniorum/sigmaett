package com.ingeniorum.sigmaett.dao.internal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class DataServiceImplTest
{
    @Configuration
    static class ContextConfiguration
    {
        // this bean will be injected into the OrderServiceTest class
        @Bean
        public DataServiceImpl orderService()
        {
            DataServiceImpl orderService = new DataServiceImpl();
            // set properties, etc.
            return orderService;
        }
    }
    
    @Autowired
    DataServiceImpl service;

    @Test
    public void testSetAndGet()
    {
        service.setName("Hello");
        assertEquals("Hello", service.getName());
    }
}
