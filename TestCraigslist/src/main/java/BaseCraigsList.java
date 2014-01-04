/**
 * Created with IntelliJ IDEA.
 * User: Sharma
 * Date: 1/3/14
 * Time: 10:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class BaseCraigsList extends Universal
{
    public static String siteUrl = "http://newyork.craigslist.org/";
    //Login Information
    public static String emailLogIn = "andwhat08@gmail.com";
    public static String pswd = "mycraigslist1234";

    //Registration information
    public static String reg_Email = "saywhat_ny@yahoo.com";


    //Links  xpath
    public static String myAccount_Link = ".//*[@id='postlks']/li[2]/a";
    public static String logOut_Link = ".//*[@id='ef']/a[1]";
    public static String username_top_Link = ".//*[@id='pagecontainer']/header/a[2]";
    public static String signup_For_Account = ".//*[@id='pagecontainer']/section/form/p/a[1]";
    public static String jobs_start_link = ".//*[@id='jjj0']/li[";
    public static String jobs_end_link = "]/a";
    //*****************************************************************************
    //Input box xpath
    public static String emailInput_Box = ".//*[@id='inputEmailHandle']";
    public static String passwordInput_Box = ".//*[@id='inputPassword']";
    public static String registration_Email_Input = ".//*[@id='emailAddress']";
    //*****************************************************************************
    //Buttons xpath
    public static String logIn_Button = ".//*[@id='loginBox']/p[3]/button";
    public static String create_Account_Button = "html/body/section/form/div/span[4]/input";

    //Text
    public static String logged_Out_Display = ".//*[@id='pagecontainer']/header/section";
    public static String signup_Confirmation = "html/body/h3";
    public static String link_Page_Title = ".//*[@id='pagecontainer']/header/div/div[1]/span[4]/a";

}
