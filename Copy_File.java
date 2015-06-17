import java.io.*;
public class Copy_File
{
  public static void main(String[] args)throws Exception
  {
    String source = args[0];
    String destination = args[1];
    File f1 = new File("Sample\\"+source);
    File f2 = new File("Sample\\"+destination);
    if((f1.exists()))
    {
      FileInputStream fis = new FileInputStream(f1);
      FileOutputStream fos = new FileOutputStream(f2);
      while(true)
      {
        int a = fis.read();
        if(a == -1)
        break;
        fos.write(a);
      }
      System.out.println("File successfully ccopied");
    }
    else
    System.out.println("Source file doesnot exists");

  }
}
