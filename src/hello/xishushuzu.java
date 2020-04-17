package hello;

public class xishushuzu {
    public static void main(String[] args){
        int ChessArr1[][] = new int[11][11];
        ChessArr1[1][2] = 1;
        ChessArr1[2][3] = 2;
        ChessArr1[4][5] = 2;
        System.out.println("原始的二维数组~~~~~");
        for(int[] row:ChessArr1){
            for (int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //将二维数组转换为稀疏数组
        int sum=0;
        for(int[] row:ChessArr1){
            for (int data:row){
                if(data>0) {
                    sum++;
                }
            }
        }
        int sparesearray[][] = new int[sum+1][3];
        sparesearray[0][0] = 11;
        sparesearray[0][1] = 11;
        sparesearray[0][2] = sum;
        int count = 0;
        for(int i=0;i<11;i++){
           for(int j=0;j<11;j++){
              if(ChessArr1[i][j]!=0){
                count++;
                sparesearray[count][0]=i;
                sparesearray[count][1]=j;
                sparesearray[count][2]=ChessArr1[i][j];
              }
           }
        }
        System.out.println("##########################");
        for(int i=0;i<sparesearray.length;i++){
            System.out.printf("%d\t%d\t%d\t\n",sparesearray[i][0],sparesearray[i][1],sparesearray[i][2]);
        }
    }
}
