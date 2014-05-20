package com.android.internal.telephony;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2010 - 2014 Orange SA
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


public interface RILConstants
{
  // Fields

  public static final int RIL_ERRNO_INVALID_RESPONSE = -1;

  public static final int MAX_INT = 2147483647;

  public static final int SUCCESS = 0;

  public static final int RADIO_NOT_AVAILABLE = 1;

  public static final int GENERIC_FAILURE = 2;

  public static final int PASSWORD_INCORRECT = 3;

  public static final int SIM_PIN2 = 4;

  public static final int SIM_PUK2 = 5;

  public static final int REQUEST_NOT_SUPPORTED = 6;

  public static final int REQUEST_CANCELLED = 7;

  public static final int OP_NOT_ALLOWED_DURING_VOICE_CALL = 8;

  public static final int OP_NOT_ALLOWED_BEFORE_REG_NW = 9;

  public static final int SMS_SEND_FAIL_RETRY = 10;

  public static final int SIM_ABSENT = 11;

  public static final int SUBSCRIPTION_NOT_AVAILABLE = 12;

  public static final int MODE_NOT_SUPPORTED = 13;

  public static final int FDN_CHECK_FAILURE = 14;

  public static final int ILLEGAL_SIM_OR_ME = 15;

  public static final int NETWORK_MODE_WCDMA_PREF = 0;

  public static final int NETWORK_MODE_GSM_ONLY = 1;

  public static final int NETWORK_MODE_WCDMA_ONLY = 2;

  public static final int NETWORK_MODE_GSM_UMTS = 3;

  public static final int NETWORK_MODE_CDMA = 4;

  public static final int NETWORK_MODE_CDMA_NO_EVDO = 5;

  public static final int NETWORK_MODE_EVDO_NO_CDMA = 6;

  public static final int NETWORK_MODE_GLOBAL = 7;

  public static final int NETWORK_MODE_LTE_CDMA_EVDO = 8;

  public static final int NETWORK_MODE_LTE_GSM_WCDMA = 9;

  public static final int NETWORK_MODE_LTE_CMDA_EVDO_GSM_WCDMA = 10;

  public static final int NETWORK_MODE_LTE_ONLY = 11;

  public static final int PREFERRED_NETWORK_MODE = 0;

  public static final int SUBSCRIPTION_FROM_RUIM = 0;

  public static final int SUBSCRIPTION_FROM_NV = 1;

  public static final int PREFERRED_CDMA_SUBSCRIPTION = 1;

  public static final int CDMA_CELL_BROADCAST_SMS_DISABLED = 1;

  public static final int CDMA_CELL_BROADCAST_SMS_ENABLED = 0;

  public static final int NO_PHONE = 0;

  public static final int GSM_PHONE = 1;

  public static final int CDMA_PHONE = 2;

  public static final int SIP_PHONE = 3;

  public static final int LTE_ON_CDMA_UNKNOWN = -1;

  public static final int LTE_ON_CDMA_FALSE = 0;

  public static final int LTE_ON_CDMA_TRUE = 1;

  public static final int CDM_TTY_MODE_DISABLED = 0;

  public static final int CDM_TTY_MODE_ENABLED = 1;

  public static final int CDM_TTY_FULL_MODE = 1;

  public static final int CDM_TTY_HCO_MODE = 2;

  public static final int CDM_TTY_VCO_MODE = 3;

  public static final int SETUP_DATA_TECH_CDMA = 0;

  public static final int SETUP_DATA_TECH_GSM = 1;

  public static final int SETUP_DATA_AUTH_NONE = 0;

  public static final int SETUP_DATA_AUTH_PAP = 1;

  public static final int SETUP_DATA_AUTH_CHAP = 2;

  public static final int SETUP_DATA_AUTH_PAP_CHAP = 3;

  public static final java.lang.String SETUP_DATA_PROTOCOL_IP = "IP";

  public static final java.lang.String SETUP_DATA_PROTOCOL_IPV6 = "IPV6";

  public static final java.lang.String SETUP_DATA_PROTOCOL_IPV4V6 = "IPV4V6";

  public static final int DEACTIVATE_REASON_NONE = 0;

  public static final int DEACTIVATE_REASON_RADIO_OFF = 1;

  public static final int DEACTIVATE_REASON_PDP_RESET = 2;

  public static final int RIL_RESTRICTED_STATE_NONE = 0;

