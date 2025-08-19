package com.OLX;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.OLX.Controller.UserController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) 
	{

		try (ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args)) 
		{
			UserController bean = ctx.getBean("UserControl",UserController.class);
			bean.register();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
