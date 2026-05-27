package com.question;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Q13_PaymentService {

    private final RestTemplate restTemplate = new RestTemplate();

    @CircuitBreaker(name = "paymentService", fallbackMethod = "fallbackPayment")
    public PaymentResponse callPaymentService(Long orderId) {
        String url = "http://payment-service/api/payments/" + orderId;
        return restTemplate.getForObject(url, PaymentResponse.class);
    }

    // Fallback method
    public PaymentResponse fallbackPayment(Long orderId, Throwable t) {
        return new PaymentResponse("FAILED", "Default response due to service unavailability");
    }
}
