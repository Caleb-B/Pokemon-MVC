package pokemon.mvc;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/* **********************************************************
 * Programmer:	Rob Sveinson
 * Class:		CS20S
 * 
 * Assignment:	aX  qY
 *
 * Description:	describe the class you are creating
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Controller
 {  // begin class
 	
     public enum File{
         AllHoenn, HoennRoute101, HoennRoute102,
         HoennRoute103, Abilities
     }
     
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
 	
 	// ********** constructors ***********
 	
     public Controller(){
         
     } // end constructor
     
 	// ********** accessors **********
 	
     protected String[] readFileList(File f, int l) throws IOException{
         BufferedReader fRead = new BufferedReader(new FileReader("C:\\Users\\micha\\Documents\\NetBeansProjects\\Pokemon-MVC\\" + f + ".txt"));
         
         String strin;
         String[] fList = new String[l];
         int c = 0;
         
         strin = fRead.readLine();
         
         //System.out.println(strin);
         
         while(strin != null){
             fList[c] = strin;
             strin = fRead.readLine();
             c += 1;
         } // end eof
         
         return fList;
     } // end readFileList
     
 	// ********** mutators **********
 
 }  // end class