class BuyRunner{
 public static void main(String[]args)
{
System.out.println("running main in BuyRunner");
Buy.product("puma",600);
Buy.product("adidas",900);
Buy.product("bhagya",30,"premium",300);
Buy.product("brunda",30,"firstclass",3000);
Buy.bookMovieTicket("chetanaa","Anjan",20,400);
Buy.bookMovieTicket("chetana","Anand",20,5000);
Buy.buyEgg(600,10);
Buy.buyEgg(300,70);
Buy.buyShampoo(600,300,"parachute","may 20");
Buy.buyShampoo(600,8000,"treseme","may 20");
Buy.buyCake('S',"String","mango",90.00,20);
Buy.buyCake('S',"String","Apple",120.00,20);
Buy.buyLaptop("hp",10,80000,4400,14,"Windows",25,4);
Buy.buyLaptop("dell",10,90000,4400,14,"Windows",25,4);
Buy.buySmartWatch("firebolt",2000,2,'S',50);
Buy.buySmartWatch("Apple",8000,2,'S',50);
}
}