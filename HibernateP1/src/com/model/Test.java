package com.model;

import org.hibernate.Session;

public class Test {
	
	public static void main(String[] args) {
		
      Session ss = HibernateUtil.getSessionFactory().openSession();
		
		Student st = ss.get(Student.class,3);
		
		System.out.println("Roll Number:- "+st.getRollno());
		System.out.println("Name:- "+st.getName());
		System.out.println("Address:- "+st.getAddr());
	}

}
