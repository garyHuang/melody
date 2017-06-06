package hp.edu;

/**
 * 
 * 常量
 * @author Raindrops at 2017 4 16
 *
 */
public class Constants {
	
	public final static int STATE_OK = 200;// 正常
	public final static int STATE_NOT_FOUND = 404;// 未找到资源
	public final static int STATE_UNAUTHORIZED = 401;// 未授权
	public final static int STATE_SERVER_ERROR = 500;// 内部错误
	public final static int STATE_BUSSINESS_ERROR = 900;// 业务错误
	public final static int STATE_PARAMETERS_ERROR = 999;// 参数错误
	public final static int SAVE_ERROR = -1;// 保存失败
	public final static int UPDATE_ERROR = -2;// 更新失败
	
	
	// 默认头像
	public final static String DEFAULT_IMAGE_NAME = "200_200_2017052511183366f2b.jpg";
	
	// Sex
	public final static byte MALE_SEX = 1;
	public final static byte FEMALE_SEX = 2;
	public final static byte UNKNOW_SEX = 0;
	
	// 是否审核
	public final static byte IS_AUDIT = 1;
	public final static byte IS_NOT_AUDIT = 0;
	
	// 是否初始化资料
	public final static byte IS_INIT = 1;
	public final static byte IS_NOT_INIT = 0;
	
	// 错误提示
	public final static String MESSAGE_USER_EXISTS = "用户已存在.";
	public final static String MESSAGE_USER_NOT_EXISTS = "用户未存在.";
	public final static String MESSAGE_SERVER_ERROR = "服务器发生抖动XD，稍后试试看呗.";
	public final static String MESSAGE_PWD_ERROR = "密码输入错误呢，请不要随便对待人家.";
	public final static String MESSAGE_USERORPWD_EMTRY = "账号或者密码为空.";
	public final static String MESSAGE_NOTEMAIL_ERROR = "找不到该邮箱注册信息";
	public final static String MESSAGE_SENDMAIL_ERROR = "发送邮件出错";
	public final static String MESSAGE_PARAMETERS_ERROR = "参数错误";
	public final static String MESSAGE_SAVE_ERROR = "保存错误";
	public final static String MESSAGE_UPDATE_ERROR = "更新错误";
}
