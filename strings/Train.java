class Train{
public static void book(String source,String destination)
{
System.out.println("source:"+source);
System.out.println("destination:"+destination);
}
public static void book(String source,String destination,int quantity)
{
System.out.println("source:"+source);
System.out.println("destination:"+destination);
System.out.println("quantity:"+quantity);
}
public static void book(String source,String destination,int quantity,int price)
{
System.out.println("source:"+source);
System.out.println("destination:"+destination);
System.out.println("quantity:"+quantity);
System.out.println("price:"+price);
}
public static void cancel(int ticketNo)
{
System.out.println("ticketNo:"+ticketNo);
}
public static void cancel(String source,String destination)
{
System.out.println("source:"+source);
System.out.println("destination:"+destination);
}
public static void main(String[]args)
{
book("bijapur","bangalore");
book("bangalore","bagalkot",34);
book("bagalkot","madikeri",50,345);
cancel(456);
cancel("shimla","nagpur");
}
}

