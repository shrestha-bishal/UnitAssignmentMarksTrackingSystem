
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Formatter;
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

public class SemDFAssesment {   //parent array
    public void setAllWksDFAssmtMarks(String uid){  //sub array to validate and store marks in array in a loop
        //System.out.println("Hello");
        File path = new File("src/files/assessments/WDF/"+uid+".txt");
       
        int[] WeeklyDFAssmtMarks = new int[11];  //initalizing array to store 10 valiues i.e. for 10 weeks
        for(int i=1; i<=10; i++){   //for loop [1-10 weeks]
           WeeklyDFAssmtMarks[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter Weekly Discussion Forum Marks for 10 Weeks respectively"+" Week: "+i)); 
           //string value into array using JOption 
           if(WeeklyDFAssmtMarks[i]>0 && WeeklyDFAssmtMarks[i]<=15){
               System.out.println(WeeklyDFAssmtMarks[i]);
         try{
       FileWriter fileWriter = new FileWriter(path, true);
       BufferedWriter buffer = new BufferedWriter(fileWriter);
       PrintWriter printWriter = new PrintWriter(buffer);
       printWriter.print(WeeklyDFAssmtMarks[i]);
       printWriter.println();
       printWriter.close(); 
       
      }catch(Exception e){
            
      }
         while(i==10){
             JOptionPane.showMessageDialog(null, "");
         }
           }else{
               JOptionPane.showMessageDialog(null, "Valid WDF Input Marks [0-15%] Please enter Again");
               i--;
           }
           
           
        }   
    }

   /*   public void validateMarks(String weekno, int marks){
        if(marks>0 && marks <= 15){
           StudentsaveSemDFAssesment(weekno, marks); 
           JOptionPane.showMessageDialog(null, "Marks Added Successfully");
           System.out.println(weekno+marks);
        }else{
            JOptionPane.showMessageDialog(null, "Valid WDF Input Marks [0-15%]");
        }
            
  }
  public void StudentsaveSemDFAssesment(String weekno, int marks){
      System.out.println(weekno+"      "+marks);
    */
    /*  int[] Dfmarks = new int[10];
      for(int i = 0; i<10; i++){
          Dfmarks[i]= marks;
          int Total = + Dfmarks[i];
          System.out.println(Total);
      }  */
     // System.out.println(Total);
    // System.out.println(marks);
//}  
}


