package palworldconfig.parameter;


public enum EExceptionEnum {
	/**
	 * 未分类异常
	 */
	NOT_DEFINED_ERROR("-1"),
	/**
	 * 系统配置异常
	 */
	SYS_SETTING_ERROR("-2"),
	/**
	 * 系统业务逻辑异常
	 */
	SYS_SERVICE_ERROR("-3");

	private final String errCode;

	EExceptionEnum(String errCode) {
		this.errCode = errCode;
	}

}
