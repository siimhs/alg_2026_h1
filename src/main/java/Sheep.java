public class Sheep {

   enum Animal {
      sheep, goat
   };

   public static void main(String[] param) {
      Animal[] s1 = new Animal[] { Animal.sheep, Animal.sheep, Animal.goat, Animal.sheep, Animal.goat };
      Animal[] s2 = new Animal[] { Animal.goat, Animal.sheep, Animal.goat, Animal.sheep, Animal.sheep };
      Animal[] s3 = new Animal[] { Animal.sheep, Animal.sheep, Animal.sheep, Animal.sheep, Animal.sheep };
      Animal[] s4 = new Animal[] { Animal.goat, Animal.goat, Animal.goat, Animal.goat, Animal.goat };

      System.err.println("s1: " + printAnimals(s1));
      reorder(s1);
      System.err.println("s1: " + printAnimals(s1));

      System.err.println("s2: " + printAnimals(s2));
      reorder(s2);
      System.err.println("s2: " + printAnimals(s2));

      System.err.println("s3: " + printAnimals(s3));
      reorder(s3);
      System.err.println("s3: " + printAnimals(s3));

      System.err.println("s4: " + printAnimals(s4));
      reorder(s4);
      System.err.println("s4: " + printAnimals(s4));
   }

   public static void reorder(Animal[] animals) {
      // take first animal
      // if goat, take move to next or end.
      // else find first sheep from back until sheep found or you have reached to same
      // index (then end)

      int lastSheep = -1;
      Animal tmp = Animal.goat;

      for (int i = 0; i < animals.length; i++) {
         if (animals[i] == Animal.sheep) {
            for (int j = getStart(animals.length-1, lastSheep); j >= i; j--) {
               if (j == i) {
                  return;
               }
               if (animals[j] == Animal.goat) {
                  lastSheep = j;
                  tmp = animals[j];
                  animals[j] = animals[i];
                  animals[i] = tmp;
                  break;
               }
            }
         }
      }
   }

   private static int getStart(int i, int s){
      if( s == -1 ){
         return i;
      } else {
         return s;
      }
   }

   private static String printAnimals(Animal[] a){
      String result = "";
      for (int i = 0; i < a.length; i++) {
         result += a[i] + " ";
      }
      return result;
   }
}
