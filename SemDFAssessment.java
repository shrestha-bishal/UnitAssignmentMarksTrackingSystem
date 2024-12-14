
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
public class SemDFAssessment {  //parent array
    public void WeeklyDFAssessment(String student_name, String crn, String uid){  //sub array to validate and store marks in array in a loop
  //  System.out.println("Hello");    
  File path = new File("src/files/assessments/assessment.txt");
        float[] WeeklyDFAssmtMarks = new float[11];  //initalizing array to store 10 valiues i.e. for 10 weeks
        float DFTotal = 0;
        float DFAverage = 0;
        try{
       FileWriter fileWriter = new FileWriter(path, true);
       BufferedWriter buffer = new BufferedWriter(fileWriter);
       PrintWriter printWriter = new PrintWriter(buffer);
       printWriter.println();
       printWriter.print(student_name+"    "+crn);
        for(int i=1; i<=10; i++){   //for loop [1-10 weeks]
           WeeklyDFAssmtMarks[i] = Float.parseFloat(JOptionPane.showInputDialog("Enter Weekly Discussion Forum Marks for 10 Weeks respectively"+" Week: "+i)); 
           //string value into array using JOption 
         if(WeeklyDFAssmtMarks[i]>0 && WeeklyDFAssmtMarks[i]<=15){
         System.out.println(WeeklyDFAssmtMarks[i]);
         printWriter.print("    "+WeeklyDFAssmtMarks[i]);
       //printWriter.println();
       DFTotal = DFTotal + WeeklyDFAssmtMarks[i];
       
      // printWriter.print("    "+WeeklyDFAssmtMarks[i]);
           }else{
               JOptionPane.showMessageDialog(null, "Valid WDF Input Marks [0-15%] Please enter Again");
               i--;
           }
        }
        DFAverage = DFTotal/10;
        printWriter.print("         "+DFTotal);
        printWriter.print("         "+DFAverage);
       AllStudents al = new AllStudents();
       al.getOverallAvgs(DFAverage);
        //getAverage(DFTotal);
         printWriter.close();
           }catch(Exception e){     
      }
        
    }
   // public static void getAverage(int DFTotal){
        
   // }
}
