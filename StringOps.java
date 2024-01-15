public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(capVowelsLowRest("yellow"));
        System.out.println(camelCase(" Intro to coMPUter sCIEncE "));
        ptintARR(allIndexOf("Hello world",'l'));

        
    }
    public static void ptintARR(int[] arr) {
        System.out.print("{");
        for( int i=0; i<arr.length-1;i++){
            System.out.print( arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1] + "}");
    }
   
    public static String capVowelsLowRest (String string) {
        String low = "";
        String str = "";
        for(int var3 = 0; var3 < string.length(); var3++) {
            char var2 = string.charAt(var3);
            if (string.charAt(var3) >= 'A' && string.charAt(var3) <= 'Z') {
                 var2 = (char)(string.charAt(var3) + 32);
                
            }
            low = low + var2;
        }
        for(int i = 0; i < low.length(); i++){
            char check = low.charAt(i);
            if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u'){
                check = (char)(low.charAt(i) - 32);   
            }
           str = str + check;  
        }
        return str;
    }

    public static String camelCase (String string) {
       String str = "";
       String low = "";
       for(int var3 = 0; var3 < string.length(); var3++) {
            char var2 = string.charAt(var3);
            if (string.charAt(var3) >= 'A' && string.charAt(var3) <= 'Z') {
                var2 = (char)(string.charAt(var3) + 32);   
            }
            low = low + var2;
        }
        for (int j = 0; j < low.length(); j++){
            char mid = low.charAt(j);
            if (mid == 32){
                while (mid == 32){
                    if (j == low.length() - 1){ 
                        break;
                    }
                    mid = low.charAt(j + 1);
                    j++;
                    }
                
                    if (low.charAt(0) != 32 || str != "" )
                    mid = (char)(low.charAt(j) - 32);  
            }   
                str = str + mid;   
        }
        return str;
 }

    public static int[] allIndexOf (String string, char chr) {
        int counter = 0;
       for(int j = 0; j < string.length(); j++){
        if(chr == string.charAt(j)){
            counter++;
        }
       }
       int [] numbers = new int[counter];
       int loc = 0;
       for(int j = 0; j < string.length(); j++){
        if(chr == string.charAt(j)){
            numbers[loc] = j;
            loc++;
        }
    }
       
        return numbers;
    }
}