  public static final int RIL_RESTRICTED_STATE_CS_EMERGENCY = 1;

  public static final int RIL_RESTRICTED_STATE_CS_NORMAL = 2;

  public static final int RIL_RESTRICTED_STATE_CS_ALL = 4;

  public static final int RIL_RESTRICTED_STATE_PS_ALL = 16;

  public static final int DATA_PROFILE_DEFAULT = 0;

  public static final int DATA_PROFILE_TETHERED = 1;

  public static final int DATA_PROFILE_IMS = 2;

  public static final int DATA_PROFILE_FOTA = 3;

  public static final int DATA_PROFILE_CBS = 4;

  public static final int DATA_PROFILE_OEM_BASE = 1000;

  public static final int RIL_REQUEST_GET_SIM_STATUS = 1;

  public static final int RIL_REQUEST_ENTER_SIM_PIN = 2;

  public static final int RIL_REQUEST_ENTER_SIM_PUK = 3;

  public static final int RIL_REQUEST_ENTER_SIM_PIN2 = 4;

  public static final int RIL_REQUEST_ENTER_SIM_PUK2 = 5;

  public static final int RIL_REQUEST_CHANGE_SIM_PIN = 6;

  public static final int RIL_REQUEST_CHANGE_SIM_PIN2 = 7;

  public static final int RIL_REQUEST_ENTER_NETWORK_DEPERSONALIZATION = 8;

  public static final int RIL_REQUEST_GET_CURRENT_CALLS = 9;

  public static final int RIL_REQUEST_DIAL = 10;

  public static final int RIL_REQUEST_GET_IMSI = 11;

  public static final int RIL_REQUEST_HANGUP = 12;

  public static final int RIL_REQUEST_HANGUP_WAITING_OR_BACKGROUND = 13;

  public static final int RIL_REQUEST_HANGUP_FOREGROUND_RESUME_BACKGROUND = 14;

  public static final int RIL_REQUEST_SWITCH_WAITING_OR_HOLDING_AND_ACTIVE = 15;

  public static final int RIL_REQUEST_CONFERENCE = 16;

  public static final int RIL_REQUEST_UDUB = 17;

  public static final int RIL_REQUEST_LAST_CALL_FAIL_CAUSE = 18;

  public static final int RIL_REQUEST_SIGNAL_STRENGTH = 19;

  public static final int RIL_REQUEST_VOICE_REGISTRATION_STATE = 20;

  public static final int RIL_REQUEST_DATA_REGISTRATION_STATE = 21;

  public static final int RIL_REQUEST_OPERATOR = 22;

  public static final int RIL_REQUEST_RADIO_POWER = 23;

  public static final int RIL_REQUEST_DTMF = 24;

  public static final int RIL_REQUEST_SEND_SMS = 25;

  public static final int RIL_REQUEST_SEND_SMS_EXPECT_MORE = 26;

  public static final int RIL_REQUEST_SETUP_DATA_CALL = 27;

  public static final int RIL_REQUEST_SIM_IO = 28;

  public static final int RIL_REQUEST_SEND_USSD = 29;

  public static final int RIL_REQUEST_CANCEL_USSD = 30;

  public static final int RIL_REQUEST_GET_CLIR = 31;

  public static final int RIL_REQUEST_SET_CLIR = 32;

  public static final int RIL_REQUEST_QUERY_CALL_FORWARD_STATUS = 33;

  public static final int RIL_REQUEST_SET_CALL_FORWARD = 34;

  public static final int RIL_REQUEST_QUERY_CALL_WAITING = 35;

  public static final int RIL_REQUEST_SET_CALL_WAITING = 36;

  public static final int RIL_REQUEST_SMS_ACKNOWLEDGE = 37;

  public static final int RIL_REQUEST_GET_IMEI = 38;

  public static final int RIL_REQUEST_GET_IMEISV = 39;

  public static final int RIL_REQUEST_ANSWER = 40;

  public static final int RIL_REQUEST_DEACTIVATE_DATA_CALL = 41;

  public static final int RIL_REQUEST_QUERY_FACILITY_LOCK = 42;

  public static final int RIL_REQUEST_SET_FACILITY_LOCK = 43;

  public static final int RIL_REQUEST_CHANGE_BARRING_PASSWORD = 44;

  public static final int RIL_REQUEST_QUERY_NETWORK_SELECTION_MODE = 45;

  public static final int RIL_REQUEST_SET_NETWORK_SELECTION_AUTOMATIC = 46;

