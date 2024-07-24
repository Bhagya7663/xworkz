class PlaceRunner{
public static void main(String[]args)
{
System.out.println("start main in PlaceRunner");
Place place=new Place();
String placeName=place.placeName;
double price=place.price;
int days=place.days;
System.out.println("placeName is:"+placeName);
System.out.println("price is:"+price);
System.out.println("days is:"+days);
Place place1=new Place();
place1.placeName="goa";
place1.price=35000;
place1.days=12;
System.out.println("updated placeName is:"+place1.placeName);
System.out.println("updated price is:"+place1.price);
System.out.println("updated days is:"+place1.days);
}
}