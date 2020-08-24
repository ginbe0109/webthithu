$(document).ready(function() {
	$(window).scroll(function() {
		if ($(window).scrollTop() - $("#id_anchor").position().top < 0) {
			$('#id_content').css({
				'position' : 'relative'
			});
		} else {
			$('#id_content').css({
				'position' : 'fixed'
			});
		}
	});
});
