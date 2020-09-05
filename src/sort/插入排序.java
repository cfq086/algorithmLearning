package sort;

/**
 * 文件名：插入排序.java
 *
 * @author : cfq086
 * @date : 2020/9/5 14:19
 */
public class 插入排序 {

    public static void main(String[] args) {
        int[] xu = {2, 9, 8, 3, 5, 4, 6, 7, 1};

        System.out.println("排序前：");
        for (int i : xu) {
            System.out.print(i + "\t");
        }

        insertSort(xu);

        System.out.println("\n插入排序后：");
        for (int i : xu) {
            System.out.print(i + "\t");
        }
    }


    public static void insertSort(int[] xu) {
        for (int i = 1; i < xu.length; i++) {
            int cur;
            int j;
            cur = xu[i];    //待排序元素
            for (j = i - 1; j >= 0 && xu[j] > cur; j--) {
                xu[j + 1] = xu[j];
            }
            xu[j + 1] = cur;
        }
    }

}
