package sort;

/**
 * 文件名：选择排序.java
 *
 * @author : cfq086
 * @date : 2020/9/5 13:54
 */
public class 选择排序 {
    public static void main(String[] args) {
        int[] xu = {7, 9, 8, 3, 5, 4, 1, 2, 6};
        System.out.println("排序前：");
        for (int n : xu) {
            System.out.print(n + "  ");
        }
        insertSort(xu);
        System.out.println("\n选择排序后：");
        for (int n : xu) {
            System.out.print(n + "  ");
        }
    }


    /**
     * 选择排序算法
     *
     * @param xu 需要排序的数组
     */
    public static void insertSort(int[] xu) {
        // 排序开始
        for (int i = 0; i < xu.length - 1; i++) {

            int min = i;        // 默认取循环第一个值位最小的
            for (int j = min + 1; j < xu.length; j++) {
                if (xu[j] < xu[min]) {
                    // 如果当前值比默认的最小值小，则把索引改成这个值的位置
                    min = j;
                }
            }

            // 找出最小的值位置索引了。然后交换位置。
            if (i != min) {
                int tmp = xu[i];
                xu[i] = xu[min];
                xu[min] = tmp;
            }
        }

    }
}
