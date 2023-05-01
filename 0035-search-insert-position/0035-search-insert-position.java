class Solution {
public int searchInsert(int[] nums, int target) {
int start=0, end=nums.length-1, mid=0;

    if(target>nums[end]){
        return end+1;
    }
    
    if(target<nums[start]){
        return start;
    }
    
    while(start<=end){
        mid = start + (end-start)/2;
        
        if(nums[mid]==target){
            return mid;
        }
        
        if(nums[mid]>target){
            end = mid-1;
        }
        
        if(nums[mid]<target){
            start = mid+1;
        }
    }
    return start;
}
}