## [Two Num](https://leetcode-cn.com/problems/two-sum/solution/)


## Description
**Given an array of integers, return indices of the two numbers such that they add up to a 
specific target.You may assume that each input would have exactly one
 solution, and you may not use the same element twice.**

## Example:
```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```
Tags: Array, Hash Table


## 描述
**给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那
 两个 整数，并返回他们的数组下标。你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。**

## 示例:

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]




### 方法一

**思路：**
遍历数组，将值与下标挨个存放在HashMap中，map的key为该数字的值，value为该数字在数组中的下标，这样一来遇到符合条件的，直接通过map的get(key)
就能拿到下标了，关键点在于这个差值，差值的来由是因为需要求两数之和。那么遍历数组的时候，假使有一个数,设为x，x+当前数，即等于target;x就可以等于
target(目标值) - `nums[i]`(当前值)；如果map里的key已经有这个x了,说明找到了，返回两个下标即可。



```java
   // 利用HashMap
    public  int[] getTargetIndex(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("have no results");
    }

```

---

### 方法二
**思路：**
两遍for循环，挨个比较，找出符合条件的数
```java
    public int[] getTargetIndexByTraverse(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("have no results");
    }
```
