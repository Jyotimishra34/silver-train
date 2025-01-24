// Print all the subset of a set of first n natural numbers 

import java.util.*;

public class SubsetOfNaturalNo {
    public static void printSubset(ArrayList<Integer> Subset) {
        for (int i = 0; i < Subset.size(); i++) {
            System.out.println(Subset.get(i) + " ");
        }
        System.out.println();
    }

    // function call
    public static void findSubsets(int n, ArrayList<Integer> Subset) {
        // base case
        if (n == 0) {
            printSubset(Subset);
            return;
        }
        // add to be
        Subset.add(n);
        findSubsets(n - 1, Subset);

        // add not to be
        Subset.remove(Subset.size() - 1);
        findSubsets(n - 1, Subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> Subset = new ArrayList<>();
        findSubsets(n, Subset);
    }

}
