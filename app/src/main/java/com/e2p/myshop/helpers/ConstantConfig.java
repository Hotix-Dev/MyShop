package com.e2p.myshop.helpers;

import com.e2p.myshop.models.Client;
import com.e2p.myshop.models.Statement;

import java.util.ArrayList;

public class ConstantConfig {
    /********************** *****************( Final )************************  *******************/

    //FINAL App Id
    public static final String FINAL_APP_ID = "1";

    /***************************************(Non Final )*******************************************/
    //BASE URL
    public static String BASE_URL = "http://41.228.164.76:91/MyECFAPI/";

    public static ArrayList<Statement> ALL_STATEMENTS = null;
    public static ArrayList<Client> ALL_CLIENTS = null;
    public static Client  CURENT_CLIENT = null;
    public static Client  SELECTED_CLIENT = null;

    public static Integer  CURENT_EXERCICE = 1970;
    public static Integer YEAR_0 = 1970;
    public static Integer YEAR_1 = 1970;
    public static Integer YEAR_2 = 1970;
    public static Integer YEAR_3 = 1970;

    public static String  AB_TITLE = "";

}

