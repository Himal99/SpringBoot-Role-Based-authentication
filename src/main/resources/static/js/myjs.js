var pw = document.getElementById('pw');
var showpw = document.getElementById('showpw');

showpw.addEventListener('click', function() {
    if (pw.type === 'password') {
        pw.type = 'text';
    } else {
        pw.type = 'password';
    }
})