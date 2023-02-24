package project01;

import java.util.*;
import java.io.*;
import javax.swing.*;

public class Project01 {

    public static void main(String[] args) throws FileNotFoundException {
        //Setup to allow the user to choose the file
        JFileChooser myChooser = new JFileChooser();
        myChooser.showOpenDialog(null);
        File file = myChooser.getSelectedFile();
        Scanner inputFind = new Scanner(file);

        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to do.\nMenu (Choose one of the following or Q to quit):");
        System.out.println("F -Filter on Type");
        System.out.println("D -Filter on Date");
        System.out.println("S -Filter on Show");
        System.out.print("H -Highest Days in Top Ten\nChoice: ");
        String choice = input.nextLine();
        System.out.print("\nWhat week would you like to search for (mm/dd/yyyy): ");
        String week = input.nextLine();

    }

    public static String[][] find(Scanner fileInput) {

        while (fileInput.hasNext()) {
            String Date = fileInput.nextLine();
        }
    }

}
