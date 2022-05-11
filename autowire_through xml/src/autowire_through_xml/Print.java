package autowire_through_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Print {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("autowire_through_xml/pali.xml");
		
		
		Employee E = (Employee) context.getBean("emp");
		
		System.out.println(E);
		context.close();
	}

}
