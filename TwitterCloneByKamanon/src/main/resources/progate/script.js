$(function() {

  $('#login-show').click(function() {
    $('#concon').fadeIn();
  });

  $('.signup-show').click(function() {
    $('#signup-modal').fadeIn();
  });

  $('.close-modal').click(function() {
    $('#concon').fadeOut();
    $('#signup-modal').fadeOut();
  });

  $('.lesson-hover').hover(
    function() {
      $(this).find('.text-contents').addClass('text-active');
    },
    function() {
      $(this).find('.text-contents').removeClass('text-active');
    }
  );
});
