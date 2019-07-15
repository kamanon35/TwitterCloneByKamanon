package com.kamanon.domain.service.userinfo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import com.kamanon.domain.model.mybatis.entity.TUsr;

import lombok.Getter;

@SuppressWarnings("serial")
public class UserInfoDetails implements UserDetails {

	@Getter
	private final TUsr usr;

	public UserInfoDetails(TUsr usr) {
		this.usr = usr;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return AuthorityUtils.createAuthorityList("ROLE_");
	}

	@Override
	public String getPassword() {
		return this.usr.getPassword();
	}

	@Override
	public String getUsername() {
		return String.valueOf(this.usr.getUserId());
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
