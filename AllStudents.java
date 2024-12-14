
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
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
public class AllStudents { 
    public static void getOverallAvg(Float Average){
        File path = new File("src/files/assessments/temp.txt");
      try{
      FileWriter fileWriter = new FileWriter(path, true);
      BufferedWriter buffer = new BufferedWriter(fileWriter);
      PrintWriter printWriter = new PrintWriter(buffer);
      printWriter.print(Average);
      printWriter.println();
      printWriter.close();  
      }catch(Exception e){
          
      }
     
    }
    public static void getOverallAvgs(Float Average){
        File path = new File("src/files/assessments/temp.txt");
      try{
      FileWriter fileWriter = new FileWriter(path, true);
      BufferedWriter buffer = new BufferedWriter(fileWriter);
      PrintWriter printWriter = new PrintWriter(buffer);
      printWriter.println();
      printWriter.print(Average);
      printWriter.println();
      printWriter.close();  
      }catch(Exception e){
      }
     
    }
public static void getOverallAverage(){ 
     float sum = 0;
try{
     FileReader file = new FileReader("src/files/assessments/temp.txt");
      File path = new File("src/files/assessments/assessment.txt");
     File path1 = new File("src/files/assessments/temp.txt");
     BufferedReader bf = new BufferedReader(file);
     String st = bf.readLine();
     while((st=bf.readLine())!=null){
       StringTokenizer stn = new StringTokenizer(st); 
       float rn = Float.parseFloat(stn.nextToken());
       sum = sum+rn; 
     }
     System.out.println(sum);
     
       FileWriter fileWriter = new FileWriter(path, true);
       BufferedWriter buffer = new BufferedWriter(fileWriter);
       PrintWriter printWriter = new PrintWriter(buffer);
       printWriter.println();
       printWriter.print(sum);
       if(sum < 45){
         String remarks = "Fail";
         printWriter.print(remarks);
     }else{
         String remarks = "Pass";
         printWriter.print(remarks);
     }
       printWriter.close();
       FileWriter fileWriter1 = new FileWriter(path1, true);
       BufferedWriter buffer1 = new BufferedWriter(fileWriter1);
       PrintWriter printWriter1 = new PrintWriter(buffer1);
       printWriter1.print("");
       printWriter1.close(); 
     }catch(Exception e){
         
     }
}

}
