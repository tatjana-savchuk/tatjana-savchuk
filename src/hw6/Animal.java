package hw6;

public class Animal {
   private String food;
   private String location;
   public String name;

   public Animal (String name,String food,String location) {
      this.name = name;
      this.food = food;
      this.location = location;
   }

   public void makeNoise() {
      System.out.println( getName() + " говорит...");
   }

   public void eat() {
      System.out.println( name + "ест..");
   }


   public String getFood() {
      return this.food;
   }

   public void setFood(String food) {
      this.food = food;
   }

   public String getLocation() {
      return this.location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Animal (String name) {
      this.name =name;
   }
}
