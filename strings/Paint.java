class Paint{
public static void run()
{
System.out.println(" brand :"+ brand);
}
public static void run(String brand,String color)
{
System.out.println(" brand :"+ brand);
System.out.println(" color :"+ color);
}
public static void run(String brand,double prices)
{
System.out.println(" brand :"+ brand);
System.out.println(" prices :"+ prices);
}
public static void run(String brand,String type,double prices)
{
System.out.println(" brand :"+ brand);
System.out.println(" type :"+ type);
System.out.println(" prices :"+ prices);
}
public static void main(String[]args)
{
Paint.run("jockey");
Paint.run("puma","black");
Paint.run("adidas",56.87);
Paint.run("johson","String",34.98);
}
}

