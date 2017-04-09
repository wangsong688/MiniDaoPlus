package test;

import examples.dao.EmployeeDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import examples.dao.JeecgDemoDao;
import examples.entity.Employee;

import java.net.URL;

public class ClientDao {
	public static void main(String args[]) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		JeecgDemoDao employeeDao = (JeecgDemoDao) factory.getBean("jeecgDemoDao");
		System.out.println("--------------count------------------"+employeeDao.getCount());
		Employee employee = new Employee();
		employee.setName("张开忠");
		//employeeDao.getCount();


        URL sqlFileUrl =
                ClientDao.class.getClassLoader().getResource("examples/sql/EmployeeDao_insert.sql");
        System.err.print(sqlFileUrl);
		
		
		
		//------------------------------------------------------------------
//		long begin_date = System.currentTimeMillis();
//		List<Map> list =  employeeDao.getAllEmployees(employee);
//		long end_date = System.currentTimeMillis();
//		System.out.println("MiniDao Sql 耗时: "+(end_date-begin_date)+" 毫秒");
//		
//		
//		
//		long begin_date1 = System.currentTimeMillis();
//		List<Map> list1 =  employeeDao.getAllEmployees(employee);
//		long end_date1 = System.currentTimeMillis();
//		System.out.println("MiniDao Sql 耗时: "+(end_date1-begin_date1)+" 毫秒");
//		
//		
//		
//		long begin_date2 = System.currentTimeMillis();
//		List<Map> list2 =  employeeDao.getAllEmployees(employee);
//		long end_date2 = System.currentTimeMillis();
//		System.out.println("MiniDao Sql 耗时: "+(end_date2-begin_date2)+" 毫秒");
//		
//		long begin_date3 = System.currentTimeMillis();
//		List<Map> list3 =  employeeDao.getAllEmployees(employee);
//		long end_date3 = System.currentTimeMillis();
//		System.out.println("MiniDao Sql 耗时: "+(end_date3-begin_date3)+" 毫秒");
		//------------------------------------------------------------------
		
		
		
//		List<Map> list =  employeeDao.getAllEmployees(employee);
//		for(Map mp:list){
//			System.out.println(mp.get("id"));
//			System.out.println(mp.get("name"));
//			System.out.println(mp.get("empno"));
//			System.out.println(mp.get("age"));
//			System.out.println(mp.get("birthday"));
//			System.out.println(mp.get("salary"));
//		}
	}
}
