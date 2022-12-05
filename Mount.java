import java.util.Scanner;

public class Mount {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int a = scn.nextInt();
        int [] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = scn.nextInt();
        }
        int n = scn.nextInt();

        int ans = SplitArr(arr, n);
        System.out.println(ans);


    }public static int SplitArr(int [] arr , int k){
        int idx = 0;
        int length = arr.length;
        int [][] mat = new int[length/k][k];

        int count = 0;

        for(int i=0; i<length/k; i++){
            for(int j=0; j<k; j++){
                if(count == length) break;
                mat[i][j] = arr[count];
                count++;
            }
        }

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j] +"-");
            }
            System.out.println();
        }

        int psum =0;
        // int row =0;
        int icount =0;

        for(int i=0; i<k; i++){
            int sum =0;
            for(int j=0; j<length/k;j++){
                sum+=mat[j][i];
            }
            icount++;

            if(psum < sum){
                psum = sum;
                idx = icount;
            }

        }


        System.out.println(psum);
        
        return idx;
    }
}
