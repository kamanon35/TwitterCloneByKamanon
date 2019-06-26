package mrs.domain.service.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import mrs.domain.model.User;
import mrs.domain.repository.user.UserRepository;

// UserDetailsServiceはSpringで定義されたインタフェースを実装する
@Service
public class ReservationUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	/**
	 * @param username
	 *                 usernameを使用し、ユーザー情報をDBから取得する
	 */
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		// Jpa Repositoryの生成するメソッドを使用
		Optional<User> userOp = userRepository.findById(username);
		if (!userOp.isPresent()) {
			throw new UsernameNotFoundException(username + " is not found.");
		}
		return new ReservationUserDetails(userOp.get());
	}
}
