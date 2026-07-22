class Solution {
public:
    vector<int> luckyNumbers(vector<vector<int>>& matrix) {
        vector<int> v;
        for(int i = 0; i < matrix.size(); i++){
            for(int j = 0; j < matrix[0].size(); j++){
                int k = 0;
                int maxi = 0;
                int mini = INT_MAX;
                while(k < matrix.size()){
                    maxi = max(maxi , matrix[k][j]);
                    k += 1;
                }
                for(int l = 0; l < matrix[0].size(); l++){
                    mini = min(mini , matrix[i][l]);
                }
                if(maxi == mini){
                    v.push_back(matrix[i][j]);
                }
            }
        }
        return v;
    }
};