package com.kamanon.app.tweet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("{userName}")
public class UserInfoController {

	/**
	 * リクエストパラメータのuserNameをキーにアカウント情報作成サービス実行
	 * */
	@RequestMapping(value = "{userName}", method = RequestMethod.GET)
	private String doCreateUserInfo(@PathVariable String userId) {
		
		return null;
	}
}