  public static final int RIL_REQUEST_SET_NETWORK_SELECTION_MANUAL = 47;

  public static final int RIL_REQUEST_QUERY_AVAILABLE_NETWORKS = 48;

  public static final int RIL_REQUEST_DTMF_START = 49;

  public static final int RIL_REQUEST_DTMF_STOP = 50;

  public static final int RIL_REQUEST_BASEBAND_VERSION = 51;

  public static final int RIL_REQUEST_SEPARATE_CONNECTION = 52;

  public static final int RIL_REQUEST_SET_MUTE = 53;

  public static final int RIL_REQUEST_GET_MUTE = 54;

  public static final int RIL_REQUEST_QUERY_CLIP = 55;

  public static final int RIL_REQUEST_LAST_DATA_CALL_FAIL_CAUSE = 56;

  public static final int RIL_REQUEST_DATA_CALL_LIST = 57;

  public static final int RIL_REQUEST_RESET_RADIO = 58;

  public static final int RIL_REQUEST_OEM_HOOK_RAW = 59;

  public static final int RIL_REQUEST_OEM_HOOK_STRINGS = 60;

  public static final int RIL_REQUEST_SCREEN_STATE = 61;

  public static final int RIL_REQUEST_SET_SUPP_SVC_NOTIFICATION = 62;

  public static final int RIL_REQUEST_WRITE_SMS_TO_SIM = 63;

  public static final int RIL_REQUEST_DELETE_SMS_ON_SIM = 64;

  public static final int RIL_REQUEST_SET_BAND_MODE = 65;

  public static final int RIL_REQUEST_QUERY_AVAILABLE_BAND_MODE = 66;

  public static final int RIL_REQUEST_STK_GET_PROFILE = 67;

  public static final int RIL_REQUEST_STK_SET_PROFILE = 68;

  public static final int RIL_REQUEST_STK_SEND_ENVELOPE_COMMAND = 69;

  public static final int RIL_REQUEST_STK_SEND_TERMINAL_RESPONSE = 70;

  public static final int RIL_REQUEST_STK_HANDLE_CALL_SETUP_REQUESTED_FROM_SIM = 71;

  public static final int RIL_REQUEST_EXPLICIT_CALL_TRANSFER = 72;

  public static final int RIL_REQUEST_SET_PREFERRED_NETWORK_TYPE = 73;

  public static final int RIL_REQUEST_GET_PREFERRED_NETWORK_TYPE = 74;

  public static final int RIL_REQUEST_GET_NEIGHBORING_CELL_IDS = 75;

  public static final int RIL_REQUEST_SET_LOCATION_UPDATES = 76;

  public static final int RIL_REQUEST_CDMA_SET_SUBSCRIPTION_SOURCE = 77;

  public static final int RIL_REQUEST_CDMA_SET_ROAMING_PREFERENCE = 78;

  public static final int RIL_REQUEST_CDMA_QUERY_ROAMING_PREFERENCE = 79;

  public static final int RIL_REQUEST_SET_TTY_MODE = 80;

  public static final int RIL_REQUEST_QUERY_TTY_MODE = 81;

  public static final int RIL_REQUEST_CDMA_SET_PREFERRED_VOICE_PRIVACY_MODE = 82;

  public static final int RIL_REQUEST_CDMA_QUERY_PREFERRED_VOICE_PRIVACY_MODE = 83;

  public static final int RIL_REQUEST_CDMA_FLASH = 84;

  public static final int RIL_REQUEST_CDMA_BURST_DTMF = 85;

  public static final int RIL_REQUEST_CDMA_VALIDATE_AND_WRITE_AKEY = 86;

  public static final int RIL_REQUEST_CDMA_SEND_SMS = 87;

  public static final int RIL_REQUEST_CDMA_SMS_ACKNOWLEDGE = 88;

  public static final int RIL_REQUEST_GSM_GET_BROADCAST_CONFIG = 89;

  public static final int RIL_REQUEST_GSM_SET_BROADCAST_CONFIG = 90;

  public static final int RIL_REQUEST_GSM_BROADCAST_ACTIVATION = 91;

  public static final int RIL_REQUEST_CDMA_GET_BROADCAST_CONFIG = 92;

  public static final int RIL_REQUEST_CDMA_SET_BROADCAST_CONFIG = 93;

  public static final int RIL_REQUEST_CDMA_BROADCAST_ACTIVATION = 94;

