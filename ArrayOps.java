public class ArrayOps {
    public static void main(String[] args) {
        int[] miss = {0, 1, 2, 3, 4, 6};
      System.out.println(findMissingInt(miss)); 
      int [] secondMax = {2, 8, 3, 7, 8};
      System.out.println(secondMaxValue(secondMax)); 
      int[] same1 = {1, 2, 3};
      int [] same2 = {1, 2, 3};
      System.out.println(containsTheSameElements(same1, same2));
      int[] sorted =   {1, 3, 2};
      System.out.println(isSorted(sorted));

        
    }
    
    public static int findMissingInt (int [] array) {
        int j = 0;
        int missing = 0;
        for ( j = 0; j <= array.length ; j++){
            boolean missInt = true;
          for (int i = 0; i < array.length; i++){  
            if( array[i] == j){
                missInt = false;
                break;
            }    
         }
        if (missInt){
            missing = j;    
        }
       }
           
        return missing;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
       int secondMax = 0;
        for (int i = 0; i < array.length; i++) {
        if (array[i] > max) {
            secondMax = max;
            max = array[i];
        }
            else if(array[i] > secondMax || array[i] == max){
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean check = true;
        for (int i = 0; i < array1.length; i++){
            int arr = array1[i];
            for(int j = 0; j < array2.length; j++){
                if(arr != array2[j]){
                    check =false;
                }
                else if (arr == array2[j]){
                check = true;
                break;
                }
            }
            if (check == false){
                break;
            }
        }
        
        return check;
    }

    public static boolean isSorted(int [] array) {
        boolean sorted = false;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        if(max == array[0]){
            for(int i = 1; i < array.length -1; i++){
                if(array[i] >= array[i + 1]){
                    sorted = true;
                    
                } 
                else {
                    break;
                }
            }
        }
        else if(max == array[array.length -1]){
            for(int i = 0; i < array.length -1; i++){
                if(array[i] <= array[i + 1]){
                    sorted = true;
                    
                }  
                else {
                    break;
                }
            }
        }

       
        return sorted;
    }

}
