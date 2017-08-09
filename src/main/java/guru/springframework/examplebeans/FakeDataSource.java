/**
 * @Author Feng Bo
 * @Date 9 Aug 2017 10:55:44 am
 */
package guru.springframework.examplebeans;

import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
public class FakeDataSource {

	private String user;
	private String password;
	private String url;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
