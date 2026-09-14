class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int count =0;
        while(count<4){
        boolean found = true;
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(mat[i][j]!= target[i][j]){
                    found=false;
                    break;
                }
                
            }
        }
            

            if (found) {
                return true;
            }

        for (int i =0;i<n;i++){
            for(int j =0;j<i;j++){
                int temp = mat[i][j];
                mat[i][j]= mat[j][i];
                mat[j][i]= temp;
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<n/2;j++){
                int temp = mat[i][j];
                mat[i][j]= mat[i][n-1-j];
                mat[i][n-1-j]= temp;
            }
        }
      

        count++;
        }
        return false;
    }
}