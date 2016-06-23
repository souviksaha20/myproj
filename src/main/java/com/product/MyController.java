package com.product;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Principal;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;


@Controller
public class MyController 
{
	@Autowired
	private ProductServiceImpl bs;
	@RequestMapping("/")
	public ModelAndView index2() {
		return new ModelAndView("index").addObject("viewName","index");
		
	}

	@RequestMapping("/index")
	public ModelAndView index() {
		return new ModelAndView("index");
		
	}
	@RequestMapping(value = "/viewproduct")
	public ModelAndView viewproduct(@RequestParam int id) 
	{
		
		return new ModelAndView("viewproduct");
		
	}
	@RequestMapping(value = "/aboutus")
	public ModelAndView aboutus() {
		return new ModelAndView("aboutus").addObject("viewName","aboutus");
		
	}
	@RequestMapping(value = "/contactus")
	public ModelAndView contactus() {
		return new ModelAndView("contactus").addObject("viewName","contactus");
		
	}
	@RequestMapping(value = "/viewAll")
	public ModelAndView viewall() {
		return new ModelAndView("viewall");
		
	}
	
    
	@RequestMapping(value = "/showForm")
	public ModelAndView showForm() {
		return new ModelAndView("addComputer");
		
	}
	@RequestMapping(value = "/edit2",method=RequestMethod.GET)
	public ModelAndView edit2(@RequestParam int id, @ModelAttribute Product product) {
		Product product2=bs.getSingleId(id); 
		return new ModelAndView("Edit","product",product2);
		
	}

 /*
  * add of product along with image uplode
  * */
	@RequestMapping(value="/addCoputer")
    public String save (HttpServletRequest request, @Valid @ModelAttribute("comp")Product product,BindingResult result,@RequestParam String name)
	{
		if(result.hasErrors())
		{
			return  "addComputer";
		}
		String file=product.getImages().getOriginalFilename();
		
		try{
		byte[] buffer=new byte[product.getImages().getInputStream().available()];
		int len=buffer.length;
		int read=0;
		product.getImages().getInputStream().read(buffer);
		product.setimage(file);
		System.out.println(file);
		MultipartFile file2=product.getImages();
		System.out.println(file2);
		 String uploadRootPath = request.getServletContext().getRealPath("/")+"resources/img";
		 System.out.println(uploadRootPath);
		 File root=new File(uploadRootPath);
		 if (!root.exists())
			 root.mkdirs();
		      
		    	  File serverFile = new File(root.getAbsolutePath() + File.separator + file);
		    	  OutputStream os=new FileOutputStream(serverFile);
		    	  os.write(buffer);
		        } 
		      catch(Exception e)
		      {
		    	  System.out.println("Error Write file: " + e.getMessage());
		      }
		bs.save(product);
    	return "redirect:index";

	}
 // gating the data from the list controller
	@RequestMapping(value="/list",method=RequestMethod.GET,produces="application/json")
    public @ResponseBody String showList(){
    	List computer=bs.getAllProduct();
    	Gson x=new Gson();
    	String json=x.toJson(computer);
    	return json;
	}
	
	//=================== Edite=================================
	@RequestMapping(value="/editCoputer",method=RequestMethod.GET)
    public ModelAndView editBook(@RequestParam int id, @ModelAttribute Product product){
		bs.getSingleId(id);
    	return new ModelAndView("update","Product",product);
    }
	
	//=================delete=================================
	@RequestMapping("/delete")
    public ModelAndView deleteProduct(@RequestParam int id){
    	bs.deleteProduct(id);
    	ModelAndView model=new ModelAndView("redirect:viewall");
    	return model;
    }
	//==============calling page .jsp=============================
	@RequestMapping(value = "/login2")
	public ModelAndView loginpage() {
		return new ModelAndView("login");
	}
	
	
	//==================log in==========================
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(ModelMap model, Principal principal ) 
	{
		 String name = principal.getName();
		 model.addAttribute("author", name);
		 model.addAttribute("message", "Welcome To Login Form Based Spring Security Example!!!");
		 return "index";

    }
	
	//==================log failed==========================
	@RequestMapping(value="/fail2login", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {

	 model.addAttribute("error", "true");
	 return "login";

	}
   //=======================log in========================
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	 public String logout(ModelMap model) {
	 
	  return "index";
	 
	 }	
	//=========================add product=========================
	@RequestMapping(value = "/addproduct")
	public ModelAndView addproduct() {
		return new ModelAndView("addproduct").addObject("viewName","addproduct");
		
	}
	//=================== object of comp==============================
	
	@ModelAttribute("comp")
	public Product newProduct(){
		return new Product();
	}
}









