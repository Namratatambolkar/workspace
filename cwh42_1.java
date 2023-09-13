class emp {
   private String name;
   private int id;

   public emp() {
      name = "NAMU";
      id = 4;
   }

   public void setName(String n) {
      this.name = n;
   }

   public String getName() {
      return name;
   }

   public void setId(int i) {
      this.id = i;
   }

   public int getId() {
      return id;
   }

}

public class cwh42_1 {

   public static void main(String args[]) {
      emp e1 = new emp();
      System.out.println(e1.getName());
      System.out.println(e1.getId());
   }
}
