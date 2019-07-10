/**
 * ページ共通部品用js
 */
$(function() {

	$('#header-nav-tweet-modal-show').click(function(){
		$('#tweet-nav-modal-container').fadeIn();
	});

	$('.close-modal').click(function(){
		$('#tweet-nav-modal-container').fadeOut();
	});
});
