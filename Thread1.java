public class Thread1
{
  public static void main(String[] args) throws Exception
  {
    NewThread nt = new NewThread();
    nt.start();
    int i = 1;
    while(i<11)
    {
      System.out.println(i);
      Thread.sleep(250);
      i++;
    }
  }
}
class NewThread extends Thread
{
  public void run()
  {
    int i = 1;
    try{
    while(i<11)
    {
      System.out.println((char)(64+i));
      sleep(250);
      i++;
    }
  }catch(Exception e){}

  }
}
