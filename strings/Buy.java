class Buy{
public static void product(String brand,double price)
{
System.out.println("running product in Buy");
System.out.println("brand:"+brand);
System.out.println("price:"+price);

if (price>500 && price<=800.00)
{
	System.out.println("valid price");
}
else
{
	System.out.println("invalid price");
}
}
	 public static void product(String name,int quantity,String quality,double price)
 {
System.out.println("running product in Buy");
System.out.println("name:"+name);
System.out.println("quantity:"+quantity);
System.out.println("quality:"+quality);
System.out.println("price:"+price);

if (price>200 && price<=2000.00)
{
	System.out.println("valid price");
}
else
{
	System.out.println("invalid price");
}
}
 
 public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
 {
System.out.println("name:"+name);
System.out.println("theaterName:"+theaterName);
System.out.println("quantity:"+quantity);
System.out.println("price:"+price);
 
 if (price>400 && price<=4000.00)
{
	System.out.println("valid price");
}
else
{
	System.out.println("invalid price");
}
}
 
 public static void buyEgg(int total,double pricePerEgg)
 {
 System.out.println("total:"+total);
 System.out.println("pricePerEgg:"+pricePerEgg);
 
 if (pricePerEgg>10.00 && pricePerEgg<60.00)
{
	System.out.println("valid price");
}
else
{
	System.out.println("invalid price");
}
 }
 public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
 {
 System.out.println("quantityInMl:"+quantityInMl);
 System.out.println("price:"+price);
 System.out.println("brand:"+brand);
 System.out.println("manfDate:"+manfDate);

if (price>300 && price<=70000.00)
{
	System.out.println("valid price");
}
else
{
	System.out.println("invalid price");
}
}
 public static void buyCake(char size,String type,String flavour,double cost,int quantity)
 {
  System.out.println("size:"+size);
   System.out.println("type:"+type);
    System.out.println("flavour:"+flavour);
	 System.out.println("cost:"+cost);
	  System.out.println("quantity:"+quantity);
 
 if (cost>90.00 && cost<=100.00)
{
	System.out.println("valid cost");
}
else
{
	System.out.println("invalid cost");
}
 
 }
public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
{
 System.out.println("brand:"+brand);
  System.out.println("serialNo:"+serialNo);
   System.out.println("price:"+price);
    System.out.println("batteryCapacity:"+batteryCapacity);
	 System.out.println("screenSize:"+screenSize);
	  System.out.println("os:"+os);
	   System.out.println("harddiskSize:"+harddiskSize);
	    System.out.println("ramSize:"+ramSize);

	if (price>800000 && price<=70000.00)
{
	System.out.println("valid price");
}
else
{
	System.out.println("invalid price");
}	
		}
public static void buySmartWatch(String brand,double price,int color,char type,int mode)
{
System.out.println("brand:"+brand);
System.out.println("price:"+price);
System.out.println(" color:"+ color);
System.out.println("type:"+type);
System.out.println("mode:"+ mode);

if (price>2000 && price<=5000.00)
{
	System.out.println("valid price");
}
else
{
	System.out.println("invalid price");
}	

}
}