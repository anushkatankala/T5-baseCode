
public class BinaryTreeTestProgram2 {
    public static void main(String[] args) {
        BinaryTree 	tree1, tree2, tree3, tree4, tree5, tree6, tree7, tree8;

        //an empty tree
        tree1 = new BinaryTree();

        //a single node
        tree2 = new BinaryTree("A", new BinaryTree(), new BinaryTree());

        //symmetric tree
        tree3 = new BinaryTree("A",
                new BinaryTree("B", new BinaryTree(), new BinaryTree()),
                new BinaryTree("B", new BinaryTree(), new BinaryTree()));

        //symmetric tree
        tree4 = new BinaryTree("A",
                new BinaryTree("B",
                        new BinaryTree("C", new BinaryTree(), new BinaryTree()),
                        new BinaryTree("D", new BinaryTree(), new BinaryTree())),
                new BinaryTree("B",
                        new BinaryTree("D", new BinaryTree(), new BinaryTree()),
                        new BinaryTree("C", new BinaryTree(), new BinaryTree())));

        //non-symmetric tree
        tree5 = new BinaryTree("A",
                new BinaryTree("B",
                        new BinaryTree("C",
                                new BinaryTree("D"),
                                new BinaryTree("E",
                                        new BinaryTree("F",
                                                new BinaryTree("G"),
                                                new BinaryTree("I")),
                                        new BinaryTree("H"))),
                        new BinaryTree("J",
                                new BinaryTree("K",
                                        new BinaryTree(),
                                        new BinaryTree("L",
                                                new BinaryTree(),
                                                new BinaryTree("M"))),
                                new BinaryTree("N",
                                        new BinaryTree(),
                                        new BinaryTree("O")))),
                new BinaryTree("P",
                        new BinaryTree("Q"),
                        new BinaryTree("R",
                                new BinaryTree("S",
                                        new BinaryTree("T"),
                                        new BinaryTree()),
                                new BinaryTree("U"))));
        tree6 = new BinaryTree("A",
                new BinaryTree("B",
                        new BinaryTree("C",
                                new BinaryTree("D"),
                                new BinaryTree("E",
                                        new BinaryTree("F",
                                                new BinaryTree("Z"), //different letter here
                                                new BinaryTree("I")),
                                        new BinaryTree("H"))),
                        new BinaryTree("J",
                                new BinaryTree("K",
                                        new BinaryTree(),
                                        new BinaryTree("L",
                                                new BinaryTree(),
                                                new BinaryTree("M"))),
                                new BinaryTree("N",
                                        new BinaryTree(),
                                        new BinaryTree("O")))),
                new BinaryTree("P",
                        new BinaryTree("Q"),
                        new BinaryTree("R",
                                new BinaryTree("S",
                                        new BinaryTree("T"),
                                        new BinaryTree()),
                                new BinaryTree("U"))));

        //non-symmetric tree
        tree7 = new BinaryTree("A",
                new BinaryTree("B",
                        new BinaryTree("C",
                                new BinaryTree("D"),
                                new BinaryTree("E",
                                        new BinaryTree("F",
                                                new BinaryTree("G"),
                                                new BinaryTree("I")),
                                        new BinaryTree("H"))),
                        new BinaryTree()),  // "J" tree removed
                new BinaryTree("P",
                        new BinaryTree("Q"),
                        new BinaryTree("R",
                                new BinaryTree("S",
                                        new BinaryTree("T"),
                                        new BinaryTree()),
                                new BinaryTree("U"))));

        //non-symmetric tree
        tree8 = new BinaryTree("A",
                new BinaryTree("B",
                        new BinaryTree("C",
                                new BinaryTree("D"),
                                new BinaryTree("E",
                                        new BinaryTree("F",
                                                new BinaryTree("G"),
                                                new BinaryTree("I")),
                                        new BinaryTree("H"))),
                        new BinaryTree("J",
                                new BinaryTree("K",
                                        new BinaryTree(),
                                        new BinaryTree("L",
                                                new BinaryTree(),
                                                new BinaryTree("M"))),
                                new BinaryTree("N",
                                        new BinaryTree(),
                                        new BinaryTree("O")))),
                new BinaryTree("P",
                        new BinaryTree("Q"),
                        new BinaryTree("R",
                                new BinaryTree("S",
                                        new BinaryTree("T"),
                                        new BinaryTree()),
                                new BinaryTree())));  // "U" tree removed


        System.out.println("Tree 1 is the same as Tree 1 = " + tree1.isTheSameAs(tree1)); // true
        System.out.println("Tree 2 is the same as Tree 1 = " + tree2.isTheSameAs(tree1)); // false
        System.out.println("Tree 2 is the same as Tree 2 = " + tree2.isTheSameAs(tree2)); // true
        System.out.println("Tree 5 is the same as Tree 2 = " + tree1.isTheSameAs(tree2)); // false
        System.out.println("Tree 5 is the same as Tree 5 = " + tree5.isTheSameAs(tree5)); // true
        System.out.println("Tree 5 is the same as Tree 6 = " + tree5.isTheSameAs(tree6)); // false
        System.out.println("Tree 5 is the same as Tree 7 = " + tree5.isTheSameAs(tree7)); // false
        System.out.println("Tree 5 is the same as Tree 8 = " + tree1.isTheSameAs(tree8)); // false


        System.out.println("Tree 1 is symmetric = " + tree1.isSymmetric()); // true
        System.out.println("Tree 2 is symmetric = " + tree2.isSymmetric()); // true
        System.out.println("Tree 3 is symmetric = " + tree3.isSymmetric()); // true
        System.out.println("Tree 4 is symmetric = " + tree4.isSymmetric()); // true
        System.out.println("Tree 5 is symmetric = " + tree5.isSymmetric()); // false

    }
}
