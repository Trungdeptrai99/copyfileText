package User;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        try {
            File original = new File("src/User/trungdeptrai.txt");
            FileReader fileReader= new FileReader(original);
            BufferedReader reader = new BufferedReader(fileReader);
            FileWriter output = new FileWriter("data/last.txt");
            String line = null;
            while ((line= reader.readLine())!=null){
                System.err.println(line);
                output.write(line+"\n");
            }
            output.close();
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
