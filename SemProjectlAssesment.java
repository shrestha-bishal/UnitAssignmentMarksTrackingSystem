
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bishal Shrestha
 */
public class SemProjectlAssesment {
    public static void SemProjectlAssesment(){
                       File path = new File("src/files/assessments/assessment.txt");
        float ProjectAssessment = 0;
        try{
       FileWriter fileWriter = new FileWriter(path, true);
       BufferedWriter buffer = new BufferedWriter(fileWriter);
       PrintWriter printWriter = new PrintWriter(buffer);
       printWriter.println();
       printWriter.print("               ");
           ProjectAssessment = Float.parseFloat(JOptionPane.showInputDialog("Enter Final Project Assessment Mark for respective Student")); 
         if(ProjectAssessment>0 && ProjectAssessment<=15){
         System.out.println(ProjectAssessment);
         printWriter.print("    "+ProjectAssessment);
         printWriter.close();
                AllStudents al = new AllStudents();
       al.getOverallAvg(ProjectAssessment);
           }else{
               JOptionPane.showMessageDialog(null, "Valid WQ Input Marks [0-15%] Please enter Again");
           }
           }catch(Exception e){     
      } 
    }
    
}
