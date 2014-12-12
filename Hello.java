import kareltherobot.*;
public class Hello implements Directions
{
   public static void main (String [] args)
      {
         MyRobot n = new MyRobot(5,5, West,4);
         World.readWorld("untitled.kwld");
         World.setVisible(true);
         World.setDelay(60);
        while(true){
      
         n.uTurn();
         n.uTurn();
         n.uTurn();
         n.uTurn();
        }

         }
}