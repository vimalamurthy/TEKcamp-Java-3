package lambda_streams;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Numbers {
    static List<Integer> nums = Arrays.asList(10,100,1000,5,50,500,3,30,300,7,70,700,1,10,100,25,250,2500);

    public static void main(String[] args) {
        System.out.println(nums);

        boolean odd = isOdd(6);
        System.out.println("The number is odd : " + odd);

        lambdacalculatedVal val = (int i) -> {
            if ((nums.get(i)) % 2 != 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println("Odd from Lambda is : " + val.calculate(6));

        boolean even = isEven(6);
        System.out.println("The number is even: " + even);

        lambdacalculatedVal val1 = (int i) -> {
            if ((nums.get(i)) % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println("Check Even from Lambda is : " + val1.calculate(6));

        boolean prime = isPrime(3);
        System.out.println("The number is prime : " + prime);

        lambdacalculatedVal val2 = (int i) -> {
            if (nums.get(i) % i == 0) {
                return false;
            }
            return true;
        };
        System.out.println("Check Prime from Lambda is : " + val2.calculate(6));

        int added = added();
        System.out.println("The sum is : " +added);

        returnIntVal addVal = ()->{int sum =0;
            for (Integer number : nums) {
                sum += number;
            }
            return sum;
        };
        System.out.println("Added values (Lambda) : " + addVal.calc());

        int substracted = subtracted();
        System.out.println("The substracted value is : " +substracted);

        returnIntVal subVal = ()->{ int sum =nums.get(0);
            for (Integer number : nums) {
                sum -= number;
            }
            return sum + nums.get(0);
        };
        System.out.println("Subtracted values (Lambda) : " + subVal.calc());

        BigInteger multiplied = multiplied();
        System.out.println("The multiplied value is : " +multiplied);

        mulVal value = ()->{
        BigInteger sum = new BigInteger("1");
        for (Integer number : nums) {
            sum = sum.multiply(BigInteger.valueOf(number));
        }
        return sum;
        };
        System.out.println("The multiplied value - Lambda : " +value.multiply());

        double divided = divided();
        System.out.println("The divided value is : " + divided);

        divVal value1 = ()->{ double sum = nums.get(0);
            for (double number : nums){
                sum = sum/number;
            }
            return sum;
        };
        System.out.println("Division - Lambda " +value1.divide());

        int max = findMax();
        System.out.println("Maximum Number is : " +max);

        returnIntVal maxVal = ()-> {Integer sum = Collections.max(nums);
            return sum;
        };
        System.out.println("Maximum number - Lambda " +maxVal.calc());

        int min = findMin();
        System.out.println("Minimum Number is : "+min);

        returnIntVal minVal = ()-> {Integer sum = Collections.min(nums);
            return sum;
        };
        System.out.println("Minimum number - Lambda " +minVal.calc());

        int comp = compare(2,3);
        System.out.println("Compare values : " +comp);

        compVal num = (i,j) ->{
            if (nums.get(i)>nums.get(j)){
                return 1;
            } else {
                return -1;
            }
        };
        System.out.println("Compare Lambda " +num.compare(2,3));

        int appNum = append(28);
        System.out.println("The appended Number is : " +appNum);

        lambdaAppend appNum1 = (int i)->{
            List<Integer> newNums = new ArrayList<Integer>(nums);
            newNums.add(i);
            return newNums.get(newNums.size()-1);
        };
        System.out.println("Append - Lambda " +appNum1.lAppend(28));
    }

    static boolean isOdd(int i) {
        System.out.println("Number is : " +nums.get(i));
        if ((nums.get(i))%2 != 0) {
            return true;
        }
        return false;
    }

    static boolean isEven(int i) {
        System.out.println("Number is : " +nums.get(i));
        if ((nums.get(i))%2 == 0) {
            return true;
        }
        return false;
    }

    static boolean isPrime(int i) {
        System.out.println("Number is : " +nums.get(i));
            if (nums.get(i) % i == 0) {
                return false;
            }
        return true;
    }

    static int added() {
        int sum =0;
        for (Integer number : nums) {
            sum += number;
        }
        return sum;
    }

    static int subtracted() {
        int sum =nums.get(0);
        for (Integer number : nums) {
            sum -= number;
        }
        return sum + nums.get(0);
    }

    static BigInteger multiplied() {
        BigInteger sum = new BigInteger("1");
        for (Integer number : nums) {
            sum = sum.multiply(BigInteger.valueOf(number));
        }
        return sum;
    }

    static double divided() {
        double sum = nums.get(0);
        for (double number : nums){
            sum = sum/number;
        }
       return sum;
    }

    static int findMax() {
        Integer sum = Collections.max(nums);
        return sum;
    }

    static int findMin() {
        Integer sum = Collections.min(nums);
        return sum;
    }

    static int compare(int i, int j) {
        if (nums.get(i)>nums.get(j)){
            return 1;
        } else {
            return -1;
        }
    }

    static int append(int n) {
        List<Integer> newNums = new ArrayList<Integer>(nums);
        newNums.add(n);
        return newNums.get(newNums.size()-1);
    }
}

interface lambdacalculatedVal{
    public boolean calculate (int a);
}

interface returnIntVal{
    public int calc();
}

interface mulVal{
    public BigInteger multiply();
}

interface divVal{
    public double divide();
}

interface compVal{
    public int compare(int i, int j);
}

interface lambdaAppend{
    public int lAppend(int i);
}