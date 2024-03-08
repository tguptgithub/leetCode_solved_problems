class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int n1 = m;
        int n2 = n;
        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                i++;
            } else {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                n1++;
                // Shifting elements to the right starting from the end
                for (int k = n1 - 1; k > i; k--) {
                    nums1[k] = nums1[k - 1];
                }
                nums1[i + 1] = temp;
                i++;
                j++;
             //   n1++; // Increase the size of nums1 after inserting an element from nums2
            }
        }
        // If there are still elements in nums2, copy them to nums1
        while (j < n2) {
            nums1[i++] = nums2[j++];
        }
        
    }
}
