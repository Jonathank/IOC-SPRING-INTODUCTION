/**
 * 
 */
package spring.app;

import org.springframework.context.*;
import org.springframework.context.support.*;
import org.springframework.core.io.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import spring.employee.Employee;
/**
 * @author JONATHAN
 */
public class Application {

	public static void main(String [] arg) {
		
		// used ApplicationContext IOC(Inversion of control )
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/Employee.xml");
		Employee em1 = (Employee) context.getBean("emp1");
		Employee em2 = context.getBean("emp2",Employee.class);
		
		System.out.println(em1);
		System.out.println(em2);
		
		System.out.println();
		System.out.println("---------------------BEAN FACTORY VERSION OF IOC---------------BELOW");
		System.out.println();
		//use Bean Factory form of IOC
		Resource resource = new ClassPathResource("spring/Employee.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee em3 = (Employee) factory.getBean("emp1");
		Employee em4 = factory.getBean("emp2",Employee.class);
		
		System.out.println(em3);
		System.out.println(em4);
		
		
	}
}
