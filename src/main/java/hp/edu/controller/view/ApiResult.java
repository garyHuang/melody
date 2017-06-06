package hp.edu.controller.view;

import java.util.HashMap;

import hp.edu.Constants;

/**
 * 
 * @author Raindrops at 2017/4/16
 *
 */
@SuppressWarnings("serial")
public class ApiResult extends HashMap<String, Object> {
	long timestamp;

	private ApiResult() {
		super();
		timestamp = System.currentTimeMillis();
	}

	public static ApiResult prepare() {
		return new ApiResult();
	}
	
	public ApiResult ok(Object data) {
		this.put("status", Constants.STATE_OK);
		this.put("aaData", data);
		this.put("elapsed", System.currentTimeMillis() - timestamp);
		return this;
	}

	public ApiResult error(int code, String message) {
		this.clear();
		this.put("status", code);
		this.put("message", message);
		this.put("elapsed", System.currentTimeMillis() - timestamp);
		return this;
	}
}
