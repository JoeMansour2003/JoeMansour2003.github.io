import java.io.BufferedWriter;
import java.io.*;
import java.io.IOException;

public class Savequestion2 {

    public static boolean doStuff(String option, String input) throws IOException {

        FileWriter f= new FileWriter("./Question.txt",true);//file object for question file (change the file location where you want to save the file)
        BufferedWriter bf=new BufferedWriter(f);
        bf.write(option);
        bf.write(input);//writing question to the question file
        bf.write("\n");
        bf.close();
        if(!option.equals("(d) ")){
//            bf.write("\n");
//            bf.close();
            return true;
        }else{
//            bf.close();
            return false;
        }

    }
}
