public class Main {
    public static void main(String[] args) {
        int[] A = new int[]{9, 10, 0 ,2, 87, 1000};

        for(int i = 0 ; i <= A.length - 2 ; i++){
            for(int j = A.length - 1 ; j >= i + 1 ; j--){
                if(A[j] < A[j - 1]) {
                    int w = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = w;
                }
            }
        }

        // ソートできたかを確認
        for(int i = 0 ; i <= A.length - 1; i++){
            System.out.println(A[i]);
        }
    }
}