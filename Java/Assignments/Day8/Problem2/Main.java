package Java.Assignments.Day8.Problem2;

public class Main{
    boolean isPrime(int num) {
        if (num == 0|num==1) {
            return false;
        }

        for (int i = 2; i <= (int) Math.pow(num, .5) ; i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] findAndReturnPrimeNumbers(int[] inputArray){
        int[] primeArray = new int[3];
        int index=0;

        for(int i=0;i<inputArray.length &&index<4;i++ ){
            if(isPrime(inputArray[i])){
                primeArray[index]=inputArray[i];
                index++;
            }
        }
        return primeArray;
    }

    public static void main(String[] args){

        int[] arr = {10,1,12,5,50,11,14,15};
        Main obj=new Main();
        int[] Array=obj.findAndReturnPrimeNumbers(arr);
        for(var j=0;j<Array.length;j++){
            System.out.println(Array[j]);
        }

    }
}
