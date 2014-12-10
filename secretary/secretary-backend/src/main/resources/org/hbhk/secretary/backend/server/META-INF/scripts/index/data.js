$(document).ready(function() {
	$(window).scroll(function() {
		if ($(window).scrollTop() > 300) {
			$("#back-to-top").fadeIn(1500);
		} else {
			$("#back-to-top").fadeOut(1500);
		}
	});
	// 当点击跳转链接后，回到页面顶部位置
	$("#back-to-top").click(function() {
		$(window).animate({
			scrollTop : 0
		}, 1000);
	});
	// 导航切换
	$(".menuson1 li").click(function() {
		$(".menuson1 li.active").removeClass("active")
		$(this).addClass("active");
	});

	$('.title1').click(function() {
		var $ul = $(this).next('ul');
		$('dd').find('ul').slideUp();
		if ($ul.is(':visible')) {
			$(this).next('ul').slideUp();
		} else {
			$(this).next('ul').slideDown();
		}
	});
	
	$(".menuson1 li").mousemove(function(e){
		$(this).addClass("active");
	}).mouseout(function(e){
		$(this).removeClass("active");
	});
});
