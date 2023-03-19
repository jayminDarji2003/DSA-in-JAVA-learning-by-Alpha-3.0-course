
/*
    Comparator in JAVA
        -> A comparator in JAVA is an interface that is used to order the objects of user-defined class.
        -> Inshort comparator is used to sort the objects of class.
*/
import java.util.*;

public class Comparatorr {
    class Person{
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int compateTo(Person person){
            if(this.age == person.age){
                return 0;
            }else{
                return (this.age < person.age) ? -1 : 1;
            }
        }

        public String toString(){
            return this.name + ":" + this.age;
        }
    }

    public static void main(String[] args) {
       ArrayList<Person> list = new ArrayList<Person>();
    //    list.add(new Person("Jaymin", 19));
    //    list.add(new Person("Devange", 20));
    //    list.add(new Person("Ayushi", 21));

    //    Collections.sort(list);
       System.out.println(list);

    }

   
}
