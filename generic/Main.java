package generic;

public class Main {
    public static void main(String[] args) {
        {
            ArrayList<Number> ls = new ArrayList<>();
            ls.add(1);
            ls.add(2);
            ls.add(3);
            ls.add(4);
            System.out.println(ls.get(3));
            ls.remove(1);
            System.out.println(ls.get(1));
            ls.remove(3);

            ls.put(20, 2);
            System.out.println(ls.get(2));

            System.out.println("pos " + ls.find(20));
        }

        System.out.println();

        {
            LinkedList<Number> ls = new LinkedList<>();
            ls.add(1);
            ls.add(2);
            ls.add(3);
            ls.add(4);
            System.out.println(ls.get(3));
            ls.remove(1);
            System.out.println(ls.get(1));
            ls.remove(3);

            ls.put(20, 2);
            System.out.println(ls.get(2));

            System.out.println("pos " + ls.find(20));
        }
    }
}
