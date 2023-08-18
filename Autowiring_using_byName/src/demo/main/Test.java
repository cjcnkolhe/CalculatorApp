package demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.pojo.Student;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		 Student s=(Student) ac.getBean("s");
		 
		 System.out.println(s.getRollno());
		 System.out.println(s.getAdr().getLocalAddress());
         System.out.println(s.getAdr().getPermentAddress());
		 
		
	}

}
