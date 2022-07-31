<p>给定一个大小为 <code>n</code><em> </em>的数组&nbsp;<code>nums</code> ，返回其中的多数元素。多数元素是指在数组中出现次数 <strong>大于</strong>&nbsp;<code>⌊ n/2 ⌋</code>&nbsp;的元素。</p>

<p>你可以假设数组是非空的，并且给定的数组总是存在多数元素。</p>

<p>&nbsp;</p>

<p><strong>示例&nbsp;1：</strong></p>

<pre>
<strong>输入：</strong>nums = [3,2,3]
<strong>输出：</strong>3</pre>

<p><strong>示例&nbsp;2：</strong></p>

<pre>
<strong>输入：</strong>nums = [2,2,1,1,1,2,2]
<strong>输出：</strong>2
</pre>

<p>&nbsp;</p>
<strong>提示：</strong>

<ul>
	<li><code>n == nums.length</code></li>
	<li><code>1 &lt;= n &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
</ul>

<p>&nbsp;</p>

<p><strong>进阶：</strong>尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。</p>
<details><summary><strong>Related Topics</strong></summary>数组 | 哈希表 | 分治 | 计数 | 排序</details><br>

<div>👍 1513, 👎 0</div>

<div id="labuladong"><hr>

**通知：[数据结构精品课 V1.7](https://aep.h5.xeknow.com/s/1XJHEO) 持续更新中；[第九期打卡挑战](https://aep.h5.xeknow.com/s/3SlWbp) 即将开始；B 站可查看 [核心算法框架系列视频](https://space.bilibili.com/14089380/channel/series)。**

<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

这道题的标准解法肯定是用一个哈希表作为计数器记录每个元素出现的次数，然后寻找出现次数最多的那个元素，时间和空间复杂度都是 `O(N)`。

但是由于题目说了这个目标元素（众数）出现的次数**过半**，这就有意思了，其实我们不需要用哈希表来做计数器就能把这个众数找出来。

你想象一下，比方说一群带正电的粒子和一群带负电的粒子，把它们混合起来，得到的这群混合粒子的带电性质是什么？这取决于正电离子多还是负电离子多，如果正负粒子数量恰好相等，则呈电中性。

回到这道题，题目告诉你一定存在一个众数，它出现的次数过半，那么如果你把这个众数元素想象成正电粒子，其他的所有元素都想象成负电粒子，那么它们混合起来会怎样？

**在正负粒子混合的过程中，整体的带电性可能在正负间波动，但最终的结果一定是正电**。

有了这个类比，你看下解法代码，我们是如何用 `O(1)` 的空间复杂度来计算众数的。

**标签：哈希表，[数组](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2120601117519675393)**

## 解法代码

```java
class Solution {
    public int majorityElement(int[] nums) {
        // 我们想寻找的那个众数
        int target = 0;
        // 计数器（类比带电粒子例子中的带电性）
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                // 当计数器为 0 时，假设 nums[i] 就是众数
                target = nums[i];
                // 众数出现了一次
                count = 1;
            } else if (nums[i] == target) {
                // 如果遇到的是目标众数，计数器累加
                count++;
            } else {
                // 如果遇到的不是目标众数，计数器递减
                count--;
            }
        }
        // 回想带电粒子的例子
        // 此时的 count 必然大于 0，此时的 target 必然就是目标众数
        return target;
    }
}
```

**类似题目**：
  - [剑指 Offer 39. 数组中出现次数超过一半的数字 🟢](/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof)

</details>
</div>



