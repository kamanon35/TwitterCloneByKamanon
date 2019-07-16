package com.kamanon.domain.service.userinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kamanon.domain.model.mybatis.entity.TUsr;
import com.kamanon.domain.model.mybatis.entity.TUsrExample;
import com.kamanon.domain.model.mybatis.mapper.TUsrMapper;

@Service
public class UserInfoDetailsService implements UserDetailsService {

	@Autowired
	TUsrMapper _tUsrMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		TUsrExample where = new TUsrExample();
		where.createCriteria().andUserNameEqualTo(username);
		TUsr tUsr = _tUsrMapper.selectByExample(where).get(0);
		if (tUsr == null) {
			throw new UsernameNotFoundException(username + "is not found");
		}
		return new UserInfoDetails(tUsr);
	}
}
