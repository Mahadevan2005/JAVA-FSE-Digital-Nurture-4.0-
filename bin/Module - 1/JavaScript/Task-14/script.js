$(document).ready(function () {
    $('#registerBtn').click(function () {
        $('.event-card').fadeIn(1000);
        setTimeout(() => {
            $('.event-card').fadeOut(1000);
        }, 3000);
    });
});

// Note: Moving to frameworks like React or Vue gives better state management,
// reusable components, and improves maintainability of large apps.
