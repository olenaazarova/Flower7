package ucu.edu.ua.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ucu.edu.ua.demo.delivery.PostDeliveryStrategy;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {

	}

    @Test
    public void testCardPay() {
        CreditCartPaymentStrategy creditCardPayment = new CreditCardPaymentStrategy();
        double price = 30.00;
        String result = creditCardPayment.pay(price);
        String expected = "\n{Paying with card, " + price + "}";
        assertEquals(expected, result);
    }

    @Test
    public void testPaymentPay() {
		PayPalPaymentStrategy payPalPayment = new PayPalPaymentStrategy();
		double price = 0;
		String result = payPalPayment.pay(price);
		String expected = "\n{Paying with PayPal, " + price + "}";
		assertEquals(expected, result);
	}

	@Test
    public void testDHLDelivery() {
        DHLDeliveryStrategy dhlDelivery = new DHLDeliveryStrategy();
        String result = dhlDelivery.delivery();
        assertEquals("DHL delivery", result);
    }

    @Test
    public void testPostDelivery() {
        PostDeliveryStrategy postDelivery = new PostDeliveryStrategy();
        String result = postDelivery.delivery();
        assertEquals("Post delivery", result);
    }
}
