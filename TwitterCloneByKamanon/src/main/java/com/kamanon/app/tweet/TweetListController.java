package com.kamanon.app.tweet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("{userId}")
public class TweetListController {

	@RequestMapping(value = "{userId}", method = RequestMethod.GET)
	private String listTweets(@PathVariable String userId) {
		return null;
	}
}
