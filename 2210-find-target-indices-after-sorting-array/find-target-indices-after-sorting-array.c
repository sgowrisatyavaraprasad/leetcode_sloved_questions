/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* targetIndices(int* nums, int numsSize, int target, int* returnSize) {
    for(int i = 0; i < numsSize-1; i++){
        int min_index = i;
        for(int j = i+1; j < numsSize; j++){
            if(nums[j] < nums[min_index]){
                min_index = j;
            }
        }
        int temp = nums[i];
        nums[i] = nums[min_index];
        nums[min_index] = temp;
    }
    int *index = (int *)malloc(numsSize * sizeof(int));
    int count = 0;
    for(int i = 0; i < numsSize; i++){
        if(nums[i] == target){
            index[count++] = i;
        }
    }
    *returnSize = count;
    return index;
}