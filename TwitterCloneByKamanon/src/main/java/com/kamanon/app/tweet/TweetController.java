package com.kamanon.app.tweet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kamanon.commons.KamanonBusinessException;
import com.kamanon.domain.model.entity.UserInfo;
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
	 *@param userInfo
	 *					ユーザー情報
	 * @Param model
	 * 					モデル
	 * @return
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	String insertTweet(@ModelAttribute("tweetText") String tweetText, @ModelAttribute("testId") UserInfo userInfo,
			Model model) {

		try {
			Long userId = userInfo.getUserInfoEntity().getUserId();
			int insertCount = 0;
			insertCount = _tweetService.insertTweet(userId, tweetText);

			if (insertCount != 1) {
				throw new KamanonBusinessException("ツイートの投稿に失敗しました");
			}

			// 新規投稿ツイートをリストに追加
			userInfo.getTweetInfoEntityList().add(_tweetService.doSelectLatestTweet(userId));
			model.addAttribute("userInfo", userInfo);

		} catch (KamanonBusinessException e) {
			model.addAttribute("error", e.getMessage());
			model.addAttribute("userInfo", userInfo);
		}
		return "user_info/show";
	}
}
