(function ($) {
    'use strict';

    $(function () {
        //save admin menu
        $('#admin-menu-save-button').click(function () {
            var params = {
                menuPid: $('#admin-menu-pid').val(),
                menuName: $('#admin-menu-name').val(),
                menuDesc: $('#admin-menu-desc').val()
            };
            $.ajax({
                type: 'POST',
                url: $('form').attr('action'),
                data: JSON.stringify(params),
                success: function () {
                    alert('success');
                    window.location.href = $('#admin-menu-undo-button').attr('href');
                },
                error: function (data) {
                    if (data.responseJSON && data.responseJSON.message) {
                        $('#admin-menu-save-button').popover({
                            theme: 'warning',
                            content: data.responseJSON.message
                        });
                    } else {
                        $('#admin-menu-save-button').popover({
                            theme: 'warning',
                            content: data.status + '-' + data.statusText
                        });
                    }
                },
                contentType: 'application/json',
                dataType: 'json'
            });
        });
    });
})(jQuery);