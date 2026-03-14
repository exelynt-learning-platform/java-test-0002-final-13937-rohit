class Main {
    public static void main(String[] args) {
int i,j,n=5,k;
for(i=0;i<5;i++){
    k=1;
    for(j=1;j<=9;j++){
        if(j>=n-i&&j<=n+i){
            System.out.print(k);
             k=(j<5)?k+1:k-1;
        }else{
            System.out.print(" ");
        }
    }
    System.out.println();
}
    }
}
