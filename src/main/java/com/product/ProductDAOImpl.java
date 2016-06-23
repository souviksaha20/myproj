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
public class ProductDAOImpl {

	@Autowired
	private SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	@Transactional
	public int save(Product pro)
	{
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.persist(pro);
		tx.commit();
		Serializable id=session.getIdentifier(pro);
		session.close();
		return (Integer)id;
	}
      public List getAllProduct(){
		Session session=sf.openSession();
		List blist=session.createQuery("from Product").list();
		session.close();
		return blist;
	}
	
	public Product getSingleId(int id){
		Session session=sf.openSession();
		Product product=(Product)session.load(Product.class, id);
		return product;
	}
	
	public int deleteProduct(int id){
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Product product=(Product)session.load(Product.class, id);
		session.delete(product);
		tx.commit();
		Serializable ids=session.getIdentifier(product);
		session.close();
		return (Integer)ids;
	}
	
	
	public int updateProduct(Product product){
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.saveOrUpdate(product);
		tx.commit();
		Serializable id=session.getIdentifier(product);
		session.close();
		return (Integer)id;
		
	}
}
	

