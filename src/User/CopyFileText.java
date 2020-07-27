package User;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        int count = 0;
        File original;
        FileWriter output;
        Scanner sc = new Scanner(System.in);
        try {
            original = new File("Data/trungdeptrai.txt");
            if(!original.exists()){
                System.out.println("Không có file đầu vào! Bạn có muốn tạo file mới?");
                System.out.println("1.Tạo mới");
                System.out.println("2.Thoát chương trình!");
                int option = sc.nextInt();
                switch (option){
                    case 1:{
                        original.createNewFile();
                    }
                    case 2:{
                        System.exit(0);
                    }
                }
            }
            FileReader fileReader= new FileReader(original);
            BufferedReader reader = new BufferedReader(fileReader);
            output = new FileWriter("Data/Last.txt");
                int line;
                while ((line = reader.read() )!=-1) {
                    if(line==13){
                        count--;
                    }
                    System.out.println(line);
                    output.write((char) line );
                    count++;
                }
                output.close();
                reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Số ký tự đã copy là: "+count);
        }
    }
}
