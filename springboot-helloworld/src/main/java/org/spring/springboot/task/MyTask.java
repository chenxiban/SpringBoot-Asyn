package org.spring.springboot.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyTask {

//	@Async
	public String say666() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("say666执行了,111111");
		return "say666";
	}

}
