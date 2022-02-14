public class A3Darray {
    public static void main(String args[]) {
        int my3DArray [] [] [] = new int [5][5][5];
        int i,j,k;
        for(i=0;i<5;i++)
            for(j=0;j<5;j++)
                for(k=0;k<5;k++)//0 0 0   0 0 1 0 0 2 0 0 3 00 4  
                                // 0 1 0   0 1 1 0 1 2 0 1 3 0 1 4
                                //
                    my3DArray[i][j][k]=i+j*k;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                for(k=0;k<5;k++)
                    System.out.print(my3DArray[i][j][k] + " ");
                    System.out.println();
            }
                    System.out.println();
        }
    }
}
