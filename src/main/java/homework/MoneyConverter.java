package homework;


import java.text.DecimalFormat;

public class MoneyConverter {
    double USD = 1.00;
    double euro = 0.94;
    double Pound = 0.82;
    double rupee = 68.32;
    double austDollar = 1.35;
    double candollar = 1.32;
    double singDollar = 1.43;
    double swissFranc = 1.01;
    double malaRinggit = 4.47;
    double yen = 115.84;
    double renminbi = 6.92;

    public MoneyConverter(){

    }

    public double convertUSDtoEuro(double amountUSD){
     double simplify = amountUSD * USD;
     double convert = simplify * euro;

     return convert;
    }

    public double convertEuroToUSD(double amountEuro){
        double simplify = amountEuro * euro;
        double convert = simplify * USD;
      return convert;
    }

   public double convertEuroToPound(double amountEuro){
        double simplify = amountEuro / euro;
        double convertToPound =  simplify * Pound;

        return convertToPound;
   }

   public double convertPoundToRupee(double amountPound){
        double simplify = amountPound / Pound;
        double convertToRupee = simplify * rupee;

        return convertToRupee;
   }

    public double convertRupeeToCanDollar(double amountRupee){
        double simplify = amountRupee / rupee;
        double convertToCanDollar = simplify * candollar;

        return convertToCanDollar;
    }
    public double convertCanDollarToSingDollar(double amountCanDollar){
        double simplify = amountCanDollar / candollar;
        double convertToSingDollar = simplify * singDollar;

        return convertToSingDollar;
    }
    public double convertSingDollarToSwissFranc(double amountSingDollar){
        double simplify = amountSingDollar / singDollar;
        double convertToSwissFranc = simplify * swissFranc;

        return convertToSwissFranc;
    }
    public double convertSwissFrancToMalaRinggit(double amountSwissFranc){
        double simplify = amountSwissFranc / swissFranc;
        double convertToMalaRinggit = simplify * malaRinggit;

        return convertToMalaRinggit;
    }

    public double convertMalaRinggitToYen(double amountMalaRinggit){
        double simplify = amountMalaRinggit / malaRinggit;
        double convertToYen = simplify * yen;

        return convertToYen;
    }
    public double convertYenToRenminbi(double amountYen){
        double simplify = amountYen / yen;
        double convertToRenminbi = simplify * renminbi;

        return convertToRenminbi;
    }


}
