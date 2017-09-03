$("#registerButton").click(function () {
        if($("#registerUsername").val()=="" || $("#registerPassword").val()==""|| $("#registerEmail").val()==""){
            alert("Nazwa, haslo i adres email musza byc wypelnione");
        }
});