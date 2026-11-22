class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        boolean start = false;
        for(int i=s.length()-1;i>=0;i--){
            
            if(s.charAt(i) ==' ' && start ==false){
                continue; 
            }if(s.charAt(i) == ' ' && start ==true){
                return count;
            }
            else{
                start =true;
                count++;
            }
        }
        return count;        
    }
}