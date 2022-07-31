 dummy you're so why are you saving up wait is it listening what's happening what the fuck is happening hello what is happening stop stop listeningpublic class BinarySearch {
	public int search(int[] nums, int target) {
        // create pivot to test == to target
        int pivot;
        
        // create two pointers to move 
        int left = 0;
        
        // why does nums.lenght - 1 have to be used
        int right = nums.length-1;
        while(left <= right){
            
            // starting index nums[pivot] testing point
            pivot = (left+right)/2;
            
            // if after the division pivot == target
            if(nums[pivot] == target) return pivot;
            
            // if target is less than pivot we move the right pointer
            if(target < nums[pivot]) right = pivot -1;
                
            // if the target is greater than the pivot we move the left pointer
            else left = pivot + 1;
        }
        // else there is no solution 
        return -1;
        
        
    }
}
