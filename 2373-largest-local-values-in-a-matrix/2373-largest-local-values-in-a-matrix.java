class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] arr = new int[grid.length - 2][grid.length - 2];
        int[] arr1 = new int[(grid.length - 2) *(grid.length - 2)];
        int a = 0 , b = 0 , c = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if((i + 2) < grid.length && (j + 2) < grid[i].length){
                    int maxi = 0;
                    for(int l = i; l <= i + 2; l++){
                        int maxi1 = 0;
                        for(int m = j; m <= j + 2; m++){
                            if(grid[l][m] >= maxi1){
                                maxi1 = grid[l][m];
                            }
                        }
                        if(maxi1 >= maxi){
                            maxi = maxi1;
                        }
                    }
                    arr1[c++] = maxi;
                }
            }
        }
        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
            if(b >= arr.length){
                a += 1;
                b = 0;
            }
            arr[a][b] = arr1[i];
            b += 1;
            // if(b < arr.length){
            //     arr[a][b] = arr1[i];
            //     b += 1;
            // }
            // else{
            //     a += 1;
            //     b = 0;
            //     if(b < arr.length){
            //         arr[a][b] = arr1[i];
            //     }
            // }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }
}