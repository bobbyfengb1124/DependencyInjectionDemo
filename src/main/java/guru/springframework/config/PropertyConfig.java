/**
 * @Author Feng Bo
 * @Date 9 Aug 2017 10:58:32 am
 */
package guru.springframework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import guru.springframework.examplebeans.FakeDataSource;

/**
 * 
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

	@Value("${guru.username}")
	String user;

	@Value("${guru.password}")
	String password;

	@Value("${guru.dburl}")
	String url;

	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);

		System.out.println(fakeDataSource.getUser());

		return fakeDataSource;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
}
