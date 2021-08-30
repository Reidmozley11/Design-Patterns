package strategy;
//Reference 
//https://www.geeksforgeeks.org/java-program-to-perform-binary-search-on-arraylist/
//https://www.geeksforgeeks.org/binary-search-a-string/

import java.io.*; 
import java.util.*; 

public class BinarySearch implements SearchBehavior{

        /**
         * BinarySearch pattern for the guest list
         * @param data contains the information for the guest list
         * @param item contains the information for the person requested from the guest list
         */
        public boolean contains(ArrayList<String> data, String item) {
            int left = 0;
            int right = data.size() - 1;
            /**
             * This while loop runs through the guest list until the left side is less than or equal  to the right side.
             * This ensures all possibilites have been run through. 
             * If it finds the correct value before that it just returns true. 
             */
            while (left <= right){
                   int middleGuest = left + (right-left)/2;
    
                   int find = item.compareToIgnoreCase(data.get(middleGuest)); 
    
                   if(find == 0){
                       return true; 
                    }
    
                    if (find > 0){
                       left = middleGuest + 1; 
                    }
                    else {
                        right = middleGuest - 1; 
                    }
    
             }
             return false;
        }
}


