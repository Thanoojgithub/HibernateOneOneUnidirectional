package com.hibernate.associations.oneoneunidirectional.app;

import java.util.Calendar;

import org.hibernate.Session;

import com.hibernate.associations.oneoneunidirectional.pojo.Employee;
import com.hibernate.associations.oneoneunidirectional.pojo.EmployeeDetails;
import com.hibernate.associations.oneoneunidirectional.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		System.out.println("Hibernate one to one (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Employee employee = new Employee("hanuma");
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.setLocation("kishkinda");
		employeeDetails.setDoj(Calendar.getInstance().getTime());
		employeeDetails.setEmployee(employee);
		session.save(employeeDetails);
		session.getTransaction().commit();
		session.close();
		System.out.println("Done");
	}

}
