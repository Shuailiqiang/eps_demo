package palworldconfig.model;

public class EpsVo {
	private String eps_num; //企业编码
	private String eps_nme; //企业标准名称
	private String eps_lnm; //企业长名称
	private String eps_cde; //企业社会信用代码

	public String getEps_num() {
		return eps_num;
	}

	public void setEps_num(String eps_num) {
		this.eps_num = eps_num;
	}

	public String getEps_nme() {
		return eps_nme;
	}

	public void setEps_nme(String eps_nme) {
		this.eps_nme = eps_nme;
	}

	public String getEps_lnm() {
		return eps_lnm;
	}

	public void setEps_lnm(String eps_lnm) {
		this.eps_lnm = eps_lnm;
	}

	public String getEps_cde() {
		return eps_cde;
	}

	public void setEps_cde(String eps_cde) {
		this.eps_cde = eps_cde;
	}

	@Override
	public String toString() {
		return "EpsVo{" +
				"eps_num='" + eps_num + '\'' +
				", eps_nme='" + eps_nme + '\'' +
				", eps_lnm='" + eps_lnm + '\'' +
				", eps_cde='" + eps_cde + '\'' +
				'}';
	}
}
