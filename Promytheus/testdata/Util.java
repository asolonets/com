package com.Promytheus.testdata;

public class Util {

    private static final String TEST_DATA_FILE_PATH = "C:\\Users\\Alex\\Documents\\QA UBER\\qauber\\src\\test\\java\\com\\Promytheus\\testdata\\TestData.xlsx";
    private static final int WAIT_TIME = 50;
    private static final String BASE_URL = "http://ec2-52-53-181-39.us-west-1.compute.amazonaws.com/sign-in.html";
    private static final String USER_NAME = "midanyc@banit.me";
    private static final String PASSWD = "123456";
    private static final String EXPECT_IN_MAIN_PAGE = "© 2017 ProMytheUs from Undercover Productions Pte Ltd to 21st Century Lions";
    private static final String EXPECT_LOGIN_ERROR = "Invalid Email or Password.";
    private static final String FIREFOX_PATH = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";

    public static String getTestDataFilePath() {
        return TEST_DATA_FILE_PATH;
    }

    public static int getWaitTime() {
        return WAIT_TIME;
    }

    public static String getBaseUrl() {
        return BASE_URL;
    }

    public static String getUserName() {
        return USER_NAME;
    }

    public static String getPASSWD() {
        return PASSWD;
    }

    public static String getExpectInMainPage() {
        return EXPECT_IN_MAIN_PAGE;
    }

    public static String getExpectLoginError() {
        return EXPECT_LOGIN_ERROR;
    }

    public static String getFirefoxPath() {
        return FIREFOX_PATH;
    }
}
