package com.kamanon.domain.service.userinfo;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.kamanon.commons.KamanonBusinessException;
import com.kamanon.domain.interfaces.KamanonServiceBase;
import com.kamanon.domain.model.entity.TwitterInfoSelectKey;
import com.kamanon.domain.model.entity.TwitterInfoSelectResult;

/**
 * サービスの基底クラス
 */
public abstract class UserInfoServiceAbstract implements KamanonServiceBase {

	public TwitterInfoSelectResult executeService(TwitterInfoSelectKey key, Model model) {
		
		TwitterInfoSelectResult twitterInfoSelectResult = new TwitterInfoSelectResult();

		try {
			twitterInfoSelectResult = execute(key);

		} catch (KamanonBusinessException k) {
			model.addAttribute("error", k.getMessage());

		} catch (Exception e) {
			model.addAttribute("error", "想定外の例外が発生しました。");
			model.addAttribute("error", e.getMessage());
		}

		return twitterInfoSelectResult;
	}

	/**
	 * サブクラスでサービス実装
	 */
	@Transactional
	protected abstract TwitterInfoSelectResult execute(TwitterInfoSelectKey key);
}
