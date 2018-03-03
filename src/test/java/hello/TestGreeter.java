package hello;



import static org.junit.Assert.*;



import org.junit.Before;

import org.junit.Test;





public class TestGreeter {



   private Greeter g;

	

   @Before

   public void setUp() throws Exception 

   {

      g = new Greeter();

   }



   @Test

   public void testGreeterEmpty() 

   {

      assertEquals(g.getName(),"");

      assertEquals(g.sayHello(),"Hello!");

   }

	

   @Test

   public void testGreeter() 

   {

      g.setName("World");

      assertEquals(g.getName(),"World");

      assertEquals(g.sayHello(),"Hello World!");

   }
	
   @Test
	
   public void newtestJHGreeterPass()
   {
      g.setName("John");
	
      assertEquals(g.getName(),"John");
	
      assertEquals(g.sayHello(),"Hello John!");
	   
   }
   
   /*@Test
	
   public void newtestJHGreeterFail()
   {
      g.setName("God");
	
      assertEquals(g.getName(),"Not God");
	
      assertEquals(g.sayHello(),"Hello God!");
	   
   }*/
}
