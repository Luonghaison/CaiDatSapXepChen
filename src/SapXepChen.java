import java.util.Arrays;

public class SapXepChen {
    public static void main(String[] args) {
        int[] list = {1, 3, 45, 4, 7, 8, 95, 3, 1};
        selectSort(list);
        System.out.println("sắp xếp chọn");
        System.out.println(Arrays.toString(list));
        SapXepChen(list);
        System.out.println("sắp xếp chèn");
        System.out.println(Arrays.toString(list));
    }
    public static void SapXepChen(int[] list){
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j;
            for (j = i -1; j >= 0 && list[j] > temp ; j--) {
                list[j+1] = list[j];
            }
            list[j+1] = temp;
        }
    }


    public static void selectSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }
}