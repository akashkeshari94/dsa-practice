public class NumberOfFactors {
    public static void main(String[] args) {
        int inputNumber = 100;
        int numberOfFactors = findNumberOfFactors(inputNumber);
        System.out.println("The number of factors of "+inputNumber+" is "+numberOfFactors);
    }
/*
    private static int findNumberOfFactors(int n){
        int count = 0;
        for(int i = 1; i <=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        return count;
    }

 */

    //Optimized code

    private static int findNumberOfFactors(int n){
        int count = 0;
        for(int i = 1; i * i <=n; i++){
            if(n % i == 0){
                //count += 2; // this is an issue in case of number is a perfect square
                if(i == n / i){
                    count++;
                }else {
                    count += 2;
                }
            }
        }
        return count;
    }
}