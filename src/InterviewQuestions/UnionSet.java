package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class UnionSet {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int [] nums1 = {1,1,1,1,1,1,2,2,2,3,3};
        int [] nums2 = {2,2,4};
        unionArray(nums1,nums2);
    }

    public static void unionArray(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[i])
                    list.add(nums1[i]);
                i++;
            }else if(nums2[j]<nums1[i]){
                if (list.isEmpty() || list.get(list.size() - 1) != nums2[j])
                    list.add(nums2[j]);
                j++;
            }else if(nums1[i]==nums2[j]){
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[i])
                    list.add(nums1[i]);
                i++;
                j++;
            }
        }

        while(j<nums2.length){
            if (list.isEmpty() || list.get(list.size() - 1) != nums2[j])
                list.add(nums2[j]);
            j++;
        }
        while(i<nums1.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != nums1[i])
                list.add(nums1[i]);
            i++;

        }
        System.out.println(list);
    }
}
