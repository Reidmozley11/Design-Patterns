package strategy;

import java.io.*; 
import java.util.*; 

public class LinearSearch implements SearchBehavior{
  /**
   * A linear search pattern for the guest list 
   * @param data contains information for the guest list
   * @param item contains information for the person being requested on the guest list 
   */
    public boolean contains(ArrayList<String> data, String item){
      /**
       * A simple for loop linear search that hunts down the infomation one at a time using the index starting at i = 0. 
       */
      for(int i = 0; i<data.size(); i++){
          if(item.toLowerCase() == data.get(i).toLowerCase()){
            return true;
          }
    }
    return false; 
}
}
