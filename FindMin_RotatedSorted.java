
public class FindMin_RotatedSorted {
    public int minimum_element(int [] nums)
    {
        int left = 0;
        int right = nums.length-1;
        if(nums.length == 0)
        {
            return -1;
        }
        if(nums.length == 1)
        {
            return nums[0];
        }
        while(left < right)
        {
            int middle = left + (right-left)/2;
            if(middle > 0 && nums[middle] < nums[middle-1])
            {
                return nums[middle];
            }
            else if(nums[left] <= nums[middle] && nums[middle] > nums[right])
            {
                left = middle+1;
            }
            else
            {
                right = middle-1;
            }
        }
        return nums[left];
    }
    public static void main(String[] args)
    {
        FindMin_RotatedSorted obj = new FindMin_RotatedSorted();
        int [] nums = {4,5,6,7,0,1,2,3,4};
        System.out.print("minimum element of array is:"+obj.minimum_element(nums));
    }
}
