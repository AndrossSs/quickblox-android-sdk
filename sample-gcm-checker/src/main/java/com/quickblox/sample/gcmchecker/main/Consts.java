package com.quickblox.sample.gcmchecker.main;

import com.quickblox.sample.gcmchecker.R;

public class Consts {

    // QuickBlox credentials
//    public static final int APP_ID = 99;
//    public static final String AUTH_KEY = "63ebrp5VZt7qTOv";
//    public static final String AUTH_SECRET = "YavMAxm5T59-BRw";
//    public static final String USER_LOGIN = "samsamsam";
//    public static final String USER_PASSWORD = "samsamsam";
//
    public static final int APP_ID = 18846;
    public static final String AUTH_KEY = "64JzC2cuLkSMUq7";
    public static final String AUTH_SECRET = "s4VCJZq4uWNer7H";

    public static final String USER_LOGIN = "user_1";
    public static final String USER_PASSWORD = "user_1user_1";

//    public static final String USER_LOGIN = "user_2";
//    public static final String USER_PASSWORD = "user_2user_2";

    // In GCM, the Sender ID is a project ID that you acquire from the API console
    public static final String PROJECT_NUMBER = "761750217637";
//    public static final String PROJECT_NUMBER = "287747642439";
    public static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;

    public static final String EMPTY_STRING = "";

    public static final String EXTRA_MESSAGE = "message";
    public static final String EXTRA_PUSH_ID = "id";
    public static final String EXTRA_DELIVERY_DATE = "deliveryDate";
    public static final String EXTRA_SEND_DATE = "sendDate";
    public static final String EXTRA_SERVER_TITLE = "serverTitle";
    public static final String EXTRA_SERVER_ERRORS = "serverErrors";


    public static final String INSTANCES_WEB_RESOURCE = "http://status.quickblox.com/admin/push/instances";
    public static final String INSTANCES_TITLE = "title";
    public static final String INSTANCES_APP_ID = "appId";
    public static final String INSTANCES_AUTH_KEY = "authKey";
    public static final String INSTANCES_AUTH_SECRET = "authSecret";
    public static final String INSTANCES_USER_LOGIN = "userLogin";
    public static final String INSTANCES_USER_ID = "userID";
    public static final String INSTANCES_USER_PASSWORD = "userPass";
    public static final String INSTANCES_SERVER_API_DOMAIN = "serverApiDomain";

    public static final String REPORT_URL = "http://statuscopy.quickblox.com/admin/push/save";
    public static final String REPORT_PARAMETER_SERVER = "instance";
    public static final String REPORT_PARAMETER_PUSH_TIME = "time";
    public static final String REPORT_PARAMETER_PLATFORM = "platform";
    public static final String PLATFORM_VALUE = "android";
    public static final String REPORT_PARAMETER_PUSH_TIMEOUT = "timeout";
    public static final String REPORT_PARAMETER_ERROR = "error";
    public static final String REPORT_PARAMETER_ERROR_CODE = "error[code]";
    public static final String REPORT_PARAMETER_ERROR_STATUS = "error[status]";
    public static final String REPORT_PARAMETER_ERROR_MESSAGE = "error[message]";
    public static final String REPORT_PARAMETER_ERROR_DETAILS = "error[details]";


    public static final int STATUS_COLOR_SUCCESS = R.drawable.shape_oval_green;
    public static final int STATUS_COLOR_FAIL = R.drawable.shape_oval_red;
    public static final int STATUS_COLOR_IN_PROGRESS = R.drawable.shape_oval_gray;

    public static final int TEST_ITEM_BACKGROUND_COLOR = R.color.grey_light;
    public static final int NORMAL_ITEM_BACKGROUND_COLOR = R.color.white;

    public static final String TASK_SUCCESS_ACTION = "success_action";
    public static final String TASK_FAIL_ACTION = "fail_action";

    public static final String STEP_CREATE_SESSION = "(create session)";
    public static final String STEP_SUBSCRIBE_TO_PUSH = "(subscribe to push notifications)";
    public static final String STEP_CREATE_EVENT = "(create event)";
    public static final String STEP_PUSH_SENDED = "Waiting push notification";

    public static final String GCM_NOTIFICATION = "GCM Notification";
    public static final String GCM_DELETED_MESSAGE = "Deleted messages on server: ";
    public static final String GCM_INTENT_SERVICE = "GcmIntentService";
    public static final String GCM_SEND_ERROR = "Send error: ";
    public static final String GCM_RECEIVED = "Received: ";

    public static final String NEW_PUSH_EVENT = "new-push-event";
    public static final int PUSH_TIMEOUT = 30000;
    public static final String QBEVENT_EXTRAS = "qbEventExtras";
    public static final String NEW_PUSH_BUNDLE = "newPushBundle";

    public static final String DB_NAME = "checkerDB";
    public static final String DB_TABLE_NAME = "credentials";
    public static final String DB_COLUMN_ID = "ID";
    public static final String DB_COLUMN_TITLE = "title";
    public static final String DB_COLUMN_APP_ID = "appId";
    public static final String DB_COLUMN_AUTH_KEY = "authKey";
    public static final String DB_COLUMN_AUTH_SECRET = "authSecret";
    public static final String DB_COLUMN_USER_LOGIN = "userLogin";
    public static final String DB_COLUMN_USER_ID = "userID";
    public static final String DB_COLUMN_USER_PASSWORD = "userPass";
    public static final String DB_COLUMN_SERVER_API_DOMAIN = "serverApiDomain";


    public static final String PREFS_DATE_UPDATE = "dateUpdate";
}