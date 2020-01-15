import java.util.Arrays;

public class SimpleSegmentTree {
    private Node[] heap; //an array representing segment tree
    private int[] array; //the original array saved
    private int size; //the number of elements actually filled inside array

    public SimpleSegmentTree(int[] input) {
        //implement me
    }

    /**
     * Recursive helper to build heap
     * @param i     index in heap to build node on
     * @param start start index in array
     * @param end   end index in array
     */
    private void build(int i, int start, int end) {
        //implement me
    }

    /**
     * Update element in array at index k with the new value given within O(log2 N)
     * @param k   index of array to update
     * @param val value to update with
     */
    public void update(int k, int val) {
        //Implement me
    }

    /**
     * Returns sum from index 0 to end in array within O(log2 N)
     * @param end
     * @return sum from index 0 to end in array
     */
    public int sum(int end){
        //Implement me
        return -1; //stub code (to be replaced)
    }


    /**
     * Returns sum from index start to end in array within O(log2 N)
     * @param start
     * @param to
     * @return sum from index start to end in array
     */
    public int sum(int start, int to) {
        return -1; //stub code (to be replaced)
    }

    @Override
    public String toString() {
        return Arrays.toString(heap);
    }

    //Inner class to represent each node in segment tree
    private static class Node {

        //code to be used for toString
//            return data + "(" + start + "," + end + ")";
    }

    private static int[] generateInput(int size) {
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = i + 1;
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = generateInput(6);
        System.out.println(input); //print the original array
        SimpleSegmentTree tree = new SimpleSegmentTree(input);
        System.out.println(tree);
        tree.update(4,15);
        System.out.println(tree);
        tree.update(4,5);
        System.out.println(tree);
    }
}
