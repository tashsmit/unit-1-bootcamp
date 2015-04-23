/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  public static void main (String args[]) {

      Cat garfield = new Cat ("Garfield");
      Cat pinkPanther = new Cat ("Pink Panther");
      Cat catWoman = new Cat ("Catwoman");

      garfield.setFavoriteFood("Lasagna");
      pinkPanther.setFavoriteFood("cheerios");
      catWoman.setFavoriteFood("lollipops");

      garfield.setAge(40);
      pinkPanther.setAge(25);
      catWoman.setAge(20);

      //System.out.println(isOlder(garfield, pinkPanther));
      //makeBestFriends(pinkPanther, catWoman);
      //System.out.println(catWoman.getFavoriteFood());
      //Cat kitten = makeKitten(garfield, catWoman);
      //System.out.println(kitten.getName());

      Person bob = new Person("Bob");
      adoption(garfield, bob);
      adoption(pinkPanther, bob);
      System.out.println(isSiblings(catWoman,garfield));
  }

    public static boolean isOlder (Cat cat1, Cat cat2) {

        return (cat1.getAge() > cat2.getAge());
    }

    public static void makeBestFriends (Cat cat1, Cat cat2) {

        cat2.setFavoriteFood(cat1.getFavoriteFood());
    }

    public static Cat makeKitten (Cat cat1, Cat cat2) {

        Cat kitten = new Cat(cat1.getName() + cat2.getName());
        kitten.setAge(0);
        return kitten;
    }

    public static void adoption (Cat cat1, Person person1) {

        if (cat1.getName() == "Catwoman") {
            System.out.println("Catwoman will never be anyone's pet!");
        }
        else {
            cat1.setOwner(person1);
        }
    }

    public static boolean isFree (Cat cat1) {

        return (cat1.getOwner() == null);
    }

    public static boolean isSiblings (Cat cat1, Cat cat2) {

        return (cat1.getOwner() == cat2.getOwner());
    }
}
