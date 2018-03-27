/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.mvc;

/**
 *
 * @author micha
 */
public class PokemonMVCMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // begin main
            // ***** declaration of constants *****
            
            // ***** declaration of variables *****
            
            // ***** create objects *****
            
            
            // ***** create input stream *****
            
            //ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        Your Name Here");
		System.out.println("Class:       CS30S");
		System.out.println("Assignment:  Ax Qy");
		System.out.println("**********************************");
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
	
	// ***** processing *****
	
               PokemonGUI pokemonUI = new PokemonGUI();
               pokemonUI.setVisible(true);
        
               //Controller controller = new Controller();
        
               //patientUI.addController(controller);
               //controller.addUI(patientUI);
		
	// ***** output *****
	
		// all formatted ouput is printed in this section

                //patientData.write("Hello World!");
                //patientData.close();
                
	// ***** closing message *****
	
		System.out.println("end of processing");
                
        }
    
}
