package com.czd.enums;

/**
* demo枚举示例
*/
public enum UserTypeEnum implements BaseEnum<Integer> {
	管理员(1),普通用户(2);
	
	private int code;

	UserTypeEnum(int code){
		this.code=code;
	}

	@Override
	public Integer code() {
		return this.code;
	}
}
