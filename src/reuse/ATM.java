package reuse;

public class ATM{
    public int countBanknotes(int sum){
        int count = 0;
        while(sum>= 500){
            int tmp = sum/500;
            count+=tmp;
            sum -= tmp*500;
            if(sum == 0)
                return count;
        }

        while(sum>= 200){
            int tmp = sum/200;
            count+=tmp;
            sum -= tmp*200;
            if(sum == 0)
                return count;
        }

        System.out.println( "500 - " + count);
        while(sum>=50){
            int tmp = sum/50;
            count+=tmp;
            sum -= tmp*50;
            if(sum == 0)
                return count;
        }
        System.out.println( "500 + 50  - "+ count);
        while(sum>=20){
            int tmp = sum/20;
            count+=tmp;
            sum -= tmp*20;
            if(sum == 0)
                return count;
        }

        System.out.println( "500 + 50 + 20  - "+ count);
        while(sum>=10){
            int tmp = sum/10;
            count+=tmp;
            sum -= tmp*10;
            if(sum == 0)
                return count;
        }

        System.out.println( "500 + 50 + 20 + 10 - "+ count);
        while(sum>=5){
            int tmp = sum/5;
            count+=tmp;
            sum -= tmp*5;
            if(sum == 0)
                return count;
        }
        System.out.println( "500 + 50 + 20 + 10 + 5 - "+ count);
        while(sum>=2){
            int tmp = sum/2;
            count+=tmp;
            sum -= tmp*2;
            if(sum == 0)
                return count;
        }
        System.out.println( "500 + 50 + 20 + 10 + 5 + 2 - "+ count);
        while(sum==1){
            //int tmp = sum/1;
            count+=1;
            sum -= 1;
            if(sum == 0)
                return count;
        }
        System.out.println( "500 + 50 + 20 + 10 + 5 + 2 + 1- "+ count);
        return count;

    }

    public static void main(String[] args) {
        System.out.println(new ATM().countBanknotes(4814));
    }
}