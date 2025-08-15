package Arrays1D;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class UnionTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] result = unionArray(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] unionArray(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0;
        int j = 0;

        Arrays.sort(nums1); // Sorting both arrays before applying two-pointer logic
        Arrays.sort(nums2);

        ArrayList<Integer> union = new ArrayList<>();

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }
                i++;
            } else if (nums1[i] > nums2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != nums2[j]) {
                    union.add(nums2[j]);
                }
                j++;
            } else {
                // nums1[i] == nums2[j]
                if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < m) {
            if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
                union.add(nums1[i]);
            }
            i++;
        }

        while (j < n) {
            if (union.isEmpty() || union.get(union.size() - 1) != nums2[j]) {
                union.add(nums2[j]);
            }
            j++;
        }

        int[] arr = new int[union.size()];
        for (int k = 0; k < union.size(); k++) {
            arr[k] = union.get(k);
        }
        return arr;
    }
}
