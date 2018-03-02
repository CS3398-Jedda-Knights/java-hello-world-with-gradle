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

   public void newTestMADGreeterPass()
   {
       g.setName("Chicken");
       assertEquals(g.getName(), "Chicken");
       assertEquals(g.sayHello(), "Hello Chicken!");
   }

   @Test

   public void newTestMADGreeterFail()
   {
       g.setName("Different Chicken");
       assertEquals(g.getName(), "Same Chicken");
       assertEquals(g.sayHello(), "Hello Same Chicken!");
   }

}