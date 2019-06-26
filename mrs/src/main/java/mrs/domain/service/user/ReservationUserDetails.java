package mrs.domain.service.user;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;
import mrs.domain.model.User;

/**
 * Spring Securityで使用する認証ユーザーを定義する
 * Userテーブルを使用する設定もここでしている？
 */
@SuppressWarnings("serial")
public class ReservationUserDetails implements UserDetails {

	// セッターを作るのはまずいと思われる
	@Getter
	private final User user;

	public ReservationUserDetails(User user) {
		this.user = user;
	}

	// Authorities = Authorityの複数形、権限
	/**
	 * RoleName型のEnumをSpring SecurityのGrantedAuthorityに変換する。
	 * プレフィックスとして「ROLE_」を付ける必要があることに注意。
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return AuthorityUtils
				.createAuthorityList("ROLE_" + this.user.getRoleName().name());
	}

	@Override
	public String getPassword() {
		return this.user.getPassword();
	}

	// userIdをuserNameとして処理している
	@Override
	public String getUsername() {
		return this.user.getUserId();
	}

	/**
	 * 以下4メソッド、それぞれアカウント期限切れ、アカウントロック、パスワード有効期限切れ、アカウント無効化に対するプロパティ設定。
	 * 今回は使用しない。
	 */
	// expire = 終了、満了の意味
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	// Credentials = credentialの複数形、証明書
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	// Enabled = Enableの過去形、可能にする
	@Override
	public boolean isEnabled() {
		return true;
	}

}
