package Cautari;

public class interpolare {

    public static void main(String[] args) {
        int[ ] array={1,2,4,8,16,32,64,128,256,512,1024};
        int index=interpolation(array,512);

        System.out.println("element gasit la"+ index);

    }

    private static int interpolation(int[] array, int value) {

        int high = array.length-1;
        int low=0;
        while(value>=array[low] && value<=array[high] && low<=high){

            int probe =low + (high-low )*(value-array[low])/(array[high]-array[low]);

            System.out.println("probe"+probe);
            if(array[probe]== value){
                return probe;

     }else if(array[probe]<value){
                low=probe+1;
            }
            else{
                high=probe-1;
            }

        }
        return -1;
    }
}
