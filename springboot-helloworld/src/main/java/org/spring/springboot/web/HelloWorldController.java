package org.spring.springboot.web;

import org.spring.springboot.task.MyTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot HelloWorld 案例
 *
 * Created by bysocket on 16/4/26.
 */
@RestController
public class HelloWorldController {

	@Autowired
	private MyTask task;

	/**
	 * http://localhost:8080
	 * 
	 * @return
	 */
	@GetMapping("/")
	public String sayHello() {
//    	String str = task.say666();
//    	System.out.println("str=>"+str);
		System.out.println("say666执行了,222222");
		return "222欢迎进入SpringBoot世界!666";
	}

}
