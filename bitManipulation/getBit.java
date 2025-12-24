package bitManipulation;

public class getBit {
    public static int getIthBit(int num, int i){
        int bitMask = 1<<i;
        if((num & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
        int ithBit = getIthBit(13,2);
        System.out.println(ithBit);
    }
}
