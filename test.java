interface I1
{
   public void show();
}
class test implements I1
{
 public void show()
  {
     System.out.println("Sandeep");
  }
    public static void main(String args[])
     {
       test t=new test();
       t.show();;
      }
 }