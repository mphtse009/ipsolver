
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith (Parameterized.class)
public class IpCheckerTest {
    private IpChecker instance;
    private final String ip;
    private final Boolean expected;
    @Before 
    public void initialize() 
    { 
        instance = new IpChecker(); 
    }
    public IpCheckerTest(String ip,Boolean expected)
    {
        this.ip = ip;
        this.expected =expected;
    }
    @Parameters 
    public static Collection ipNumbers() 
    { 
        return Arrays.asList(new Object[][] { 
            { "0.0.0.0", true }, 
            { "255.255.255.255", true }, 
            { ".0.1.2.4", false },
            { "4", false },
            { ".", false },
            { "Hello World", false },
            { "", false },
            { "-255.123.222.222", false },
            { "255.-123.222.222", false },
            { "255.123.-222.222", false },
            { "255.123.222.-222", false },
            { "ip.12.22.11", false },
            { "196.23.234.ip", false },
            { "257.123.23.222", false },
            { "196.2345.233.209", false }
        }); 
    }
   
    @Test
    public void testCheckIp() {
        System.out.println("Now checking : "+ip);
        boolean result = instance.checkIp(ip);
        assertEquals(expected, result);
        
    } 
}
