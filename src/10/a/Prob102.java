public class Prob102 { 
   public static void main(String[] args) { 
      (new Object() {
         void on() {System.out.println("Turn it on!");}
      }).on();
   } 
} 
