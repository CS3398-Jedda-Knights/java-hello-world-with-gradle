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
   public void GreeterPass()
   {
      assertNotEquals("The
   public void newtesterbGse strings are definitely not equal", "Unexpected value", "Actual value");
   }

   @Test
   public void newtesterbGreeterFail()
   {
      assertEquals("These strings are definitely not equal", "Unexpected value", "Actual value");
   }

}