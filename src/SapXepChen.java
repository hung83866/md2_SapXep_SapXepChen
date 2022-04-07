public class SapXepChen {
    static int[] list={3,5,1,67,5,2,34,346,41,3,5,724};
    public static void sapXepChen(int[] arr){
        int element , index;
        for (int i = 1; i < list.length; i++) {
            index = i;
            element = list[i];
            while (index>0&&element<list[i-1]){
                arr[index]=arr[index-1];
                index--;
            }
            arr[index]=element;
        }
    }

    public static void main(String[] args) {
        sapXepChen(list);
        for (int e:list) {
            System.out.println(e +"");
        }
    }
}
