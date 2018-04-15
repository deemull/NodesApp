import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\nHello, Nodes!\n");

        System.out.println("\n---- 01 ----");
        MyNode n1 = new MyNode(10);
        MyNode n2 = new MyNode(20);
        MyNode n3 = new MyNode(30);
        output3Nodes("n1", n1, "n2", n2, "n3", n3);
        int factor = n3.factorial(n3.value);
        System.out.println(factor);
        System.out.println();

        System.out.println("\n---- 02 ----");
        // TODO Create a new node, n4, that is n1 followed by n2.  Don't change n1 or n2.
        MyNode n4 = new MyNode(n1.value);
        n4.next = n2;
        output3Nodes("n1", n1, "n2", n2, "n3", n3);
        output1Node("n4", n4);
        int fibNum = n4.fibonacci(n4.value);
        System.out.println(fibNum);
        System.out.println();

        System.out.println("\n---- 03 ----");
        // TODO Create a new node, n5, that has a n2 followed by n3.  n5 will be 20-30.  Don't change n2 or n3.
        MyNode n5 = new MyNode(n2.value);
        n5.next = n3;
        output3Nodes("n1", n1, "n2", n2, "n3", n3);
        output2Nodes("n4", n4, "n5", n5);
        String name = "Derrick";
        n5.printName(name, 3);
        System.out.println();

        System.out.println("\n---- 04 ----");
        // Create a node, n6, that is a reference to n3.  n6 will be 30.  No other nodes should change.
        MyNode n6 = n3;
        output3Nodes("n1", n1, "n2", n2, "n3", n3);
        output3Nodes("n4", n4, "n5", n5, "n6", n6);
        ArrayList<Integer> nodes = new ArrayList<>();
        n6.length(nodes);
        System.out.println();

        System.out.println("\n---- 05 ----");
        // TODO Change the value of n3 to 33.  n6 should also change but no other nodes should change.
        // n6 should change because both n3 and n6 are referencing the same Node
        n3.value = 33;
        output3Nodes("n1", n1, "n2", n2, "n3", n3);
        output3Nodes("n4", n4, "n5", n5, "n6", n6);
        System.out.println("Why do you know why n3, n6, and also n5 change when n3 changes?");
        System.out.println();


        System.out.println("\n---- 06 ----");
        // TODO Change the value of n6 to 66.  n3 should also change but no other nodes should change.
        n6.value = 66;
        output3Nodes("n1", n1, "n2", n2, "n3", n3);
        output3Nodes("n4", n4, "n5", n5, "n6", n6);
        System.out.println("Again, do you know why  n3, n6, and also n5 change when n6 changes?");
        System.out.println();

        System.out.println("\n---- 07 - Reset ----");
        n1 = new MyNode(10);
        n2 = new MyNode(20);
        n3 = new MyNode(30);
        output3Nodes("n1", n1, "n2", n2, "n3", n3);
        System.out.println();

        System.out.println("\n---- 08 ----");
        // TODO:  n1 = prepend(n1, 5);  // n1 is 5-10
        // TODO:  n1 = prepend(n1, 0);  // n1 is 0-5-10

        System.out.println("\n---- 09 ----");
        // TODO:  n1 = append(n1, 15);  // n1 is 0-5-10-15
        // TODO:  n1 = append(n1, 17);  // n1 is 0-5-10-15-17

        System.out.println("\n---- 10 ----");
        // TODO:  n1 = insert(n1, 1, 3);  // n1 is 0-3-5-10-15-17
        // TODO:  n1 = insert(n1, 2, 7);  // n1 is 0-3-5-7-10-15-17

        System.out.println("\n---- 11 ----");
        // TODO:  n1 = append(n1, 5);     // n1 is 0-3-5-7-10-15-17-5
        // TODO:  n1 = prepend(n1, 5);    // n1 is 5-0-3-5-7-10-15-17-5
        // TODO:  n1 = removeAll(n1, 5);  // n1 is 0-3-7-10-15-17


        System.out.println("\n---- 12 - Reset ----");
        MyNode n0 = null;
        n1 = new MyNode(10);
        n2 = new MyNode(20);
        n3 = new MyNode(30);
        output3Nodes("n1", n1, "n2", n2, "n3", n3);
        System.out.println();

        System.out.println("\n---- 13 ----");
        // TODO:  n4 = append(n1,n2);     // n4 is 10-20
        // TODO:  n4 = prepend(n4, n3);   // n4 is 30-10-20
        // TODO:  n5 = n4.next.next;      // n5 is 20

        System.out.println("\n---- 14 - recursive size() ----");
        // TODO:  output the number of nodes in n0
        // TODO:  output the number of nodes in n1
        // TODO:  output the number of nodes in n2
        // TODO:  output the number of nodes in n3
        // TODO:  output the number of nodes in n4
        // TODO:  output the number of nodes in n5

        System.out.println("\n---- 15 - recursive contains() ----");
        // TODO:  boolean answer = contains(n0, 10);
        // TODO:  boolean answer = contains(n1, 10);
        // TODO:  boolean answer = contains(n1, 10);
        // TODO:  boolean answer = contains(n2, 10);
        // TODO:  boolean answer = contains(n3, 10);
        // TODO:  boolean answer = contains(n4, 10);
        // TODO:  boolean answer = contains(n5, 10);

        System.out.println("\n---- 16 - recursive countEvens() ----");
        // TODO:  int answer = countEvens(n0);
        // TODO:  int answer = countEvens(n1);
        // TODO:  int answer = countEvens(n2);
        // TODO:  int answer = countEvens(n3);
        // TODO:  int answer = countEvens(n4);
        // TODO:  int answer = countEvens(n5);

        System.out.println("\n---- 17 - recursive isSorted() ----");
        // TODO:  boolean answer = isSorted(n0);
        // TODO:  boolean answer = isSorted(n1);
        // TODO:  boolean answer = isSorted(n2);
        // TODO:  boolean answer = isSorted(n3);
        // TODO:  boolean answer = isSorted(n4);
        // TODO:  boolean answer = isSorted(n5);

        System.out.println("\n---- 18 - Reset ----");
        n0 = null;
        n1 = new MyNode(10);
        n2 = new MyNode(20);
        n3 = new MyNode(30);
        output2Nodes("n0", n0, "n1", n1);
        output2Nodes("n2", n2, "n3", n3);
        System.out.println();

        System.out.println("\n---- 19 ----");
        // TODO:  n1 is read a random [1-10], link that number of random [0-20] Nodes
        // TODO:  n2 is middle Node of n1
        // TODO:  n3 is last Node of n1

        System.out.println("\n---- 20 - Cycle ----");
        // TODO:  link n3's next to n1
        // TODO:  output the number of Nodes in n1
        // TODO:  given a Node, return true if that Node is part of a cycle
        // TODO:  output the number of Nodes from a given Node

    }

    public static void output1Node(String s, MyNode n) {
        System.out.println(s + ":\t" + n);
    }

    public static void output2Nodes(String s1, MyNode n1, String s2, MyNode n2) {
        output1Node(s1, n1);
        output1Node(s2, n2);
    }

    public static void output3Nodes(String s1, MyNode n1, String s2, MyNode n2, String s3, MyNode n3) {
        output1Node(s1, n1);
        output1Node(s2, n2);
        output1Node(s3, n3);
    }


    // This is called an inner class.  It is "inner" because it is inside another class rather than in a separate file.
    // It is a static class because I want to use it in main() and main() is static.
    // It is a private class because we only want it available while in our Main class.
    // Because it's private, we can make all the instance variables public and not use accessors/getters or mutators/setters.
    private static class MyNode {
        public int value;
        public MyNode next;

        public MyNode() {
            value = 10;
            next = null;
        }

        public MyNode(int num) {
            value = num;
            next = null;
        }

        public MyNode(int num, MyNode next) {
            value = num;
            this.next = next;
        }

        public MyNode(MyNode rhs) {
            value = rhs.value;
            this.next = rhs;
        }

        @Override
        public String toString() {
            // Notice that the IDE generates this toString code using StringBuilder, not String. Did you ever wonder why?
            // A string object is immutable so it's expensive to use String concatentation (the plus sign).  With String
            // concatentation, like "s1 = s1 + s2", s1 is not changed, instead it is destroyed and re-created with s1+s2.
            final StringBuilder sb = new StringBuilder("");
            MyNode temp = this;
            while (temp.next != null) {
                sb.append(temp.value).append("-");
                temp = temp.next;
            }
            sb.append(temp.value);
            return sb.toString();  // Do you see why we must convert the StringBuilder to a String before returning?
        }
        public int factorial(int n) {
            if(n == 1) {
                return 1;
            }
            return n * factorial(n -1);
        }
        public int fibonacci(int n) {
            if (n == 0) {
                return 0;
            }
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        public void printName(String word, int n) {
            if(n == 0) {
                System.out.println("");
            }
            printName("Derrick", 3);
        }
        public int length(ArrayList<Integer> list) {
            if (list.size() == 0) {
                return 0;
            }
            return 1 + length(list);
        }
        public int sum(int addend1, int addend2) {
            if (addend2 == 0) {
                return addend1;
            }
            return 1 + sum(addend1, addend2 - 1);
        }
        public int exponent(int num1, int num2) {
            if (num2 == 0) {
                return num1;
            }
            return num1 + exponent(num1, num2 - 1);
        }
        public int countString(String str, char c) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    count++;
                    str = str.substring (0, i) + str.substring (i + 1);
                }
            }
            return count + countString(str, c);

        }
        public ArrayList<Integer> reverse(ArrayList<Integer> ints) {
            if (ints.size() == 0) {
                return ints;
            }
            ints.remove(ints.get(0));
            ints = reverse(ints);
            return ints;
        }

    }
}
