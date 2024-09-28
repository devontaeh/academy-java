package com.bptn.course.hello;

public class SearchInsert {
	public static int searchInsert(int[] nums, int target) {
//		int n = nums.length;
		int l = 0, r = nums.length - 1;
		int m;
		
//		System.out.println("left: " + l + "right: "+ r);
		while(l <= r) {
			m = (l + r) / 2;
//			System.out.println(m);
			if (nums[m] > target) {
				r = m - 1;
			}else if(nums[m] < target) {
				l = m + 1;
			}else {
				return m;
			}
		}
		return l;
	}

	public static void main(String[] args) {
		int nums[] = {1, 3, 5, 7, 9}, target = 9;
		int nums1[] = {1, 3, 5, 6}, target1 = 0;
		int nums2[] = {}, target2 = 4;
		
//		System.out.println("hello");
		System.out.println(searchInsert(nums, target));
		System.out.println(searchInsert(nums1, target1));
		System.out.println(searchInsert(nums2, target2));
	}

}

