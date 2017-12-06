package com.vidhan.usermange.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.vidhan.usermange.pojo.MyUser;

public class UserDao {
	
	public List<MyUser> getAllUsers(){ 
	      
	      List<MyUser> userList = null; 
	      try { 
	         File file = new File("Users.dat"); 
	         if (!file.exists()) { 
	        	 MyUser user = new MyUser(1, "Vidhan Chandra", "TL"); 
	            userList = new ArrayList<MyUser>();
	            userList.add(user); 
	            saveUserList(userList);
	         } 
	         else{ 
	            FileInputStream fis = new FileInputStream(file); 
	            ObjectInputStream ois = new ObjectInputStream(fis); 
	            userList = (List<MyUser>) ois.readObject(); 
	            ois.close(); 
	         } 
	      } catch (IOException e) { 
	         e.printStackTrace(); 
	      } catch (ClassNotFoundException e) { 
	         e.printStackTrace(); 
	      }   
	      return userList; 
	   } 
	
	
	private void saveUserList(List<MyUser> userList){ 
	      try { 
	         File file = new File("Users.dat"); 
	         FileOutputStream fos;  
	         fos = new FileOutputStream(file); 
	         ObjectOutputStream oos = new ObjectOutputStream(fos); 
	         oos.writeObject(userList); 
	         oos.close(); 
	      } catch (FileNotFoundException e) { 
	         e.printStackTrace(); 
	      } catch (IOException e) { 
	         e.printStackTrace(); 
	      } 
	   }    

}
