package homework;

public class main {
    public static void main(String[] args) {
        MoneyConverter convert = new MoneyConverter();

        System.out.println(convert.convertRupeeToCanDollar(1000));
        System.out.println(convert.convertUSDtoEuro(60));
        System.out.println(convert.convertEuroToUSD(30));
        System.out.println(convert.convertCanDollarToSingDollar(100));
        System.out.println(convert.convertEuroToPound(20));
        System.out.println(convert.convertMalaRinggitToYen(175));
        System.out.println(convert.convertPoundToRupee(5));
        System.out.println(convert.convertSingDollarToSwissFranc(90));
        System.out.println(convert.convertSwissFrancToMalaRinggit(70));
        System.out.println(convert.convertYenToRenminbi(350));
    }
}
