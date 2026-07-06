package class_13.decoratorDP.paymentEg;

public class Main {
    public static void main(String[] args) {
        System.out.println(":: Card Payment ::");

        Payment cardPayment = new RewardPointsDecorator(
                new CashbackDecorator(
                        new AuditDecorator(
                                new OTPVerificationDecorator(
                                        new FraudCheckDecorator(
                                                new CardPayment()
                                        )
                                )
                        )
                )
        );

        cardPayment.pay(5000);
        System.out.println("--------------------------------");


        System.out.println(":: UPI Payment ::");

        Payment upiPayment = new CashbackDecorator(
                new AuditDecorator(
                        new FraudCheckDecorator(
                                new UPIPayment()
                        )
                )
        );

        upiPayment.pay(2500);
        System.out.println("--------------------------------");


        System.out.println(":: Net Banking Payment ::");

        Payment netBankingPayment = new RewardPointsDecorator(
                new OTPVerificationDecorator(
                        new AuditDecorator(
                                new NetBankingPayment()
                        )
                )
        );

        netBankingPayment.pay(10000);
    }
}


/* *

    Output:
        :: Card Payment ::
        Audit Log:
        Time : 2026-07-05T14:46:55.466258300
        Amount : ₹5000.0
        Sending OTP...
        OTP Verified Successfully.
        Checking for fraudulent transaction...
        Paid ₹5000.0 using Card
        Fraud check passed.
        Transaction recorded successfully.
        Cashback Earned : ₹250.0
        Reward Points Earned : 50
        --------------------------------
        :: UPI Payment ::
        Audit Log:
        Time : 2026-07-05T14:46:55.481860900
        Amount : ₹2500.0
        Checking for fraudulent transaction...
        Paid ₹2500.0 using UPI
        Fraud check passed.
        Transaction recorded successfully.
        Cashback Earned : ₹125.0
        --------------------------------
        :: Net Banking Payment ::
        Sending OTP...
        OTP Verified Successfully.
        Audit Log:
        Time : 2026-07-05T14:46:55.484955400
        Amount : ₹10000.0
        Paid ₹10000.0 using Net Banking
        Transaction recorded successfully.
        Reward Points Earned : 100

* */