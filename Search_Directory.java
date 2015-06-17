import java.io.*;
import javax.swing.*;
public class Search_Directory
{
  public static void main(String[] args)
  {
    System.out.println("1 : image  2 : music  3 : text  4 : docx");
    String s = JOptionPane.showInputDialog("Enter choice ");
    int choose = Integer.parseInt(s);
    //int choose = 1;
    //try{
    File f1 = new File("F:\\Dropbox");//Provide a valid path..use '\\' for a single separator '\' because '\' is an escape character
    File[] files = f1.listFiles();//d:\\Songs...d:\Songs
    for(File f : files)
    {
      System.out.println(f);
    }

    Search_Directory1 ob = new Search_Directory1();
  //} catch (Exception e)
  /*{
    System.out.println(e.getClass());
    System.out.println(e.getMessage());
  }*/
    switch(choose)
    {
      case 1 : System.out.println("Numbers of image : "+ob.image(files));
               break;
      case 2 :System.out.println("Numbers of music : "+ob.music(files));
              break;
      case 3 :System.out.println("Numbers of text : "+ob.text(files));
              break;
      case 4 :System.out.println("Numbers of docx : "+ob.docx(files));
              break;
      default : System.out.println("Wrong choice");
    }
  }
}
