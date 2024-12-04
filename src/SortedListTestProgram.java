public class SortedListTestProgram {
    public static void main(String[] args) {

        //test case #1
        LinkedList list = new LinkedList();
        System.out.println("\nHere is the list: " + list);
        System.out.println("The list is sorted: " + list.isInIncreasingOrder());

        //test case #2
        list = new LinkedList();
        list.add(new Item(14));
        System.out.println("\nHere is the list: " + list);
        System.out.println("The list is sorted: " + list.isInIncreasingOrder());

        //test case #3
        list = new LinkedList();
        list.add(new Item(14));
        list.add(new Item(21));
        System.out.println("\nHere is the list: " + list);
        System.out.println("The list is sorted: " + list.isInIncreasingOrder());

        //test case #4
        list = new LinkedList();
        list.add(new Item(21));
        list.add(new Item(14));
        System.out.println("\nHere is the list: " + list);
        System.out.println("The list is sorted: " + list.isInIncreasingOrder());

        //test case #5
        list = new LinkedList();
        list.add(new Item(14));
        list.add(new Item(21));
        list.add(new Item(23));
        list.add(new Item(10));
        System.out.println("\nHere is the list: " + list);
        System.out.println("The list is sorted: " + list.isInIncreasingOrder());

        //test case #6
        list = new LinkedList();
        list.add(new Item(14));
        list.add(new Item(21));
        list.add(new Item(23));
        list.add(new Item(45));
        list.add(new Item(76));
        list.add(new Item(95));
        list.add(new Item(98));
        System.out.println("\nHere is the list: " + list);
        System.out.println("The list is sorted: " + list.isInIncreasingOrder());
    }
}
