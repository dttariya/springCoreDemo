package springCoreDemo;




import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
         //Object construction done by developer
		// Employee eRef=new Employee();
		// eRef.setEid(101);
		// eRef.setEname("Riya Dutta");
		 //eRef.setEaddress("Henrico");
		 //System.out.println("Employee Details:"+eRef);//this is going to call the toString() of the Employee class.
		 
		 //Spring Way ...IOC(Inversion of control)
		//this is one types of spring core container which shall parse the XML and construct the object
		// Resource resource=new ClassPathResource("Employeebean.xml");
		// BeanFactory factory=new XmlBeanFactory(resource);
						 
		//In this case BeanFActory API will create object only when  we request{getBean()} for them.
		/* Employee emp1=(Employee)factory.getBean("emp1");
		 Employee emp2=(Employee)factory.getBean("emp2");*/
		 
		
		 
		//this is 2nd types of spring core container which shall parse the XML and construct the object
		 //ApplicationContext API will create object even if we don't request for them
		 ApplicationContext context=new ClassPathXmlApplicationContext("Employeebean.xml");
		 Employee emp1=(Employee)context.getBean("emp1");
		// Employee emp2=(Employee)context.getBean("emp2");
		 
		 System.out.println("Employee 1 Details: "+emp1);
		// System.out.println("Employee 2 Details: "+emp2);
		 
		 ClassPathXmlApplicationContext cxt=(ClassPathXmlApplicationContext)context;
		 cxt.close();//close the context container,then all the objects will be destroyed.
		
		 }
	
}
   