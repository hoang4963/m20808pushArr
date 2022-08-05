import java.util.Scanner;
public class pushArr {
    public static void main(String[] args) {
        int arr[] ={0,3,4,5,6,7,8};
        int index;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("nhap vi tri muon chen");
        index = scanner1.nextInt();
        if (check(index, arr.length)){
            int[] arr1 = push(arr,index);
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i]+ " ");
            }
        }
        else System.out.println("Vi tri ngoai mang");
    }
    public static boolean check(int index, int length){
        boolean check = true;
        if (index< 0 || index > length){
            check = false;
        }
        return check;
    }
    public static int[] push(int[] arr, int index){
        int value;
        int temp = arr[index];
        int[] arr1= new int[arr.length + 1];
        System.out.println("nhap so muon chen");
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (i < index){
                arr1[i]= arr[i];
            }
            else if (i > index){
                arr1[i+1] = arr[i];
            }
            arr1[index] = value;
            arr1[index+ 1] = temp;
        }
        return arr1;
    }
}
