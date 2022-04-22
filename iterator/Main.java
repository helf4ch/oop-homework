package iterator;

public class Main {
    public static void main(String[] args) {
        {
            LinkedList<Number> ls = new LinkedList<>();
            ls.add(1);
            ls.add(2);
            ls.add(3);
            ls.add(4);

            for (Number it : ls) {
                System.out.println(it);
            }
        }

        System.out.println();

        {
            ArrayList<Number> ls = new ArrayList<>();
            ls.add(1);
            ls.add(2);
            ls.add(3);
            ls.add(4);

            for (Number it : ls) {
                System.out.println(it);
            }
        }

        System.out.println();

        {
            System.out.println("empty");

            ArrayList<Number> ls = new ArrayList<>();

            for (Number it : ls) {
                System.out.println(it);
            }
        }

        System.out.println();

        {
            System.out.println("empty");
            
            LinkedList<Number> ls = new LinkedList<>();

            for (Number it : ls) {
                System.out.println(it);
            }
        }
    }
}
