class Dog
{
    public static void guarding(String location)
    {
      System.out.println("running guarding in Dog with one String argument");
      System.out.println("location:"+location);
    }
}
class House{
   public static void watch(String location)
{
  System.out.println("running watch in House with one String argument");
  System.out.println("location:"+location);
  Dog.guarding(location);
}
}
class Metro{
   public static void main(String[]args)
{
   System.out.println("Running main in Metro");
   House.watch("Gate");
}
}
