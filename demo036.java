class BigOfThreeNums {
    int bigOfThree(int x, int y, int z) {
        if ((x > y) && (x > z))
            return x;
        else if ((y > x) && (y > z))
            return y;
        else
            return z;
    }
}

public class Demo036 {
    public static void main(String[] args) {
        BigOfThreeNums obj = new BigOfThreeNums();
        int bigNum = obj.bigOfThree(100, 200, 500);
        System.out.println(bigNum);
    }
}