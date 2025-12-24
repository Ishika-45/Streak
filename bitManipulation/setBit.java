package bitManipulation;

public class setBit {
    public static int setIthBit(int num, int i){
        int bitMask = 1<<i;
        return num | bitMask;
    }

    public static void main(String[] args) {
        int setIthBit = setIthBit(13,1);
        System.out.println(setIthBit);
    }
}
