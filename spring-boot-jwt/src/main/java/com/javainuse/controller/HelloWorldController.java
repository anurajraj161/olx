package com.javainuse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.javainuse.dao.UserDao;
import com.javainuse.model.DAOUser;
import com.javainuse.service.JwtUserDetailsService;



@RestController
public class HelloWorldController {
		@Autowired
		private JwtUserDetailsService service;
		
		@Autowired
		private UserDao repo;
		
		@Autowired
		private RestTemplate temp; // extra e
		
		@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}
//		@GetMapping("/{User_id}")
//		public  DAOUser getUser (@PathVariable("User_id")Long userId)
//		{	
//			DAOUser user = this.repo.getUser(userId);     //e
//			
//			List order =this.temp.getForObject("http://localhost:9005/postorder"+ user.getId(),List.class);// instead of both server on and testing   //e
//			
//			
//			//List contact =this.temp.getForObject("http://user_service/contact/user/"+ userId,List.class);//already registerd so we can run like this
//			//user.setOrders(order);//e
//			return user;//setting contact that is there in list   //e
//			
//			
//			//return this.userServiceImpl.getUser(userId);
//		}
		
//		 @GetMapping("/{bookId}")
//		    public Book getBook(@PathVariable("bookId") Long bookId) {
//		        Book book = this.bookService.getBook(bookId);
//		        List authors = this.restTemplate.getForObject("http://author-service/author/favorite/book/" + book.getBookId(), List.class);
//		        book.setAuthors(authors);
//		        return book;
//
//		    }
		 
		 
//		 @GetMapping("/{Uid}")
//			
//			public  DAOUser getUser (@PathVariable("Uid")Long userId)
//			{	
//				DAOUser user = this.repo.getUser(userId);     
//				
//				List order =this.temp.getForObject("http://localhost:9005/postorder"+ user.getUserId(),List.class);
//		 
//		 
		 
		
		@GetMapping("/{Uid}")
		public  void  getUser (@PathVariable("Uid")Long userId) {
			
			@SuppressWarnings("unchecked")
			List<Long> daoUser=temp.getForObject("http://localhost:9001/postorder/{Uid}", List.class);
			
			List<Long> Order = temp.getForObject("http://localhost:9005//{Uid}", List.class);
		}
		}
