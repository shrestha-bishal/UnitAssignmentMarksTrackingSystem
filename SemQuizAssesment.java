
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
public class SemQuizAssesment {
    public static void SemQuizAssesment(){
          File path = new File("src/files/assessments/assessment.txt");
        float[] WeeklyQuizAssessment = new float[11]; 
        float WQTotal = 0;
        float WQAverage = 0;
        try{
       FileWriter fileWriter = new FileWriter(path, true);
       BufferedWriter buffer = new BufferedWriter(fileWriter);
       PrintWriter printWriter = new PrintWriter(buffer);
       printWriter.println();
       printWriter.print("               ");
        for(int i=1; i<=10; i++){  
           WeeklyQuizAssessment[i] = Float.parseFloat(JOptionPane.showInputDialog("Enter Weekly Quizzes Marks for 10 Weeks respectively"+" Week: "+i)); 
         if(WeeklyQuizAssessment[i]>0 && WeeklyQuizAssessment[i]<=10){
         System.out.println(WeeklyQuizAssessment[i]);
         printWriter.print("    "+WeeklyQuizAssessment[i]);
       WQTotal = WQTotal + WeeklyQuizAssessment[i];
           }else{
               JOptionPane.showMessageDialog(null, "Valid WQ Input Marks [0-15%] Please enter Again");
               i--;
           }
        }
        WQAverage = WQTotal/10;
        printWriter.print("         "+WQTotal);
        printWriter.print("         "+WQAverage);
         printWriter.close();
       AllStudents al = new AllStudents();
       al.getOverallAvg(WQAverage);
           }catch(Exception e){     
      }
    }
    
}
