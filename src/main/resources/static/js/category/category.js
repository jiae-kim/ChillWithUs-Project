// ======== 검색창에서 close버튼 띄우기 =========
$('.search-input').keydown(function () {
  // console.log($('.search-input').val().length);
  $('.search-close').show();
});

// ======== search-close 안보이게 처리 =========
$(function () {
  $('.search-input').on('propertychange change paste input', function () {
    if ($(this).val() == '') {
      $('.search-close').css('display', 'none');
    }
  });
});

// ======== search-close 누르면 search창 빈칸으로 변경 =========
$('.search-close').click(function () {
  $('.search-input').val('');
  $('.search-close').css('display', 'none');
});
