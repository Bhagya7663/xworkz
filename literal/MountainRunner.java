class MountainRunner{
public static void main(String[]args)
{
System.out.println("start main in MountainRunner");
Mountain mountain=new Mountain();
String name=mountain.name;
int height=mountain.height;
String location=mountain.location;
System.out.println("mountain:"+name);
System.out.println("mountain:"+height);
System.out.println("mountain:"+location);
Mountain mountain1=new Mountain();
mountain1.name="K2";
mountain1.height=8611;
System.out.println("updated mountain:"+mountain1.name);
System.out.println("updated mountain:"+mountain1.height);
System.out.println("updated mountain:"+mountain1.location);


}
}