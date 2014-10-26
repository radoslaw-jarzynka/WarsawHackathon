/**
 * created on 13:17:24 25 paź 2014 by Radoslaw Jarzynka
 * 
 * @author Radoslaw Jarzynka
 */
package pl.hackathon.warsaw;

import java.util.Calendar;
import java.util.Date;

public class Constants {

    public static String appId = "766825526711978";
    public static String appSecret = "18724218ddac01255de6ea4421293f25";
    public static String token = "CAACEdEose0cBAEDUp02EywOl2Fhyd23ZBtoQBnRXjGcxuWEYW5EkXMSM9ysnxEoMpA6BMh8LDuvcX5in02S0obvkz9yzhMjHvXUWET76ZBq7FpGY7OTNlptvOE21MV4m9oF1qupmlJ2sEpEk4gfJfxS8vlOJYzNS0VWmizrYp59ERtW0snicYsoziIrJxvGGQ98vIapGF3S4U8EZALy";
    public static String permissions = "publish_actions,user_friends,user_about_me,user_activities,user_status,read_friendlists,user_location,email,read_mailbox,read_page_mailboxes,read_stream";

    
    public static String APP_ID_PARAMETER = "APP_ID";
    public static String APP_SECRET_PARAMETER = "APP_SECRET";
    public static String TOKEN_PARAMETER = "TOKEN";
    
    public static void setAppId(String newAppId) {
        Constants.appId = newAppId;
    }

    public static void setAppSecret(String newAppId) {
        Constants.appId = newAppId;
    }

    public static void setToken(String newToken) {
        Constants.token = newToken;
    }
    public static Date oldestCommunitactionDate;
    
    static {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, -60);
        oldestCommunitactionDate = cal.getTime();
    }
}
