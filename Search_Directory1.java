import java.io.*;

public class Search_Directory1
{
	static int c = 0;
  public int image(File files[])
  {

    for(File f : files)
    {
      if((f.getName().endsWith("jpg")))
        c++;
      else if(f.isDirectory())
      {
        File f1 [] = f.listFiles();
        image(f1);
      }
    }
    return c;
  }
  public int music(File files[])
  {
    int c = 0;
    for(File f : files)
    {
      if((f.getName().endsWith("mp3")))
        c++;
      else if(f.isDirectory())
      {
        File f1 [] = f.listFiles();
        music(f1);
      }
    }
    return c;
  }
  public int text(File files[])
  {
    int c = 0;
    for(File f : files)
    {
      if((f.getName().endsWith("pdf")))
        c++;
      else if(f.isDirectory())
      {
        File f1 [] = f.listFiles();
        text(f1);
      }
    }
    return c;
  }
  public int docx(File files[])
  {
    int c = 0;
    for(File f : files)
    {
      if((f.getName().endsWith("docx")))
        c++;
      else if(f.isDirectory())
      {
        File f1 [] = f.listFiles();
        docx(f1);
      }
    }
    return c;
  }
}
