import java.io.OptionalDataException;

class BubbleSort{
    public static void main(String[] args) {
        int a[] = {3,1,2,5,10,-6,8,7};
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (a[j+1]>a[j]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int e:a) {
            System.out.println(e+" ");
        }
    }
}