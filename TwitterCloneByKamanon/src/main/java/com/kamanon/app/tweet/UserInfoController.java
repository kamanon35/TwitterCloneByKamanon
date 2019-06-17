package com.kamanon.app.tweet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kamanon.domain.model.entity.TwitterInfoSelectKey;
import com.kamanon.domain.model.entity.TwitterInfoSelectResult;
import com.kamanon.domain.model.entity.UserInfo;
import com.kamanon.domain.service.tweet.UserInfoService;

@Controller
@RequestMapping(value = "{userName}")
public class UserInfoController {
	
	@Autowired
	UserInfoService _userInfoService;

	/**
	 * リクエストパラメータのuserNameをキーにユーザー情報作成サービス実行
	 * @param userName リクエストパラメータ
	 * */
	@RequestMapping(value = "{userName}", method = RequestMethod.GET)
	String doCreateUserInfo(@PathVariable String userName, Model model) {
		
		// selectキーを設定
		TwitterInfoSelectKey key = new TwitterInfoSelectKey();
		key.setUserName(userName);
		
		// ユーザー情報を取得
		TwitterInfoSelectResult twitterInfoSelectResult = _userInfoService.executeService(key, model);
		UserInfo userInfo = twitterInfoSelectResult.getUserInfo();
		model.addAttribute("userInfo", userInfo);
		
		return "/user_info/show";
	}
}
