/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.readandwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author valpib
 */
class Read {
   
     public static void read(){   
        try { 
            String filename = "sample.txt";
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine())!= null )
            {
                System.out.print(line);
            }
            br.close();
        
    }
    catch(IOException e)
    {
        System.out.print("File cannot be found.");
        e.printStackTrace();
    }
    }
 
}
