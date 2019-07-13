/**
 * ページ共通部品用js
 */
$(function() {

  $('#header-nav-tweet-modal-show').click(function() {
    $('#tweet-nav-modal-container').fadeIn();
  });

  $('.close-modal').click(function() {
    $('#tweet-nav-modal-container').fadeOut();
  });

  $(document).on('click', function(event) {
    if (!$(event.target).closest('.tweet-modal').length && !$(event.target).closest('#header-nav-tweet-modal-show').length) {
      $('#tweet-nav-modal-container').fadeOut();
    }
  });
});
