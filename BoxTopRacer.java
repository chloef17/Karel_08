/**
 * A BoxTopRacer is a Racer that can jump over hurdles of any width.
 * 
 * @author ChloeFink
 * @version 1
 *
 */
 
public class BoxTopRacer extends Racer {
      public BoxTopRacer(int Y) {
         super(Y);
      }

@Override
	public void jumpRight() {
      
      int j = 0;
      
      while(!frontIsClear()){
      turnLeft();
      }
      
	   while(!rightIsClear()){
      move();
      j++;
      }
      
   turnRight();
   move();

   
   while(!rightIsClear()){
      move();
      }
 
   turnRight();
   
   for(int k=0; k < j; k++){
   move();
     }
   turnLeft();
   
   }

}
