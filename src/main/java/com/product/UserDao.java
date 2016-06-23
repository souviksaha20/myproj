package com.product;
import java.io.Serializable;
import java.util.List;
import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class UserDao
{

	@Autowired
	private SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	@Transactional
	public int save(User pro)
	{
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.persist(pro);
		tx.commit();
		Serializable id=session.getIdentifier(pro);
		session.close();
		return (Integer)id;
	}
      public List getAllUser(){
		Session session=sf.openSession();
		List blist=session.createQuery("from User").list();
		session.close();
		return blist;
	}
	
	public User getSingleId(int id){
		Session session=sf.openSession();
		User user=(User)session.load(User.class, id);
		return user;
	}
	
	public int deleteProduct(int id){
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		User product=(User)session.load(User.class, id);
		session.delete(product);
		tx.commit();
		Serializable ids=session.getIdentifier(product);
		session.close();
		return (Integer)ids;
	}
	
	
	public int updateUser(User product){
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.saveOrUpdate(product);
		tx.commit();
		Serializable id=session.getIdentifier(product);
		session.close();
		return (Integer)id;
		
	}
}
	



