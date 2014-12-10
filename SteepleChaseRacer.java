/**
 * A SteepleChaseRacer is a Racer that can jump over hurdles of any height.
 * 
 * @author <...>
 * @version <...>
 *
 */
public class SteepleChaseRacer extends Racer {
	public SteepleChaseRacer(int Y) {
   super(Y);
      }

@Override
	public void jumpRight() {
            
     int l = 0;
     
    while(!frontIsClear()){
      turnLeft();
      }
      
     while(!rightIsClear()){
      move();
      l++;
      }
      
      turnRight();
      move();
      turnRight();
      
         for(int k =0;k < l; k++){
         move();
         }
         turnLeft();
         }
       
      }

