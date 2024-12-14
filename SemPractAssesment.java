
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
public class SemPractAssesment {
    public static void SemPractAssesment(){
        File path = new File("src/files/assessments/assessment.txt");
        float[] WeeklyPracticalAssessment = new float[11]; 
        float WPTTotal = 0;
        float WPTAverage = 0;
        try{
       FileWriter fileWriter = new FileWriter(path, true);
       BufferedWriter buffer = new BufferedWriter(fileWriter);
       PrintWriter printWriter = new PrintWriter(buffer);
       printWriter.println();
       printWriter.print("               ");
        for(int i=1; i<=10; i++){  
           WeeklyPracticalAssessment[i] = Float.parseFloat(JOptionPane.showInputDialog("Enter Weekly Practical Assesment Marks for 10 Weeks respectively"+" Week: "+i)); 
         if(WeeklyPracticalAssessment[i]>0 && WeeklyPracticalAssessment[i]<=10){
         System.out.println(WeeklyPracticalAssessment[i]);
         printWriter.print("    "+WeeklyPracticalAssessment[i]);
       WPTTotal = WPTTotal + WeeklyPracticalAssessment[i];
           }else{
               JOptionPane.showMessageDialog(null, "Valid WQ Input Marks [0-15%] Please enter Again");
               i--;
           }
        }
        WPTAverage = WPTTotal/10;
        printWriter.print("         "+WPTTotal);
        printWriter.print("         "+WPTAverage);
         printWriter.close();
                AllStudents al = new AllStudents();
       al.getOverallAvg(WPTAverage);
           }catch(Exception e){     
      }    
    }
}
