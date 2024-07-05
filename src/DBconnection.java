/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Study (ICBT)
 */
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.io.*;

public class DBconnection {
    
    String MyFile = "E:\\AppleiStore\\Product.txt";
    void makeconnection(String Record){
        
        try
        {
            FileWriter FileWriter = new FileWriter(MyFile,true);
            BufferedWriter BufferedWriter = new BufferedWriter(FileWriter);
            
             BufferedWriter.write(Record);
             BufferedWriter.newLine();
             BufferedWriter.close();
             FileWriter.close();
             
             JOptionPane.showConfirmDialog(null, "Successfully writer in the file");
             
        }
        
             
         catch (Exception e)
         {
             System.out.println("An error occoured saving values" +e);
         }
        }
}
      
    
    
           
                
        
    