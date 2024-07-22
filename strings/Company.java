class Company{
    public static void deliver(String item,String location)
{
   System.out.println("Running deliver in Company with two String argument");
   System.out.println("item:"+item);
   System.out.println("location:"+location);
}
}
class DeliveryVehicle{
   public static void deliver(String item,String location)
{
   System.out.println("Running deliver in DeliveryVehicle with two String argument");
   System.out.println("item:"+item);
   System.out.println("location:"+location);
   Company.deliver(item,location);
}
}
class DeliveryGuy{
   public static void deliver(String item)
{
  System.out.println("Running deliver in DeliveryGuy with one String argument");
  System.out.println("item:"+item);
  DeliveryVehicle.deliver(item,"FIXED");
}
}
class Swap{
   public static void main(String[]args)
{
  System.out.println("Running main in Swap");
  DeliveryGuy.deliver("item");
}
}