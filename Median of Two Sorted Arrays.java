class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int combinedSize = nums1.length + nums2.length;
        int[] combined = new int[combinedSize];
        for (int i = 0; i < nums1.length; i += 1) {
            combined[i] = nums1[i];
        }
        for (int j = nums1.length; j < combinedSize; j += 1) {
            combined[j] = nums2[j - nums1.length];
        }
        Arrays.sort(combined);
        if (combinedSize % 2 == 0) {
            return ((double) combined[combinedSize / 2] + combined[(combinedSize / 2) - 1]) / 2;
        } else {
            return combined[combinedSize / 2];
        }
    }
}