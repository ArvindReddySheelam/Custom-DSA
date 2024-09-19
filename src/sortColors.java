public class sortColors {
        public static void swap(int[]nums, int ele1,int ele2){
            int temp = nums[ele1];
            nums[ele1] = nums[ele2];
            nums[ele2] = temp;
        }
        public static void sort012(int[] nums) {
            int low = 0;
            int mid = 0;
            int high = nums.length-1;

            if(nums.length == 1 || nums.length == 0){
                return;
            }

            while(mid <= high){
                if(nums[mid] == 0){
                    swap(nums,low,mid);
                    low++;
                    mid++;
                }
                else if(nums[mid] == 1){
                    mid++;
                }
                else {
                    swap(nums,mid,high);
                    high--;
                }
            }
            for(int i = 0; i<=nums.length-1; i++){
                System.out.print(nums[i] + " ");
            }
        }
        public static void main(String[] args){
            int[] nums = {2,0,2,1,1,0};
            sort012(nums);
        }
    }
