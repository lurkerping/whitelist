(function ($) {
    'use strict';

    $(function () {
        $('.admin-menu-delete-button').click(function (e) {
            e.preventDefault();
            var menuId = $(this).closest('tr').children('td:first').text();
            $.ajax({
                type: 'DELETE',
                url: $('form').attr('action') + '/' + menuId,
                contentType: 'application/json',
                dataType: 'json',
                success: function () {
                    alert('success');
                    window.location.reload();
                }
            });

        });
    });
})(jQuery);
