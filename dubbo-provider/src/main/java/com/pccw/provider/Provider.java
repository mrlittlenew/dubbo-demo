package com.pccw.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {  
	   
    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");  
        context.start();  
   
        System.in.read(); // Ϊ��֤����һֱ���ţ�������������������ģ��  
    }  
   
} 
