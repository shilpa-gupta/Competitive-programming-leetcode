/**
 * Created by shilpa on 1/15/2017.
 */
public class ComplementNumber {
    public static void main(String[] args){
        System.out.println(findComplement(5));
    }
    public static int findComplement(int num) {
        return ~num & ((Integer.highestOneBit(num) << 1)-1);
    }
}

