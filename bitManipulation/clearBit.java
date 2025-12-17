package bitManipulation;

public class clearBit {
    public static int clearIthBit(int num, int i){
        int bitMask = ~(1<<i);
        return num & bitMask;
    }

    public static void main(String[] args) {
        int clearBit = clearIthBit(13,1);
        System.out.println(clearBit);
    }
}
