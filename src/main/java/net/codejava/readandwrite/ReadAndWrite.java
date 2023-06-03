/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package net.codejava.readandwrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author valpib
 */
public class ReadAndWrite {

    public static void main(String[] args) {
        String filename = "sample.txt";
        
        try{
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello! My name is Biplav Karki.");
            bw.close();
            System.out.println("File created successfully");
            
           Read read = new Read();
           read.read();
        }
        catch(IOException e)
        {
            System.out.print("Sorry! File cannot be created.");
            e.printStackTrace();
            
        }
        
    }
}
