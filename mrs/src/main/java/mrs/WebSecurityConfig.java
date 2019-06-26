package mrs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import mrs.domain.service.user.ReservationUserDetailsService;

/**
 * 作成したReservationDetailsServiceとログイン画面を使ってフォーム認証するための設定を行う
 * Spring Securityを使用する場合には必要となる設定
 */
@Configuration
@EnableWebSecurity // アノテーション付与することで、Spring SecurityのWeb連携機能（CSRFなど）を有効にする
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	ReservationUserDetailsService userDetailsService;

	// 入力されたパスワードを暗号化？
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(); // パスワードのエンコードアルゴリズムとしてBCyrptを使用する
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
				.antMatchers("/js/**", "/css/**").permitAll() // (3)/js以下と/css以下へのアクセスは常に許可(permitAll)する
				.antMatchers("/**").authenticated() // (3)以外へのアクセスは認証を要求する
				.and()
				.formLogin() // ここからSuccessUrlの行までログイン認証を行う
				.loginPage("/loginForm") // ログイン画面、認証URL、ユーザー名・パスワードのリクエストパラメータ名
				.loginProcessingUrl("/login") // ログイン処理を行うurl(コントローラはSpring側で用意されている？)
				.usernameParameter("username")
				.passwordParameter("password")
				.defaultSuccessUrl("/rooms", true) // 第二引数をtrueにすることで認証成功時は常に指定したパスへ遷移する
				.failureUrl("/loginForm?error=true").permitAll(); // ログイン画面、認証URL、認証失敗時の遷移先へのアクセスは常に許可する
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService)
				.passwordEncoder(this.passwordEncoder()); // 指定のServiceとエンコーダを使用して認証を行う
	}
}
