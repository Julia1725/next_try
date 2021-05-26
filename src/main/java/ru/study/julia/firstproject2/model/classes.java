class Client{

	private int id;
	private String siebelId;
	private String mobile;

	public String getSiebelId() {
		return siebelId;
	}
	public String getMobile() {
		return mobile;
	}
	public String setId(int id) {
		this.id = id;
	}
	public String setSiebelId(String siebelId) {
		this.siebelId = siebelId;
	}
	public String setMobile(String mobile) {
		this.mobile = mobile;
	}

	Client() {
	}
	Client(int test_id, String test_siebelId, String test_mobile) {
		id = test_id;
		siebelId = test_siebelId;
		mobile = test_mobile;
	}

}