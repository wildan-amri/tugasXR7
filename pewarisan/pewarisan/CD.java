package pewarisan;

//subclass
public class CD extends product {
   private String artist;
    private int totalsong;
   private String label;

   public CD() {
    number = 7;
    quantity = 4;
    name = "hello world";
    price = 40000;
    artist = "wildan";
    totalsong = 4;
    label = "Gurah Studio";
   }
    public void print() {
        System.out.println("number : "+number);
        System.out.println("quantity : "+quantity);
        System.out.println("name : "+name);
        System.out.println("price : "+price);
        System.out.println("artist : "+artist);
        System.out.println("totalsong : "+totalsong);
        System.out.println("label : "+label);
    }
}
