class Main {
    public static void main(String[] args) {

        int i,j,n=5,k;

        for(i=0;i<5;i++){
            k=1;

            for(j=1;j<=9;j++){

                if(j>=n-i && j<=n+i){
                    System.out.print(k);

                    if(j<n){
                        k++;
                    }else{
                        k--;
                    }

                }else{
                    System.out.print(" ");
                }

            }

            System.out.println();
        }

    }
}
