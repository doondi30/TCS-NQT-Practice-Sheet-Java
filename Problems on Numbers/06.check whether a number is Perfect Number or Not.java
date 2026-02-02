class Main {
    public static void main(String[] args){
        int n=28;
        int ans=1;
      
         if (n <= 1) {
            System.out.print(false);
            return;
        }
      
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                ans+=i;
            }
        }
        System.out.print(n==ans);
    }
}



// for(int i = 2; i * i <= n; i++){
//             if(n % i == 0){
//                 ans += i;
//                 if(i != n / i){
//                     ans += n / i;
//                 }
//             }
//         }
