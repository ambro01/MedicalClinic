$("#registerButton").click(function () {
        if($("#registerUsername").val()=="" || $("#registerPassword").val()==""|| $("#registerEmail").val()==""){
            alert("Name and password must be filled out");
        }
});