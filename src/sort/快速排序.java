package sort;

/**
 * 文件名：快速排序.java
 *
 * @author : cfq086
 * @date : 2020/9/5 14:19
 */
public class 快速排序 {
    public static void main(String[] args) {
        int[] xu = {2, 99, 8, 3, 5, 4, 6, 7, 1};
        System.out.println("排序前：");
        for (int i : xu) {
            System.out.print(i + "\t");
        }
        quickSort(xu, 0, xu.length - 1);
        System.out.println("\n快速排序后：");
        for (int i : xu) {
            System.out.print(i + "\t");
        }
    }


    /**
     * 快速排序方法————————时间复杂度 O(nlogn)
     *
     * @param xu         需要排序的序列
     * @param leftIndex  排序的起始索引
     * @param rightIndex 排序的截至索引
     */
    public static void quickSort(int[] xu, int leftIndex, int rightIndex) {
        // 递归的跳出，循环判断 如果判断范围的起始点=终点，则返回
        if (leftIndex >= rightIndex) {
            return;
        }

        // 左右浮标
        int left = leftIndex;
        int right = rightIndex;

        // 默认循环的第一个值为基准值
        int key = xu[leftIndex];

        // 外层循环 只有当左浮标《 右浮标 执行
        while (left < right) {
            // 右往左 循环。找出比 基准值 小的值。把他替换到左浮标处。而左浮标的原始值 赋值给了 基准
            while (right > left && xu[right] >= key) {
                //  从右往左扫描，找到第一个比基准值小的元素
                right--;
            }

            // 左往右 循环。 找除比基准值 大的值。把他替换到右浮标处，注意 这里的右浮标 ！= rightIndex。
            while (left < right && xu[left] <= key) {
                //从左往右扫描，找到第一个比基准值大的元素
                left++;
            }
            // 交换位置：
            int tmp = xu[left];
            xu[left] = xu[right];
            xu[right] = tmp;
        }
        // 跳出循环后， 左浮标=右浮标
        // 基准和左右浮标处交换
        int tmp = xu[left];
        xu[left] = key;
        xu[leftIndex] = tmp;

        // 进局部循环迭代。分治       左右跳过中间值
        //对基准值左边的元素进行递归排序       0----左浮标-1.左右浮标重叠区 无需改动
        quickSort(xu, leftIndex, left - 1);

        //对基准值右边的元素进行递归排序。      右浮标+1----rightindex
        quickSort(xu, right + 1, rightIndex);
    }

    /**
     * 快速排序方法————————时间复杂度 O(nlogn)
     * 另一种交换。。
     *
     * @param xu         需要排序的序列
     * @param leftIndex  排序的起始索引
     * @param rightIndex 排序的截至索引
     */
    public static void quick2Sort(int[] xu, int leftIndex, int rightIndex) {
        // 递归的跳出，循环判断 如果判断范围的起始点=终点，则返回
        if (leftIndex >= rightIndex) {
            return;
        }

        // 左右浮标
        int left = leftIndex;
        int right = rightIndex;

        // 默认循环的第一个值为基准值
        int key = xu[leftIndex];

        // 外层循环 只有当左浮标《 右浮标 执行
        while (left < right) {
            // 右往左 循环。找出比 基准值 小的值。把他替换到左浮标处。而左浮标的原始值 赋值给了 基准
            while (right > left && xu[right] >= key) {
                //  从右往左扫描，找到第一个比基准值小的元素
                right--;
            }
            // 直接把右浮标比基准小的值 放到左浮标处
            xu[left] = xu[right];

            // 左往右 循环。 找除比基准值 大的值。把他替换到右浮标处，注意 这里的右浮标 ！= rightIndex。
            while (left < right && xu[left] <= key) {
                //从左往右扫描，找到第一个比基准值大的元素
                left++;
            }
            // 把左浮标比基准大的值，放到右浮标处
            xu[right] = xu[left];
        }

        // 跳出循环后， 左浮标=右浮标
        // 基准的值 赋给左右浮标都一样。他俩重叠
        xu[left] = key;

        // 进局部循环迭代。分治       左右跳过中间值
        //对基准值左边的元素进行递归排序       0----左浮标-1.左右浮标重叠区 无需改动
        quickSort(xu, leftIndex, left - 1);

        //对基准值右边的元素进行递归排序。      右浮标+1----rightindex
        quickSort(xu, right + 1, rightIndex);
    }

}

