#####位运算：
* 将X最右边的n位清零： x & (~0<<n)  
* 获取X的第n位值（0或1）：(x>>n)&1  
* 获取x的第n位幂值：x & (1<<n)  
* 仅将第n位置为1：x|(1<<n)  
* 仅将第n位置为0：x&(~(1<<n))  
* 将x最高位至第n位（含）清零：x&((1<<n)-1)  

#####实战位运算要点：
* 判断奇偶：  
x % 2 == 1    -->    (x&1) == 1  
x % 2 == 0    -->    (x&1) == 0

* x >> 1   -->   x / 2  即: x = x / 2;   -->   x = x >> 1;  
* mid = (left + right) / 2    -->     mid = (left + right) >> 1 
* x = x&(x - 1) 清零最低位置的1  
* x & -x ==> 得到最低位的1  
* x & ~x == 0  

#####布隆过滤器和LRU缓存
* 排序算法
* 初级排序
* 选择排序 （Selection Sort）:每次找最小值，然后放到待排序数组的起始位置

* 插入排序 （Insertion Sort):从前到后逐步构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置插入

* 冒泡排序 （Bubble Sort):嵌套循环，每次查看相邻的元素如果逆序，则交换

* 高级排序-O(NlogN)
* 快速排序 （quick Sort):数组取标杆pivot，将小元素放pivot左边，大元素放右侧，然后依次对右边和右边的子数组继续排序，已达到整个序列有序

* 归并排序（Merge Sort) 分治:  
    * 把长度为你n的输入序列分成两个长度为n/2de子序列
    * 对这两个子序列采用归并排序
    * 将两个排序好的子序列合并成一个最终的排序序列
* 堆排序（Heep Sort) :堆插入OlngN 取最大小值O(1)_  
    * 数组元素依次建立小顶堆
    * 依次去对顶元素，并删除
    * 归并和快排具有相似性，但是步骤顺序相反
* 归并： 先排序左右子数组，然后合并两个有序子数组
* 快排：先调配出左右子数组，然后对于左右子数组进行排序
* 特殊排序
* 计算排序
* 桶排序
* 基数排序