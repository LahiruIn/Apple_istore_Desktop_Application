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


public class DBconnection2 {
    
    void writeconnection (String Acc)
    {
        String FILEPATH2 = "E:\\AppleiStore\\Addacc.txt";
        
        {
        FileWriter filewriter = null;
        BufferedWriter  bufferedwriter = null;
        try 
        {

            filewriter = new FileWriter(FILEPATH2, true );
            bufferedwriter = new BufferedWriter(filewriter);
            
            bufferedwriter.write(Acc);
            bufferedwriter.newLine();
            bufferedwriter.close();
            filewriter.close();
            
            JOptionPane.showMessageDialog(null, "Successfully writer in the file");
            
        } 
        catch (Exception e) 
        {
            System.out.println("An error occoured saving values"+e);
        }
    }
    }   
  }
    

