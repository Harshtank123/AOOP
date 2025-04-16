import java.io.*;

public class main
  {
    public static void main(String [] args) throw toException
  {
    String filepath="sample.txt";
    filewriter write=newfilewriter(filepath);
    write.write("Hello file handling example");
    write.close();
    System.out.println("Data write in file");
    Buffered Reader(new file Reader(filepath));
    String line;
    System.out.println("Reading string ");
    while(line=readerreadline()=null){
      System.out.println(line);
    }
    header clase();
  }
  }