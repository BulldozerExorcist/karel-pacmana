import kareltherobot.*;
public class MyRobot extends UrRobot implements Directions
{
   public MyRobot(int st,int ave, Direction dir,int bep)
   { 
      super(st ,ave ,dir ,bep);
   }
  
   public void moveS(int x) 
   {
         int C=1;
         while(C<=x)
            {
            move();
            C++;
            }
   }
  

   public void moveP(int x) 
   {
         int C=1;
         while(C<=x)
            {
            move();
            putBeeper();
            C++;
            }
   }

   public void flip()
   {
      turnLeft();
      turnLeft();
   }
   public void turnRight()
   {
      World.setDelay(0);
      turnLeft();
      turnLeft();
      turnLeft();
      World.setDelay(10);
   }
   public void uTurn()
   {
      moveS(3);
      turnRight();
      move();
      turnRight();
      moveS(3);
      turnLeft();
      }
}