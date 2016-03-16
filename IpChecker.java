
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpChecker 
{
    private final Pattern pattern;
    private final String ipRegex ="^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    private Matcher tempMatcher;
    public IpChecker()
    {
        pattern =Pattern.compile(ipRegex);
        
    }
    public boolean checkIp(String line)
    {
        tempMatcher = pattern.matcher(line);
        return tempMatcher.matches();   
    }
   
    
}
