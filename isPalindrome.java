public class isPalindrome {

    public boolean isPal(int x){

        //gets length of the inputted int
        String length = String.valueOf(x);

        //creates an empty string to reverse into
        String rev = "";

        //if the input is negative its automatically not a palindrome
        if (x < 0){
            return false;
        } else {

            //creates a temp variable to work with that doesnt effect the input
            int temp1 = x;
            for (int i = 0; i < length.length(); i++) {

                // reverses the "string" of the input into the empty string
                int temp2 = temp1 % 10;
                rev += temp2;
                temp1 /= 10;
            }

            //for testing
            System.out.println(rev);
            System.out.println(x);

            //if the reverse equals the original input it is a palindrome
            if (rev.equals("" + x)){
                return true;
            } else {
                return false;
            }
        }

    }

}
