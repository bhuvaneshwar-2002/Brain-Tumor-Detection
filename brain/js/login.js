
var attempt = 3; // Variable to count number of attempts.
// Below function Executes on click of login button.
function validate(){
var username = document.getElementById("username").value;
var password = document.getElementById("password").value;
if ( username == "admin" && password == "12345"){
alert ("Login successfully");
window.location = "http://127.0.0.1:5000/"; // Redirecting to other page.
return false;
}
else if(username.length == "" && password.length == "") {
    alert("User Name and Password fields are empty");
    return false;
}
else if (username.length == "") {
        alert("User Name is empty");
        return false;
}
else if(password.length == "") {
    alert("Password field is empty");
    return false;
}
else{
attempt --;// Decrementing by one.
alert("You have left "+attempt+" attempt;");
// Disabling fields after 3 attempts.
if( attempt == 0){
document.getElementById("username").disabled = true;
document.getElementById("password").disabled = true;
document.getElementById("submit").disabled = true;
return false;
}
}
}