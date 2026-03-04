class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for(int i = 0; i < mat.length; i++){
		    for(int j = 0; j < mat[0].length; j++){
			    if(mat[i][j] == 1){
				    int a = 0 , b = 0;
				    int rc = 0 , cc = 0;
				    while(a < mat[0].length){
					    if(a == j){
						    a += 1;
						    continue;
					    }
					    else if(mat[i][a] == 1){
						    rc += 1;
					    }
					    a++;
				    }
				    while(b < mat.length){
					    if(b == i){
						    b += 1;
						    continue;
					    }
					    else if(mat[b][j] == 1){
						    cc += 1;
						
					    }
					    b++;
				    }
				    if(rc == 0 && cc == 0){
					    count += 1;
				    }
			    }
		    }
	    }
        System.out.println(count);
        return count;
    }
}