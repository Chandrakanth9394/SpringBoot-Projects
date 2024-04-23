package com.gj.main.constants;

public class Constants {

	public static final String COMMON_TEXT_REGX = "^[a-zA-Z0-9-_ !@#$%^&*()]*$";

	public static final String COM_NAME_REQ_MSG = "Name is required";

	public static final String PAN_REGX = "[A-Z]{5}[0-9]{4}[A-Z]{1}";

	public static final String PAN_REQ_MSG = "pan is required";

	public static final String COMMON_MOB_NO_REGX = "^(\\+\\d{1,3}[- ]?)?\\d{10}$";

	public static final String MOB_NO_REQ_MSG = "Mobile number is required";

	public static final String GST_REGX = "^\\d{2}[A-Z]{5}\\d{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1}$";

	public static final String GST_REQ_MSG = "gst is required";

	public static final String EMAIL_REGX = "^[a-zA-Z0-9]+@(?:[a-zA-Z0-9]+\\.)+[A-Za-z]+$";

	public static final String EMAIL_REQ_MSG = "Email is required";

	public static final String MOB_NO_REGX = "^\\+1\\([2-9][0-9]{2}\\) [2-9][0-9]{2}-[0-9]{4}$";

	public static final String PHONE_NO_REQ_MSG = "Phone Number is required";

	public static final String ZIP_CODE_REQ_MSG = "ZipCode is required";

	public static final String ZIP_CODE_REGX = "^[0-9]{5}(?:-[0-9]{4})?$";

	public static final String ADDRESS_REGX = "^[a-zA-Z0-9,_ ]*$";

	public static final String ADDRESS_REQ_MSG = "Address is required";

	public static final String PINCODE_REGX = "\\d{6}";

	public static final String IFSC_REGX = "^[A-Z]{4}0[A-Z0-9]{6}$";
}
