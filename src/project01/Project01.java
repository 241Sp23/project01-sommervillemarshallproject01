package project01;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class Project01 {

    public static void main(String[] args) {
        //Setup to allow the user to choose the file
        JFileChooser myChooser = new JFileChooser();
        myChooser.showOpenDialog(null);
        File fileInput = myChooser.getSelectedFile();
        
        //Priming read
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to do.\nMenu (Choose one of the following or Q to quit):");
        System.out.println("F -Filter on Type");
        System.out.println("D -Filter on Date");
        System.out.println("S -Filter on Show");
        System.out.print("H -Highest Days in Top Ten\nChoice: ");
        String choice = input.nextLine();
        
        while (choice != "q"){
          //Switch to call methods from the user input
            switch(choice){
                case "f":
                    System.out.print("Would you like to filter on TV Show, Movie, or Stand-Up Comedy: ");
                    String filter = input.nextLine();
                    //call method here
                    break;
                
                case "d":
                    System.out.print("What week would you like to search for (mm/dd/yyyy): ");
                    String date = input.nextLine();
                    //call method here
                    break;
                
                case "s":
                    System.out.print("What TV Show or Movie would you like to search for: ");
                    String show = input.nextLine();
                    //call method here
                    break;
                
                case "h":
                    System.out.print("The show/movie with the highest number of consecutive days in the top ten is: ");
                    //call method 
                    break;
            }
            
            //Gather more user input
            System.out.println();
            System.out.println("What would you like to do.\nMenu (Choose one of the following or Q to quit):");
            System.out.println("F -Filter on Type");
            System.out.println("D -Filter on Date");
            System.out.println("S -Filter on Show");
            System.out.print("H -Highest Days in Top Ten\nChoice: ");
            choice = input.nextLine();
        }
    }
    
}
