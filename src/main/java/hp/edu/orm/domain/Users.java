package hp.edu.orm.domain; 



public class Users {
	
	/*
	* ID
	*/
	private String id;
	/*
	* 用户名
	*/
	private String username;
	/*
	* 登录密码
	*/
	private String password;
	/*
	* 昵称
	*/
	private String name;
	/*
	* 邮箱
	*/
	private String email;
	/*
	* 手机号
	*/
	private String mobilePhone;
	/*
	* 创建时间
	*/
	private java.sql.Timestamp createTime;
	/*
	* 备注
	*/
	private String remarks;
	/*
	* 用户类型
	*/
	private String userType;
	/*
	* 图片url
	*/
	private String portraitUrl;
	/*
	* 是否启用
	*/
	private Boolean enabled;
	
	
	/*
	* ID
	*/
	public void setId(String id){
		this.id = id ;
	}
	/*
	* ID
	*/
	public String getId(){
		return this.id ; 
	}
	
	/*
	* 用户名
	*/
	public void setUsername(String username){
		this.username = username ;
	}
	/*
	* 用户名
	*/
	public String getUsername(){
		return this.username ; 
	}
	
	/*
	* 登录密码
	*/
	public void setPassword(String password){
		this.password = password ;
	}
	/*
	* 登录密码
	*/
	public String getPassword(){
		return this.password ; 
	}
	
	/*
	* 昵称
	*/
	public void setName(String name){
		this.name = name ;
	}
	/*
	* 昵称
	*/
	public String getName(){
		return this.name ; 
	}
	
	/*
	* 邮箱
	*/
	public void setEmail(String email){
		this.email = email ;
	}
	/*
	* 邮箱
	*/
	public String getEmail(){
		return this.email ; 
	}
	
	/*
	* 手机号
	*/
	public void setMobilePhone(String mobilePhone){
		this.mobilePhone = mobilePhone ;
	}
	/*
	* 手机号
	*/
	public String getMobilePhone(){
		return this.mobilePhone ; 
	}
	
	/*
	* 创建时间
	*/
	public void setCreateTime(java.sql.Timestamp createTime){
		this.createTime = createTime ;
	}
	/*
	* 创建时间
	*/
	public java.sql.Timestamp getCreateTime(){
		return this.createTime ; 
	}
	
	/*
	* 备注
	*/
	public void setRemarks(String remarks){
		this.remarks = remarks ;
	}
	/*
	* 备注
	*/
	public String getRemarks(){
		return this.remarks ; 
	}
	
	/*
	* 用户类型
	*/
	public void setUserType(String userType){
		this.userType = userType ;
	}
	/*
	* 用户类型
	*/
	public String getUserType(){
		return this.userType ; 
	}
	
	/*
	* 图片url
	*/
	public void setPortraitUrl(String portraitUrl){
		this.portraitUrl = portraitUrl ;
	}
	/*
	* 图片url
	*/
	public String getPortraitUrl(){
		return this.portraitUrl ; 
	}
	
	/*
	* 是否启用
	*/
	public void setEnabled(Boolean enabled){
		this.enabled = enabled ;
	}
	/*
	* 是否启用
	*/
	public Boolean isEnabled(){
		return this.enabled ; 
	}
}