  public static final int RIL_REQUEST_CDMA_SUBSCRIPTION = 95;

  public static final int RIL_REQUEST_CDMA_WRITE_SMS_TO_RUIM = 96;

  public static final int RIL_REQUEST_CDMA_DELETE_SMS_ON_RUIM = 97;

  public static final int RIL_REQUEST_DEVICE_IDENTITY = 98;

  public static final int RIL_REQUEST_EXIT_EMERGENCY_CALLBACK_MODE = 99;

  public static final int RIL_REQUEST_GET_SMSC_ADDRESS = 100;

  public static final int RIL_REQUEST_SET_SMSC_ADDRESS = 101;

  public static final int RIL_REQUEST_REPORT_SMS_MEMORY_STATUS = 102;

  public static final int RIL_REQUEST_REPORT_STK_SERVICE_IS_RUNNING = 103;

  public static final int RIL_REQUEST_CDMA_GET_SUBSCRIPTION_SOURCE = 104;

  public static final int RIL_REQUEST_ISIM_AUTHENTICATION = 105;

  public static final int RIL_UNSOL_RESPONSE_BASE = 1000;

  public static final int RIL_UNSOL_RESPONSE_RADIO_STATE_CHANGED = 1000;

  public static final int RIL_UNSOL_RESPONSE_CALL_STATE_CHANGED = 1001;

  public static final int RIL_UNSOL_RESPONSE_VOICE_NETWORK_STATE_CHANGED = 1002;

  public static final int RIL_UNSOL_RESPONSE_NEW_SMS = 1003;

  public static final int RIL_UNSOL_RESPONSE_NEW_SMS_STATUS_REPORT = 1004;

  public static final int RIL_UNSOL_RESPONSE_NEW_SMS_ON_SIM = 1005;

  public static final int RIL_UNSOL_ON_USSD = 1006;

  public static final int RIL_UNSOL_ON_USSD_REQUEST = 1007;

  public static final int RIL_UNSOL_NITZ_TIME_RECEIVED = 1008;

  public static final int RIL_UNSOL_SIGNAL_STRENGTH = 1009;

  public static final int RIL_UNSOL_DATA_CALL_LIST_CHANGED = 1010;

  public static final int RIL_UNSOL_SUPP_SVC_NOTIFICATION = 1011;

  public static final int RIL_UNSOL_STK_SESSION_END = 1012;

  public static final int RIL_UNSOL_STK_PROACTIVE_COMMAND = 1013;

  public static final int RIL_UNSOL_STK_EVENT_NOTIFY = 1014;

  public static final int RIL_UNSOL_STK_CALL_SETUP = 1015;

  public static final int RIL_UNSOL_SIM_SMS_STORAGE_FULL = 1016;

  public static final int RIL_UNSOL_SIM_REFRESH = 1017;

  public static final int RIL_UNSOL_CALL_RING = 1018;

  public static final int RIL_UNSOL_RESPONSE_SIM_STATUS_CHANGED = 1019;

  public static final int RIL_UNSOL_RESPONSE_CDMA_NEW_SMS = 1020;

  public static final int RIL_UNSOL_RESPONSE_NEW_BROADCAST_SMS = 1021;

  public static final int RIL_UNSOL_CDMA_RUIM_SMS_STORAGE_FULL = 1022;

  public static final int RIL_UNSOL_RESTRICTED_STATE_CHANGED = 1023;

  public static final int RIL_UNSOL_ENTER_EMERGENCY_CALLBACK_MODE = 1024;

  public static final int RIL_UNSOL_CDMA_CALL_WAITING = 1025;

  public static final int RIL_UNSOL_CDMA_OTA_PROVISION_STATUS = 1026;

  public static final int RIL_UNSOL_CDMA_INFO_REC = 1027;

  public static final int RIL_UNSOL_OEM_HOOK_RAW = 1028;

  public static final int RIL_UNSOL_RINGBACK_TONE = 1029;

  public static final int RIL_UNSOL_RESEND_INCALL_MUTE = 1030;

  public static final int RIL_UNSOL_CDMA_SUBSCRIPTION_SOURCE_CHANGED = 1031;

  public static final int RIL_UNSOl_CDMA_PRL_CHANGED = 1032;

  public static final int RIL_UNSOL_EXIT_EMERGENCY_CALLBACK_MODE = 1033;

  public static final int RIL_UNSOL_RIL_CONNECTED = 1034;

}
