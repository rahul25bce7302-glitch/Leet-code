import java.util.*;
class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int p = m+n-1;
        while(p1>=0&&p2>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[p] = nums1[p1];
                p1--; 
            }
            else{
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;

        } 
        while(p2>=0){
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int nums1[] = new int[m+n];
        for(int i =0;i<m;i++){
            nums1[i] = sc.nextInt();

        }
       
        int nums2[] = new int[n];
        for(int i =0;i<n;i++){
            nums2[i] = sc.nextInt();

        }
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
        sc.close();
    }
}