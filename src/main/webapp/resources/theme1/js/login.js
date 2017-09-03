$("#loginButton").click(function () {
    if ($("#loginUsername").val() == "" || $("#loginPassword").val() == "") {
        alert("Nazwa i haslo musza byc wypelnione");
    }
});