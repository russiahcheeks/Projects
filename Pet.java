public class Pet {

   // Private data
   private String name;

   // Default constructor
   public Pet() {
      setName("Pet Name");
   }

   // Mutator (set)
   public void setName(String name) {
      this.name = name;
   }

   // Accessor (get)
   public String getName() {
      return name;
   }

   // toString method
   public String toString() {
      String info = "";
      info += "Pet information:\n";
      info += "Name: " + name + "\n";
      return info;
   }

   // main method in same file
   public static void main(String[] args) {

      // First Pet object using default constructor
      Pet p1 = new Pet();
      System.out.println(p1.toString());

      // Second Pet object using set method
      Pet p2 = new Pet();
      p2.setName("Buster");
      System.out.println(p2.toString());
   }
}
