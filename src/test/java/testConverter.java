import homework.MoneyConverter;
import org.junit.Assert;
import org.junit.Test;

public class testConverter {
    @Test
    public void testConvertUSDToEuro(){
        MoneyConverter USD = new MoneyConverter();
        //given
        double expected = 94;

        //when
        double Actual = USD.convertUSDtoEuro(100.00);

        //then
        Assert.assertEquals(Actual,expected,0.01);
    }
    @Test
    public void testConvertEuroToUSD(){
        MoneyConverter Euro = new MoneyConverter();
        //given
        double expected = 188.0;

        //when
        double Actual = Euro.convertEuroToUSD(200);

        //then
        Assert.assertEquals(Actual,expected,0.01);
    }

    @Test
    public void testconvertEuroTOPound(){
        MoneyConverter Euro2 = new MoneyConverter();
        //given
        double expected =261.7;

        //when
        double actual = Euro2.convertEuroToPound(300);

        //then
        Assert.assertEquals(actual,expected,0.01);
    }
    @Test
    public void testconvertPoundToRupee(){
        MoneyConverter Pound = new MoneyConverter();
        //Given
        double expected = 4165.85;

        //when
        double actual = Pound.convertPoundToRupee(50);

        //then
        Assert.assertEquals(actual,expected,0.01);
    }

    @Test
    public void testConvertRupeeToCanDollar(){
        MoneyConverter Ruppee = new MoneyConverter();
        //Given
        double expected = 19.32;

        //when
        double actual = Ruppee.convertRupeeToCanDollar(1000);

        //then
        Assert.assertEquals(actual,expected,0.01);


    }
    @Test
    public void testConvertCandollarToSingDollar(){
        MoneyConverter candollar = new MoneyConverter();
        //given
        double expected = 65;

        //when
        double actual = candollar.convertCanDollarToSingDollar(60);

        //then
        Assert.assertEquals(actual,expected,0.01);
    }
    @Test
    public void testConvertSingDollarToSwissFranc(){
        MoneyConverter Singdollar = new MoneyConverter();
        //given
        double expected = 56.5;

        //when
        double actual = Singdollar.convertSingDollarToSwissFranc(80);

        //then
        Assert.assertEquals(actual,expected,0.01);
    }
    @Test
    public void testConvertSwissFrancToMalaRinggit(){
        MoneyConverter SwissFranc = new MoneyConverter();
        //given
        double Expected = 663.86;

        //when
        double actual = SwissFranc.convertSwissFrancToMalaRinggit(150);

        //then
        Assert.assertEquals(actual,Expected,0.01);
    }

    @Test
    public void testConvertMalaRinggitToYen(){
        MoneyConverter MalaRinggit = new MoneyConverter();
        //given
        double Expected = 1295;

        //when
        double actual = MalaRinggit.convertMalaRinggitToYen(50);

        //then
        Assert.assertEquals(actual,Expected,0.01);
    }
    @Test
    public void testConvertYenToRenminbi(){
        MoneyConverter Yen = new MoneyConverter();
        //given
        double expected = 119.47;

        //when
        double actual = Yen.convertYenToRenminbi(2000);

        //then
        Assert.assertEquals(actual,expected,0.01);

    }

}
