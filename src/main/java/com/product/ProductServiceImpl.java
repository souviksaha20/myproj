package com.product;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
@Transactional
public class ProductServiceImpl 
{
	@Autowired
	private ProductDAOImpl ProductDAOImpl;
	public int save(Product product){
		return	ProductDAOImpl.save(product);
		}	
	
	
	public List getAllProduct(){
		return ProductDAOImpl.getAllProduct();
	}
	/*public List getAllBooks(){
		return bookDao.getAllBooks();
	}*/
	public Product getSingleId(int id){
		return ProductDAOImpl.getSingleId(id);
	}
	public int updateProduct(Product product){
		return ProductDAOImpl.updateProduct(product);
	}
	public int deleteProduct(int id){
		return ProductDAOImpl.deleteProduct(id);
	}
}

