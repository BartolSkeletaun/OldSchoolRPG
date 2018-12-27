import java.util.*;
import java.util.concurrent.TimeUnit ;

class Game{
  
  public static void main(String [] args)throws InterruptedException{
    
    System.out.println("Hello there you find yourself in a dark space, the walls are close to you ");
    TimeUnit.SECONDS.sleep(4);
    System.out.println("The ceiling is mere inches above your head , something feels wrong about this place");
    TimeUnit.SECONDS.sleep(4);
    System.out.println("You peer through the darkness it's hard to see but you think you may be in ........ ");
    
    TimeUnit.SECONDS.sleep(5);
    
    System.out.println();
    System.out.println("Enter 0 for a Coffin!!");
   
    TimeUnit.SECONDS.sleep(3);
    
    System.out.println();
    System.out.println("Enter 1 for a Cardboard Box!!");
    
    TimeUnit.SECONDS.sleep(3);
    
    System.out.println();
    System.out.println("Enter 2 for  the Basement!!");
    TimeUnit.SECONDS.sleep(3);
    
    
    System.out.println();
    System.out.println("Enter 3 for a Mineshaft!!");
    System.out.println();
    TimeUnit.SECONDS.sleep(2);
    
    int firstChoice = 0;
    
    Scanner myScan = new Scanner(System.in);
    
    firstChoice = myScan.nextInt();
    
    switch(firstChoice){
      case 0: System.out.println(" Your reach for your back pocket ..... ");
      TimeUnit.SECONDS.sleep(2);
      break;
      
      case 1: System.out.println(" Your reach for your shirt pocket.....  ");
      TimeUnit.SECONDS.sleep(2);
      break;
      
      case 2: System.out.println(" Your reach in your right pocket.....  ");
      TimeUnit.SECONDS.sleep(2);
      break;
      
      case 3: System.out.println(" Your reach for your inside jacket pocket....  ");
      TimeUnit.SECONDS.sleep(2);
      break;
      
    }
    
    int SecondChoice = firstChoice;
    
    TimeUnit.SECONDS.sleep(3);
    if(firstChoice == 0){
    System.out.println("Fumbling around in your pocket you feel the cool smooth surface of your trusty Zippo , you spark it up and peer through the darkness for the first time ..... ");
    SecondChoice = 0;
    }
    else if(firstChoice == 1){
      System.out.println("Fumbling around in your pocket you grab a match , you spark it up and peer through the darkness for the first time ..... ");
      SecondChoice =1;
    }
    
    else if(firstChoice == 2){
      System.out.println("Fumbling around in your pocket you grab peice of flint and a rag , you spark it up and peer through the darkness for the first time ..... ");
      SecondChoice = 2;
    }
    else{
      System.out.println("Fumbling around in your pocket you find a cigarette lighter, you spark it up and peer through the darkness for the first time ..... ");
      SecondChoice = 3;
    }
    TimeUnit.SECONDS.sleep(3);
    
    switch(SecondChoice){
      case 0:
        TimeUnit.SECONDS.sleep(3);
      System.out.println("You worst fears appear to have been confirmed, all around you appears to wooden, fresh dirt shifts through the cracks in the wood.....");
      SecondChoice = 3;
      break;
      
      case 1:
        TimeUnit.SECONDS.sleep(3);
        System.out.println("A huge black cat hisses at you through the darkeness as it's eyes glow like lanterns");
        break;
    }
    
  }
 
}