import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextDemo4 {


    //统计好三元组
//    public int countGoodTriplets(int[] arr, int a, int b, int c) {
//        int count = 0;
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = i + 1; j < arr.length; j++) {
//                for(int k = j + 1; k < arr.length; k++) {
//                    if(Math.abs(arr[i] - arr[j]) <= a &&
//                            Math.abs(arr[j] - arr[k]) <= b &&
//                            Math.abs(arr[i] - arr[k]) <= c) {
//                        count++;
//                    }
//                }
//            }
//        }
//        return count;
//    }
    
    //至少是其他数字两倍的最大数
//    public int dominantIndex(int[] nums) {
//        int max = 0,index = 0;
//        for(int i  = 0; i < nums.length; i++) {
//            if(nums[i] >= max) {
//                max = nums[i];
//                index = i;
//            }
//        }
//        nums[index] = 0;
//        boolean f = true;
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] * 2 > max) f = false;
//        }
//        if(f) return index;
//        return -1;
//    }


    // 三数之和(暴力解法，超出时间限制)
//   static List<List<Integer>> result = new ArrayList<>();
//    public static List<List<Integer>> threeSum(int[] nums) {
//        if(nums.length < 3) return new ArrayList<>();
//        Arrays.sort(nums);
//        for(int i = 0; i < nums.length - 2; i++) {
//            for(int j = i + 1; j < nums.length - 1; j++) {
//                for(int k = j + 1; k < nums.length; k++) {
//                    List<Integer> list = new ArrayList<>();
//                    if(nums[i] + nums[k] + nums[j] == 0 && !isEquals(new int[]{nums[i],nums[j],nums[k]})) {
//                        list.add(nums[i]);
//                        list.add(nums[j]);
//                        list.add(nums[k]);
//                        result.add(list);
//                    }
//                }
//            }
//        }
//        return result;
//    }
//    public static boolean isEquals(int[] tmp) {
//        boolean flag = false;
//        Arrays.sort(tmp);
//        for(int i = 0; i < result.size(); i++) {
//            boolean f = false;
//            for(int j = 0; j < result.get(i).size(); j++) {
//                if(result.get(i).get(j) == tmp[j]) {
//                    f = true;
//                } else {
//                    f = false;
//                    break;
//                }
//            }
//            if(f) {
//                flag = true;
//                break;
//            }
//
//        }
//        return flag;

    //双指针法
//    List<List<Integer>> result = new ArrayList<>();
//        if(nums.length < 3) return result;
//        Arrays.sort(nums);
//        for(int i = 0; i < nums.length; i++) {
//        if(nums[i] > 0) break;
//        if(i > 0 && nums[i] == nums[i - 1]) continue; //去重
//        int left = i + 1;
//        int right = nums.length - 1;
//        while(left < right) {
//            int sum = nums[i] + nums[left] + nums[right];
//            if(sum == 0) {
//                List<Integer> list = new ArrayList<>();
//                list.add(nums[i]);
//                list.add(nums[left]);
//                list.add(nums[right]);
//                while(left < right && nums[left] == nums[left + 1]) left++;//去重
//                while(left < right && nums[right] == nums[right - 1]) right--;
//                left++;
//                right--;
//                result.add(list);
//            } else if(sum > 0) {
//                right--;
//            } else {
//                left++;
//            }
//        }
//
//    }
//        return result;
//    }

    //四数之和
//    public List<List<Integer>> fourSum(int[] nums, int target) {
//        List<List<Integer>> result = new ArrayList<>();
//        int len = nums.length;
//        if(len < 4) return result;
//        Arrays.sort(nums);
//        for(int i = 0; i < len - 3; i++) {
//            if(i > 0 && nums[i] == nums[i - 1]) continue;
//            for(int j = i + 1; j < len - 2; j++) {
//                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
//                int l = j + 1;
//                int r = len - 1;
//                while(l  < r) {
//                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
//                    if(sum == target) {
//                        List<Integer> list = new ArrayList<>();
//                        list.add(nums[i]);
//                        list.add(nums[j]);
//                        list.add(nums[l]);
//                        list.add(nums[r]);
//                        result.add(list);
//                        while(l < r && nums[l] == nums[l + 1]) l++;
//                        while(l < r && nums[r] == nums[r - 1]) r--;
//                        l++;
//                        r--;
//                    } else if(sum > target) {
//                        r--;
//                    } else {
//                        l++;
//                    }
//                }
//            }
//        }
//        return result;
//    }

    //最接近的三数之和
//    public static int threeSumClosest(int[] nums, int target) {
//        int len = nums.length;
//        int result = nums[0] + nums[1] + nums[2];
//        Arrays.sort(nums);
//        for(int i = 0; i < len; i++) {
//            int l = i + 1;
//            int r = len - 1;
//            while(l < r) {
//                int sum = nums[i] + nums[l] + nums[r];
//                if(Math.abs(target - sum) < Math.abs(target - result)) {
//                    result = sum;
//                }
//                if(sum > target)  {
//                    r--;
//                } else if(sum < target) {
//                    l++;
//                } else {
//                    return result;
//                }
//            }
//        }
//        return result;
//    }

    public static void main(String[] args) {
//        int[] nums = {-1,0,1,2,-1,-4};
//        List<List<Integer>> list = threeSum(nums);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//
//        }

//        int[] nums = {0,2,1,-3};
//        int target = 1;
//        System.out.println(threeSumClosest(nums, target));
//
//        List<Integer> list = new ArrayList<>();
//        list.contains()
    }
}
