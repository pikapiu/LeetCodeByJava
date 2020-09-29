# 移除元素

![](https://pkq-blog-img.oss-cn-hangzhou.aliyuncs.com/wallhaven-vgrx6m_1920x1080.png)

给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。

不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。

元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

 

示例 1:

> 给定 nums = [3,2,2,3], val = 3,
>
> 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
>
> 你不需要考虑数组中超出新长度后面的元素。

示例 2:

> 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
>
> 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
>
> 注意这五个元素可为任意顺序。
>
> 你不需要考虑数组中超出新长度后面的元素。


说明:

为什么返回数值是整数，但输出的答案是数组呢?

请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。

你可以想象内部操作如下:

> // nums 是以“引用”方式传递的。也就是说，不对实参作任何拷贝
> int len = removeElement(nums, val);
>
> // 在函数里修改输入数组对于调用者是可见的。
> // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
> for (int i = 0; i < len; i++) {
>     print(nums[i]);
> }







解法1：

```java
class Solution {
    public int removeElement(int[] nums, int val) {
      int i = 0;
        for(int j = 0; j < nums.length; j++){
           if(nums[j] != val){
               nums[i] = nums[j];
               i++;
           }
        }
        return i;
    }
}
```

两个指针，i 是慢指针，j 是快指针，遍历一遍数组，过程中快指针遇到的值如果和指定的 val 不相等，那么将其赋值给慢指针 i 。相等时则跳过，最后返回 i 指针，则相当于只保留了不与指定值相等的数组值。返回 i 的长度即可。



解法2：

```java
class Solution {
    public int removeElement(int[] nums, int val) {
     int end = nums.length;
     int i = 0;
        while(i < end){
            if(nums[i] == val){
                nums[i] = nums[end-1];
                end--;
            }else{
                i++;
            }
        }
        return end;
    }
}
```

这个解法比解法1更精妙，如果不是题目说顺序可变的话，就用不了了，直接遍历数组，过程中如果遇到某值和指定值相等，那么将数组末尾的值覆盖掉当前值。

然后数组长度--，否则，i ++，开始下一位的校验。

值得注意的是，如果数组末尾的值，正是想要移除的值呢？

这里的下标 i 并没有增加，所以当前 i 指向的值仍然会参加下一次校验。



实在是太妙了。



![miao](https://pkq-blog-img.oss-cn-hangzhou.aliyuncs.com/miao.jpg)



来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-element