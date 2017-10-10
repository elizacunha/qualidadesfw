<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="ProjetoLogin.Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Login</title>
    <link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
    <link href="assets/css/user.css" rel="stylesheet" />
</head>
<body>
    <div class="login-card">
        <img class="profile-img-card" src="assets/img/avatar_2x.png" />
        <p class="profile-name-card"></p>
        <form id="form1" runat="server" class="form-signin">
            <span class="reauth-email"></span>
            <asp:TextBox ID="txtLogin" runat="server" required="required"
                placeholder="Login" CssClass="form-control"></asp:TextBox>
            <asp:TextBox ID="txtSenha" runat="server" required="required"
                placeholder="Senha" TextMode="Password" CssClass="form-control">
            </asp:TextBox>
            <asp:Button ID="btnLogin" runat="server"
                CssClass="btn btn-primary btn-block btn-lg btn-signin" Text="Entrar" OnClick="btnLogin_Click" />     
        </form>
        <asp:Label ID="lblMsg" runat="server" CssClass="label label-info"></asp:Label> 
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
