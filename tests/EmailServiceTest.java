import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {

    Order order = new Order();
    EmailService email=new EmailService();

    @Test
    void testGetInstance()
    {
        assertTrue(EmailService.getInstance() instanceof EmailService);
    }

    @Test
    void testSendEmail()
    {

        Executable executable=()->email.sendEmail(order);
        assertThrows(RuntimeException.class,executable);
    }

    @Test
    void testSendEmailWithString()
    {
        assertTrue(email.sendEmail(order,"Mobile"));
    }


}