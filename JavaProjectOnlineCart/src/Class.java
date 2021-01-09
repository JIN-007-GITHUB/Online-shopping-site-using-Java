
import java.util.*;
public class Class {

   public static void main(String args[]) {
      try { 
         System.out.println(new Date( ) + "\n"); 
         Thread.sleep(5*60*10); 
         System.out.println(new Date( ) + "\n"); 
         Category.getHomepage();
      } catch (Exception e) {
         System.out.println("Got an exception!"); 
      }
   }
}