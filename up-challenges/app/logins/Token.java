package logins;


public class Token {

	private String access_token;
	private String token_type;
	private Integer expires_in;
	private String refresh_token;

	public String getAccessToken() {
		return access_token;
	}

	public void setAccessToken(String accessToken) {
		this.access_token = accessToken;
	}

	public String getTokenType() {
		return token_type;
	}

	public void setTokenType(String tokenType) {
		this.token_type = tokenType;
	}

	public Integer getExpiresIn() {
		return expires_in;
	}

	public void setExpiresIn(Integer expiresIn) {
		this.expires_in = expiresIn;
	}

	public String getRefreshToken() {
		return refresh_token;
	}

	public void setRefreshToken(String refreshToken) {
		this.refresh_token = refreshToken;
	}


}