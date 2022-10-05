$(function(){
    $(".ham").click(function(){
        $(this).find("a").toggleClass("active");

        if($("nav").hasClass("active")){
            $("nav").removeClass("active");
            $(this).find(".hamText").children().text("MENU");
            $("body").css("overflow", "auto")
            $(".bg").removeClass("active")
        }else{
            $("nav").addClass("active");
            $(this).find(".hamText").children().text("CLOSE");
            $("body").css("overflow", "hidden")
            $(".bg").addClass("active");
        }
    })

    var swiper = new Swiper(".mySwiper", {
        slidesPerView: 1,
        spaceBetween: 30,
        loop: true,
        pagination: {
          el: ".swiper-pagination",
          clickable: true,
        },
        navigation: {
          nextEl: ".swiper-button-next",
          prevEl: ".swiper-button-prev",
        },
    });

    var menu = ['영화', '드라마', '예능', '애니메이션']
    var swiper = new Swiper(".mySwiper2", {
        slidesPerView: 4,
        spaceBetween: 10,
        slidesPerGroup: 4,
        loop: true,
        loopFillGroupWithBlank: true,
        pagination: {
          el: ".swiper-pagination2",
          clickable: true,
          renderBullet: function (index, className) {
            return '<span class="' + className + '">' + (menu[index]) + '</span>';
          },
        },
        navigation: {
          nextEl: ".swiper-button-next",
          prevEl: ".swiper-button-prev",
        },
    });

    var menu2 = ['미국', '영국', '일본', '중국']
    var swiper = new Swiper(".mySwiper3", {
        slidesPerView: 4,
        spaceBetween: 10,
        slidesPerGroup: 4,
        loop: true,
        loopFillGroupWithBlank: true,
        pagination: {
          el: ".swiper-pagination3",
          clickable: true,
          renderBullet: function (index, className) {
            return '<span class="' + className + '">' + (menu2[index]) + '</span>';
          },
        },
        navigation: {
          nextEl: ".swiper-button-next",
          prevEl: ".swiper-button-prev",
        },
    });

    $(".line1").infiniteslide({
      'pauseonhover':false,
      'responsive':true,
      'clone': 3,
      'speed': 100
    });

    $('.parallaxBanner').parallax();

    $(".line2").infiniteslide({
      'direction':'right',
      'pauseonhover':false,
      'responsive':true,
      'clone': 3,
      'speed': 100
    });
    $(".line3").infiniteslide({
      'direction':'left',
      'pauseonhover':false,
      'responsive':true,
      'clone': 3,
      'speed': 100
    });

})