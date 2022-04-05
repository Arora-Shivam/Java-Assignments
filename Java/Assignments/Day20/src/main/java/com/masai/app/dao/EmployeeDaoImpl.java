package com.masai.app.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transaction;

import com.masai.app.beans.Employee;
import com.masai.app.utility.EmUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list=null;
		
		EntityManager em=EmUtil.provideEntityManager();
		
		String jpql="from Employee";
		
		Query q=em.createQuery(jpql);
		
		list=q.getResultList();
		
		return list;
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		EntityManager em=EmUtil.provideEntityManager();
		String jpql="select a.address from Employee a where a.empId=:empId";
		TypedQuery<String> q=em.createQuery(jpql,String.class);
		q.setParameter("empId", empId);
		
		String add=q.getSingleResult();
		return add;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String msg="";
		
		EntityManager em=EmUtil.provideEntityManager();
		String jpql="update Employee set salary=salary+:bns where empId=:eid";
		Query q=em.createQuery(jpql);
		q.setParameter("bns", bonus);
		q.setParameter("eid", empId);
		
		EntityTransaction tx=em.getTransaction();
		
		tx.begin();
		
		int x=q.executeUpdate();
		if(x==1) {
			msg="Updated";
		}
		else {
			msg="Not Updated";
		}
		tx.commit();
	
		em.close();
		return msg;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		
		boolean flag=false;
		EntityManager em=EmUtil.provideEntityManager();
		
		String jpql="delete from Employee where empId=:eid";
		Query q=em.createQuery(jpql);
		q.setParameter("eid", empId);
		
		em.getTransaction().begin();
		
		int x=q.executeUpdate();
		if(x==1) {
			flag=true;
		}
		
		em.getTransaction().commit();
		em.close();
		return flag;
	}

	@Override
	public String[] getNameAndAddress(int empId) {
		String[] res=new String[2];
		
		EntityManager em=EmUtil.provideEntityManager();
		String jpql="select e.name,e.address from Employee e where e.empId=:eid";
		TypedQuery<Object[]> q=em.createQuery(jpql,Object[].class);
		q.setParameter("eid", empId);
		
		Object[] arr=q.getSingleResult();
		
		res[0]=(String)arr[0];
		res[1]=(String)arr[1];
		
		return res;
	}
	
}
