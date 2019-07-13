package com.kamanon.app.tweet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ツイート関連のコントローラー
 * */

@Controller
@RequestMapping("/tweet")
public class TweetController {
	
	/**
	 * 新規ツイートを投稿
	 */
	@RequestMapping(value="/insert", method = RequestMethod.POST)
	String insertTweet(String userId, @RequestParam("tweetText") String tweetText, Model model) {
		
		System.out.println("ここまできました：" + tweetText);
		System.out.println(model.getAttribute("userInfo"));
		return "user_info/show";
	}

}
