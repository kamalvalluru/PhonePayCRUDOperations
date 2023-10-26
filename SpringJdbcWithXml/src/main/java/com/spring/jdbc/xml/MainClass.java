package com.spring.jdbc.xml;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.xml.dao.PhonepayMethod;
import com.spring.jdbc.xml.dao.PhonepayMethodImplemention;
import com.spring.jdbc.xml.entities.PhonePayTable;
import com.spring.jdbc.xml.methods.MethodsBody;

public class MainClass 
{
	static Scanner scan=new Scanner(System.in);
    public static void main( String[] args ) throws InterruptedException
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        MethodsBody met= context.getBean("methods",MethodsBody.class);
        System.out.println("List of Methods");
        Thread.sleep(2000);
        System.out.println("1.Insert()"+"\n"+"2.UpdateById()"+"\n"+
        "3.UpdateByName()"+" "+"4.UpdateByCity()"+"\n"+"5.UpdateByPin()"
        +"\n"+"6.DeleteById()"+"\n"+"7.DeleteByName()"+"\n"+"8.DeleteByCity()"
        +"\n"+"9.DeleteByPin()"+"\n"+"10.GetDataByID()"+"\n"+"11.GetAllData()");
        
        System.out.println("Enter Your Choice To perform the Crud Operation");
        
        int choice=scan.nextInt();
        
       switch (choice) {
       case 1:
    	   System.out.println("Welcome to Insert Method");
    	   System.out.println(met.insert());
    	   break;
       case 2:
    	   System.out.println("Welcome to Update By Id Method");
    	   System.out.println(met.updateById());
    	   break;
       case 3:
    	   System.out.println("Welcome to Update By Name Method");
    	   System.out.println(met.updateByName());
    	   break;
       case 4:
    	   System.out.println("Welcome to Update By City Method");
    	   System.out.println(met.updateByCity());
    	   break;
       case 5:
    	   System.out.println("Welcome to Update By Pin Method");
    	   System.out.println(met.updateByPin());
    	   break;
       case 6:
    	   System.out.println("Welcome to DeleteById Method");
    	   System.out.println(met.deleteById());
    	   break;
       case 7:
    	   System.out.println("Welcome to DeleteByName Method");
    	   System.out.println(met.deleteByName());
    	   break;
       case 8:
    	   System.out.println("Welcome to DeleteByCity Method");
    	   System.out.println(met.deleteByCity());
    	   break;
       case 9:
    	   System.out.println("Welcome to DeleteByPin Method");
    	   System.out.println(met.deleteByPin());
    	   break;
       case 10:
    	   System.out.println("Welcome to Get By Object Method");
    	   System.out.println(met.getObject());
    	   break;
       case 11:
    	   System.out.println("welcome to GetAll Method");
    	   System.out.println(met.getAll());
    	   break;
	default:
		System.out.println("You have Enterd the Wrong option"+"\n"+"Enter the valid Option");
		break;
	}
      
    }
}
