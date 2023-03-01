package project01;

import java.util.*;
import java.io.*;
import javax.swing.*;

public class Project01 {
    
    public static void main(String[] args) throws FileNotFoundException {
        //Setup to allow the user to choose the file
        JFileChooser myChooser = new JFileChooser();
        myChooser.showOpenDialog(null);
        File fileInput = myChooser.getSelectedFile();
        Scanner inputFind = new Scanner(fileInput);
        
        //Creates a 2D array
        String dataSet[][] = find(inputFind);

        //Priming read
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to do.\nMenu (Choose one of the following or Q to quit):");
        System.out.println("F -Filter on Type");
        System.out.println("D -Filter on Date");
        System.out.println("S -Filter on Show");
        System.out.print("H -Highest Days in Top Ten\nChoice: ");
        String choice = input.nextLine();
        choice = choice.toLowerCase();

        while (!"q".equals(choice)) {
            //Switch to call methods from the user input
            switch (choice) {
                case "f":
                    System.out.print("Would you like to filter on TV Show, Movie, or Stand-Up Comedy: ");
                    String filter = input.nextLine();
                    filter = filter.toLowerCase();
                    //filterOnType(dataSet, filter);
                    break;

                case "d":
                    System.out.print("What week would you like to search for (mm/dd/yyyy): ");
                    String date = input.nextLine();
                    date = date.toLowerCase();
                    //filterOnDate(dataSet, date);
                    break;

                case "s":
                    System.out.print("What TV Show or Movie would you like to search for: ");
                    String show = input.nextLine();
                    show = show.toLowerCase();
                    //searchForShow(dataSet, show);
                    break;

                case "h":
                    System.out.print("The show/movie with the highest number of consecutive days in the top ten is: ");
                    //highestDaysInTopTen(dataSet);
                    break;
                default:
                    System.out.println("Invalid Output");
            }

            //Gather more user input
            System.out.println();
            System.out.println("What would you like to do.\nMenu (Choose one of the following or Q to quit):");
            System.out.println("F -Filter on Type");
            System.out.println("D -Filter on Date");
            System.out.println("S -Filter on Show");
            System.out.print("H -Highest Days in Top Ten\nChoice: ");
            choice = input.nextLine();
            choice = choice.toLowerCase();
        }
    }

    
    public static String[][] find (Scanner fileInput) {
        //creates a 2D array
        String[][] dataSet = new String[7101][6];

        //for loop to iterate through the 2D array
        for(int row = 0; row < dataSet.length; row++){
            String[] contents = fileInput.nextLine().strip().split(","); //splits the line at the commas
            System.arraycopy(contents, 0, dataSet[row], 0, 6); //puts the split line in the 2D array
        } 
       
        return dataSet;
    }
    
}