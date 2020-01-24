package testData;

import com.github.javafaker.Faker;
import pages.CouponPage;

import java.util.Locale;

public class CouponInfo {
    public CouponInfo() {
        createCoupon();
    }

    private static String Percentage;
    private static String MaxUses;
    private static String StartDate;
    private static String ExpDate;
    private static String CouponNum;

    Faker faker = new Faker(new Locale("en-US"));

    public String getCouponNum() {
        return CouponNum;
    }

    public static void setCouponNum(String couponNum) {
        CouponNum = couponNum;
    }



    public  String getPercentage() {
        return Percentage;
    }

    public void setPercentage(String percentage) {
        Percentage = percentage;
    }

    public String getMaxUses() {
        return MaxUses;
    }

    public void setMaxUses(String maxUses) {
        MaxUses = maxUses;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getExpDate() {
        return ExpDate;
    }

    public void setExpDate(String expDate) {
        ExpDate = expDate;
    }

    public void createCoupon() {
        setPercentage("17");
        setMaxUses("5");
        setStartDate("01/24/2020");
        setExpDate("02/20/2020");
        setCouponNum(faker.number().digits(7));
    }
}


