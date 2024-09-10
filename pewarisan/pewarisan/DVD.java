package pewarisan;

//subclass
public class DVD extends product {
   private int length;
   private String rating;
   private String studio;

   public DVD() {
    
    number = 10;
    quantity = 4;
    name = "movie";  
    price = 50000;
    length = 2;
    rating = "aldult only";
    studio = "uhehe studio";

   }
   public void print() {
    System.out.println("number : "+number);
    System.out.println("quantity : "+quantity);
    System.out.println("name : "+name);
    System.out.println("price : "+price);
    System.out.println("length : "+length);
    System.out.println("rating : "+rating);
    System.out.println("studio : "+studio);
   }
}
