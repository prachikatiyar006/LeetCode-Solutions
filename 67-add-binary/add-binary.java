class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;

        StringBuilder ans = new StringBuilder();

        while(i>=0|| j >= 0 || carry != 0){

            int digit1 = 0;
            int digit2 = 0;

            if(i >= 0){
                digit1 =a.charAt(i) - '0';
            }

            if(j >=0){
                digit2 = b.charAt(j) - '0';
            }

            int sum = digit1 + digit2+carry;

            ans.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        return ans.reverse().toString();
    }
}