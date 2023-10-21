class Pangram{
    public static void main(String args[]){
        String s= "Hello world";
        System.out.println(ispangram);

    }
    public static boolean ispangram(String s){

        if(s.length()<26){
            return false;
        }
        else{
            for(char ch='a';ch<='z';ch++){
                if(s.indexof(ch)<0){
                    return false;
                }
            }
        }
    }
}