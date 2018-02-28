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
   public void newtestKFGreeterPass()
   {
      String initials = "KF";

      assertEquals("KF", initials);
   }
	   @Test
   public void newtestKFGreeterFail()
   {
      String initials = "KF";

      assertNull("This will fail because initials is not null", initials);
   }

}
