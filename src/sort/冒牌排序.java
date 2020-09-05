package sort;

/**
 * 文件名：冒牌排序.java
 *
 * @author : cfq086
 * @date : 2020/9/5 12:40
 */
public class 冒牌排序 {
    public static void main(String[] args) {
        int[] xu = {7, 9, 8, 3, 5, 4, 1, 2, 6};
        System.out.println("排序前：");
        for (int n : xu) {
            System.out.print(n + "\t");
        }

        bubbleSort(xu);
        System.out.println("\n冒泡排序后：");
        for (int n : xu) {
            System.out.print(n + "\t");
        }

    }
    public static void bubbleSort(int[] xu){
        // 排序开始________升序排序-1.2.3....
        int tmp;
        for (int i = 0; i < xu.length - 1; i++) {   // 外层最大值-1 是因为最后一次循环只有一个数，无需比较
            //内层最大值-1 是因为比较时是当前值对比+1的值
            // -i是因为每次比较最小值不确定，但是最大值都移到了右边所以右边的值无需比较-i
            for (int j = 0; j < xu.length - 1 - i; j++) {
                if (xu[j] > xu[j + 1]) {
                    tmp = xu[j];
                    xu[j] = xu[j + 1];
                    xu[j + 1] = tmp;
                }
            }
        }
    }
}
