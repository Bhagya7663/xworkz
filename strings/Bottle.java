class Bottle{
public static void cup(String name,char direction)
{
System.out.println("name:"+name);
System.out.println("direction:"+direction);
}
public static void cup(String address,int number,int quantity)
{
	System.out.println("address:"+address);
	System.out.println("number:"+number);
	System.out.println("quantity:"+quantity);
}
public static void cup(String address,char direction,int number,int quantity)
{
	System.out.println("address:"+address);
	System.out.println("direction:"+direction);
	System.out.println("number:"+number);
	System.out.println("quantity:"+quantity);
	
}
public static void fun(String surname,double weight)
{
	System.out.println("surname:"+surname);
	System.out.println("weight:"+weight);

}
public static void fun(String source,int houseNo,float height)
{
	System.out.println("source:"+source);
	System.out.println("houseNo:"+houseNo);
	System.out.println("height:"+height);
}
public static void main(String[]args)
{
 cup("bhagya",'S');
 cup("rajajinagar",79,40);
 cup("yashwantpur",'N',90,24);
 fun("hiremath",40.00);
 fun("bijapur",42,4.00f);
}
}