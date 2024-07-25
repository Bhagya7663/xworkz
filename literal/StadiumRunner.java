class StadiumRunner{
public static void main(String[]args)
{
System.out.println("start main in StadiumRunner");
Stadium stadium=new Stadium();
String name=stadium.name;
int capacity=stadium.capacity;
String location=stadium.location;
System.out.println("stadium:"+name);
System.out.println("stadium:"+capacity);
System.out.println("stadium:"+location);
Stadium stadium1=new Stadium();
stadium1.name="Wembley";
stadium1.capacity=90000;
System.out.println("updated stadium:"+stadium1.name);
System.out.println("updated stadium:"+stadium1.capacity);
System.out.println("updated stadium:"+stadium1.location);


}
}