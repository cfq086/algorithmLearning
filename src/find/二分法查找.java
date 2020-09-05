package find;

import sort.快速排序;

/**
 * 文件名：二分法查找.java
 *
 * @author : cfq086
 * @date : 2020/9/5 14:20
 */
public class 二分法查找 {
    /**
     * 要求：必须是有序序列。类似1.2.3.....或7.6.4....
     */

    public static void main(String[] args) {
        int[] xu = {2, 9, 8, 3, 5, 4, 6, 7, 1};
        // 无序的数列 先排序。
        快速排序.quickSort(xu, 0, xu.length - 1);
        System.out.println("\n快速排序后：");
        for (int i : xu) {
            System.out.print(i + "\t");
        }

        // 二分法查找
        int findval = halveFind(xu, 4);
        System.out.println("\n"+findval);

    }

    public static int halveFind(int[] xu, int f) {
        int start = 0;
        int end = xu.length - 1;

        while (start <= end) {
            int mid = (end + start) / 2;
            if (f > xu[mid]) {
                start = mid + 1;
            } else if (f < xu[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }


}


