package Areaofcircle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("Areaofcircle/applicationContext.xml");
		
		Acircle C = context.getBean("mycircle",Acircle.class);
		System.out.println(C.getOb());
		System.out.println(C.getRadius());
		System.out.println(C.CalArea());
		System.out.println(C.obj());
		context.close();


	}

}
