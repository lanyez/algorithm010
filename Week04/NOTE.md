学习笔记

深度优先搜索和广度优先搜索 每个节点都要访问一次，且每个节点仅访问一次； 对于节点的访问顺序不限：深度优先（DFS）和广度优先（BFS）

#####深度优先搜索(非递归)
```java
public void depthFirstSearch(TreeNode treeNode){
    if(treeNode == null){
        return;
    }
    Stack<TreeNode> stack = new Stack<>();
    stack.add(treeNode);
    while (!stack.isEmpty()) {
        TreeNode cur = stack.pop();
        // 处理节点信息
        if(cur.right != null){
            stack.add(cur.right);
        }
        if(cur.left != null){
            stack.add(cur.left);
        }
    }
}
```

#####深度优先搜索（递归）
```java
public void depthFirstSearch(TreeNode treeNode){
    if(treeNode == null){
        return;
    }
    // 处理节点信息
    for(TreeNode ch:treeNode.chs){
        depthFirstSearch(ch);
    }
}
```

#####广度优先搜索（非递归）
```java
public void broadFirstSearch(TreeNode treeNode){
    if(treeNode == null){
        return;
    }
    LinkedList<TreeNode> queue = new LinkedList<>();
    queue.add(treeNode);
    while (!queue.isEmpty()) {
        TreeNode cur = queue.removeFirst();
        for(TreeNode ch:cur.chs){
            queue.add(ch);
        }
    }
}
```

###贪心算法：

贪心算法是一种在每一步选择中都采取在当前状态下最好或最优（即最有利）的选择，从而希望导致结果是全局最好或最优的解法。


###二分查找

目标函数单调性（单调递增或单调递减）
存在上下界（bounded）
能够通过索引访问（index accessible）
二分查找是指在有序的情况下进行查找，必须采用顺序存储结构，必须按关键字大小有序排列。如果是无序的话就没法进行二分查找。

