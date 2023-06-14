package codingBat;

public class Has271 {

    public static void main(String[] args) {
        Has271 h = new Has271();
        int[] nums  = {1,2,7,1};
        System.out.println(h.has271(new int[]{1,2,7,1}));
        System.out.println(h.has271(new int[]{1,2,8,1}));
        System.out.println(h.has271(new int[]{2,7,1}));
    }


    public boolean has271(int[] nums) {

        for(int i=0; i<nums.length-1;i++) {
            int num1 = nums[0];
            if ((nums[i+1])==(num1+5)&&(Math.abs((nums[i+2])-(num1-1))<=2)) return true;
        }
        return false;
    }

}
