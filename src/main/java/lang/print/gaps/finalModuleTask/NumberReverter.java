package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        number=(number%100)*100+(number%10-number%100)+number/100;
        System.out.println(number);
    }
}
