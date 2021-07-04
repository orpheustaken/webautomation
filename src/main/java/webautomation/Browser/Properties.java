package webautomation.Browser;

public class Properties {
    //  To use the same browser for all steps, you must uncomment the logOut command in each StepDefinition. Otherwise, tests will fail.
    //  Note that disabling CLOSE_BROWSER will also make screenshots useless, as they will show the same HomePage after logOut.
    public static boolean CLOSE_BROWSER = true; 

    public static Browsers browser = Browsers.FIREFOX;

    public enum Browsers {
        CHROME,
        FIREFOX 
    }
}