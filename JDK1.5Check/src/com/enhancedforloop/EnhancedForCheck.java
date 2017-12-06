package com.enhancedforloop;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class EnhancedForCheck {

	
	public static void main(String[] args) {
		
        int a[]={10,20,30,40,50};
        /*  in JDK1.4 array iteration  */
        for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
        System.out.println("******************");
        /*  in JDK1.5 array iteration     */
        for (int x : a) {
			System.out.println(x);
		}
        
        ArrayList al= new ArrayList();
        al.add("vidhan");
        al.add(new Integer(8));
        al.add("chandra");
        
        /*  in JDK1.4 ArrayList iteration  */
         Iterator it=al.iterator();
         while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
         
         /*  in JDK1.5 ArrayList iteration  */
         for (Object o : al) {
			System.out.println(o);
		}
         /*Collection c= (Collection)al;
         for(Collection cn : c)
         {
        	 System.out.println(c);
         }*/
         Vector v= new Vector();
         System.out.println(v.capacity());
         v.add( new String("sona"));
         v.add(new Integer(800));
         v.add("chandra");
         v.add( new String("sona"));
         v.add(new Integer(800));
         v.add("chandra");
         v.add( new String("sona"));
         v.add(new Integer(800));
         v.add("chandra");
         v.add( new String("sona"));
         v.add(new Integer(800));
         v.add("chandra");
         
         for(Object o : v)
         {
        	System.out.println(o); 
         }
         System.out.println(v.capacity());
         
         try {
        	 String s1= new String("vid");
             /*String s2= "rahulkumarviswas";
             String s3=null;
             System.out.println(s1.compareTo(s3));*/
		} catch (Exception e) {
			e.printStackTrace();
		}
        
		ArrayList<Integer> myal= new ArrayList<Integer>();
		myal.add(10);
		myal.add(20);
		myal.add(30);
		
        for(Integer i :myal)
        {
        	System.out.println(i);
        }
	}

}
