public class InvertedStar {

    //N/2-Forest problem on coding ninjas
    public static void main(String[] args) {
        int n = 4;
        //1st Approach
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd Approach
                for(int line = 1; line <= n; line++){
            for(int star = n; star >= line; star--){
                System.out.print("*");
            }
            System.out.println();
        }

                //3rd Approach
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

