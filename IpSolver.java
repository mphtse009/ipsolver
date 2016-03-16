

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpSolver {

    public static void main(String[] arg) throws FileNotFoundException, IOException {
        
        String fileName="";
        try{
          fileName = arg[0];    
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        ArrayList<String> validIP = new ArrayList<>();
        ArrayList<String> invalidIP = new ArrayList<>();
        if(fileName.length() >0)
        {
        
        Scanner scanner = new Scanner(new FileInputStream(fileName));
        
        String line;
        IpChecker checker;
        while(scanner.hasNext())
            {         
                line=scanner.nextLine();
                checker = new IpChecker();
                if(checker.checkIp(line))
                {
                validIP.add(line);
                }
                else
                {
                    invalidIP.add(line);
                }
            }
            
           
        }
        else
        {
            System.out.println("Error: Problem Reading file. No argument entered");
        }
        printResult("validIP.txt", validIP);
        printResult("invalidIP.txt", invalidIP);
    }
    public static void printResult(String fileName,ArrayList<String> toPrint) throws IOException
    {
        toPrint.trimToSize();
        Collections.sort(toPrint);
        File file = new File(fileName);
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file,true)),true);
         for (int i=toPrint.size()-1;i>=0;i--)
            {
                writer.println(toPrint.get(i));
            }
    }
    
}