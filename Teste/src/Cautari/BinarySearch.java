package Cautari;

public class BinarySearch {

    //cautare binara
    public static void main(String[] args) {
        int[] vector={9,4,1,3,5,1,2,5,12,15,213};
        System.out.println(cautarebinara(vector,213,0,vector.length));
    }

    static int cautarebinara(int[] vector,int elemCautare,int inceput,int sfarsit){


        while(inceput<=sfarsit){
            int mijloc=(sfarsit + inceput)/2;
            if(vector[mijloc]==elemCautare){
                return mijloc;
            }else if(vector[mijloc]<elemCautare){
                inceput=mijloc+1;
            }else{
                sfarsit=mijloc;
            }
        }
        return -1;
    }
}
