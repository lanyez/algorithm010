### 递归
递归其实也是一种循环，没有好坏之分，递归所说的性能问题，绝大多数都是程序上重复递归的问题  

#####递归代码模板：  
```java
public void recur( int level,int param){
    if(level > max_level){
        return ;
    }
    process(level,param);
    recur(level : level + 1,newParam);
}
```

分治算法是一种处理问题的思想，递归是一种编程技巧，分治是通过递归实现的。

#### 递归可分为三个步骤：  
分解：将原问题分解成多个子问题；  
解决：递归求解子问题  
合并：合并子问题结果  
