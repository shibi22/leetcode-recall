class Solution {
    private double merge(int length ,int[] nums1 ,int[] nums2 ){
        int[] result = new int[length];
        int n = result.length;
        int left = 0 , right = 0, index = 0 , mid = 0;
        while(left < nums1.length && right < nums2.length){
            if(nums1[left] < nums2[right]){
                result[index] = nums1[left];
                left++;
                index++;
            }

            else{
                 result[index] = nums2[right];
                 right++;
                 index++;
            }
        }

         while(left < nums1.length){
            result[index] = nums1[left];
                left++;
                index++;
         }

         while(right < nums2.length){
            result[index] = nums2[right];
                right++;
                index++;
         }
         mid = 0 + ((n - 1) + 0) / 2;
         if(n % 2 != 0 ){

            return result[mid];
        }


        return ( result[mid] + result[mid+1] ) / 2.0;

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        
        
        return merge(length , nums1 , nums2 );
    }
}