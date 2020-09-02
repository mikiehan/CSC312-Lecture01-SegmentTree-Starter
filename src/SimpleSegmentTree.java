import java.util.Arrays;

public class SimpleSegmentTree {
    private Node[] heap; //an array representing segment tree
    private int[] array; //the original array saved
    private int size; //the capacity of heap
    private int[] indexMap; // this maps given original index of array to heap index (helps to grab leaf node quickly from heap)

    public SimpleSegmentTree(int[] input) {
        //implement me
        this.array = Arrays.copyOf(input, input.length);
        this.size = (int) (2 * Math.pow(2.0, Math.floor(Math.log((double) input.length)/Math.log(2.0) +1 )));
        this.heap = new Node[size]; //instantiating heap
        this.indexMap = new int[array.length];
        build(0, 0, array.length - 1); //master
    }

    /**
     * Recursive helper to build heap
     * @param i     index in heap to build node on
     * @param start start index in array
     * @param end   end index in array
     */
    private void build(int i, int start, int end) {
        //implement me
        if (start == end) { //base case (leaf node)
            heap[i] = new Node(array[start],start, end);
            indexMap[start] = i; // saving the heap index value
        } else { //branch node case
            //divide into 2
            int mid = (start + end) /2 ;
            //build left sub-tree (0 - mid)
            build(i * 2 + 1 , start, mid);
            //build right sub-tree (mid + 1 , end)
            build( i * 2 + 2, mid + 1 , end);
            heap[i] = new Node(heap[i*2 + 1].data + heap[i*2 + 2].data, start, end);
        }
    }

    /**
     * Update element in array at index k with the new value given within O(log2 N)
     * @param k   index of array to update
     * @param val value to update with
     */
    public void update(int k, int val) {  //recursion (need to have a helper method)
        //Implement me
    }

    /**
     * Returns sum from index 0 to end in array within O(log2 N)
     * @param end
     * @return sum from index 0 to end in array
     */
    public int sum(int end){
        return sum(0, end); //stub code (to be replaced)
    }


    /**
     * Returns sum from index start to end in array within O(log2 N)
     * @param start
     * @param to
     * @return sum from index start to end in array
     */
    public int sum(int start, int to) { //recursion (need to have a helper method)
        return -1; //stub code (to be replaced)
    }


    @Override
    public String toString() {
        return Arrays.toString(heap);
    }

    //Inner class to represent each node in segment tree
    private static class Node {
        public int data; // stores a partial sum from start to end
        public int start;
        public int end;

        public Node(int data, int start, int end) {
            this.data = data;
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "partial sum =" + data +
                    ", from start=" + start +
                    ", to end=" + end +
                    '}';
        }
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
