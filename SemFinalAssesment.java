
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
public class SemFinalAssesment {
    public static void SemFinalAssesment(){
               File path = new File("src/files/assessments/assessment.txt");
        float FinalAssessment = 0;
        try{
       FileWriter fileWriter = new FileWriter(path, true);
       BufferedWriter buffer = new BufferedWriter(fileWriter);
       PrintWriter printWriter = new PrintWriter(buffer);
       printWriter.println();
       printWriter.print("               ");
           FinalAssessment = Float.parseFloat(JOptionPane.showInputDialog("Enter Final Assesment Mark for respective Student")); 
         if(FinalAssessment>0 && FinalAssessment<=50){
         System.out.println(FinalAssessment);
         printWriter.print("    "+FinalAssessment);
         printWriter.close();
       AllStudents al = new AllStudents();
       al.getOverallAvg(FinalAssessment);
       al.getOverallAverage();
           }else{
               JOptionPane.showMessageDialog(null, "Valid WQ Input Marks [0-50%] Please enter Again");
           }
           }catch(Exception e){     
      } 
    }
}
