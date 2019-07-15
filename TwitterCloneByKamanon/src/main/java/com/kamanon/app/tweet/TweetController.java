package com.kamanon.app.tweet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kamanon.commons.KamanonBusinessException;
import com.kamanon.domain.service.tweet.TweetService;

/**
 * ツイート関連のコントローラー
 * */

@Controller
@RequestMapping("/tweet")
public class TweetController {

	@Autowired
	TweetService _tweetService;

	/**
	 * 新規ツイートを投稿
	 * @param tweetText
	 * 					ツイート本文
	 * @Param model
	 * 					モデル
	 * @return
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	String insertTweet(@ModelAttribute("tweetText") String tweetText, @ModelAttribute("userId") Long userId,
			@ModelAttribute("userName") String userName, Model model) {

		try {
			int insertCount = 0;
			insertCount = _tweetService.insertTweet(userId, tweetText);

			if (insertCount != 1) {
				throw new KamanonBusinessException("ツイートの投稿に失敗しました");
			}
		} catch (KamanonBusinessException e) {
			model.addAttribute("error", e.getMessage());
		}
		return "forward:/TwitterCloneByKamanonApplication/" + userName;
	}
}
