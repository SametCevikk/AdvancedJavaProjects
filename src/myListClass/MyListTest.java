package myListClass;

public class MyListTest {
    public static void main(String[] args) {

        MyList<Integer> list = new MyList<>();
        System.out.println("Number of Elements in the Array : " + list.size());
        System.out.println("Capacity of the Array : " + list.getCapacity());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Number of Elements in the Array : " + list.size());
        System.out.println("Capacity of the Array: " + list.getCapacity());
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("Number of Elements in the Array : " + list.size());
        System.out.println("Capacity of the Array : " + list.getCapacity());

        // Empty the list completely and return it to its default size
        list.clear();

        System.out.println("-------------------------------------------------------------");
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Value in 2nd index : " + list.get(2));
        list.remove(2);
        list.add(40);
        list.set(0, 100);
        System.out.println("Value in 2nd index : " + list.get(2));
        System.out.println(list.toString());

        System.out.println("-------------------------------------------------------------");


        list.clear();
        System.out.println("List Status : " + (list.isEmpty() ? "Empty" : "Not Empty"));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println("List Status : " + (list.isEmpty() ? "Empty" : "Not Empty"));

        // Returns the first index found
        System.out.println("Index : " + list.indexOf(20));

        // If not found, returns -1
        System.out.println("Index :" + list.indexOf(100));

        // Returns the last index found
        System.out.println("Index : " + list.lastIndexOf(20));

        // Returns the list as an Object[] array.
        Object[] array = list.toArray();
        System.out.println("First element of the Object array :" + array[0]);

        // Created a sublist of List data type
        MyList<Integer> mySublist = list.subList(0, 3);
        System.out.println(mySublist.toString());

        // Query whether the value is on the list
        System.out.println("Value 20 on list : " + list.contains(20));
        System.out.println("Value 20 on list : " + list.contains(120));

        list.clear();
        System.out.println(list.toString());
    }
}
