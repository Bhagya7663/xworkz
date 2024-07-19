class College{
  public static void Campus(){
System.out.println("Running Campus in College");
}
 public static void Activities(){
System.out.println("Running Activities in College");
Placements();
}
  public static void Placements(){
System.out.println("Running Placements in College");
Activities();
}
}