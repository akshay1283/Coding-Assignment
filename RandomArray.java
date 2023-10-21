public class RandomArray{
    
    public static void shuffle(int[] array){
        for(int i=0;i< array.length;i++){

            int s = i+ (int)(Math.random()* (array.length-i));
            int temp= array[s];
            array[s]= array[i];
            array[i]= temp;
        }
    }
    public static void main(String[] args){

        int[] a={1,2,3,4,5};

        RandomArray.shuffle(a);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}