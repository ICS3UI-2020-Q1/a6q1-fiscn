import java.util.Scanner; 

/**
 *  the program will ask the user how many heights they would like to enter, in cm. IT will then read in that many heights. Once the heights are entered, the average height of the list will be determined and then all heights above average will be output to the user
 * @author Neil Fischer 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create scanner for user input 
    Scanner input = new Scanner(System.in); 

    //prompt the user to enter in how many hieght measurements 
    System.out.println("How many heights would you like to enter?"); 

    //create variable for how many hieghts 
    int hieghtNum = input.nextInt(); 

    //create array for hieghts 
    int[] hieghts = new int[hieghtNum]; 

    //ask the user to enter in the hieghts 
    System.out.println("Please enter the heights on separate lines"); 

    //use for loop to get all the hieghts of each person 
    for(int i = 0; i < hieghts.length; i++){
      //fill the arrays with a value 
      hieghts[i] = input.nextInt(); 
    }  

    // create variable to store total of all hieghts 
    int total = 0; 
    // use for loop to add hieghts to total 
    for(int i = 0; i < hieghts.length; i++){ 
      //add each hieght to total 
      total = total + hieghts[i];
    } 

    //calculate the average 
    int average = total/hieghts.length;  

    //output the average to the user 
    System.out.println("The average height is " + average); 

    //insert the above average line 
    System.out.println("The heights above average are"); 

    //crate for statement for the above average hieghts 
    for(int i = 0; i < hieghts.length; i++){
      if(hieghts[i] > average){
        System.out.println(hieghts[i]);
      }
    } 

    
  }
}
