int reverseDegree(char* s) {
    int a = strlen(s),rd,x = 1,sum = 0;
    for(int i = 0; i < strlen(s); i++){
        rd = 26-(s[i] - 'a' + 1) + 1;
        // printf("%d ",rd);
        int res = rd * x;
        sum = sum + res;
        x++;
    }
    return sum;
}