<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="novoUsuario.aspx.cs" Inherits="ProjetoLogin.novoUsuario" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <div class="container">
        <div class="col-md-12 text-center text-primary">
            <h2>Cadastro de Usuário</h2>
        </div>

        <div class="form-group">
            <div class="col-md-8">
                <label>Nome:</label>
                <asp:TextBox ID="txtNome" runat="server" 
                    MaxLength="50" CssClass="form-control" 
                    placeholder="Nome Cliente"></asp:TextBox>
                <asp:RequiredFieldValidator ID="rfvNome" 
                    ControlToValidate="txtNome" ErrorMessege="*"
                    ForeColor="red" runat="server">
                </asp:RequiredFieldValidator>
            </div>

            <div class="col-md-4">
                <label>Login:</label>
                <asp:TextBox ID="txtLogin" runat="server"
                    MaxLength="10" CssClass="form-control"
                    placeholder="Login"></asp:TextBox>
                <asp:RequiredFieldValidator ID="rfvLogin"
                    ControlToValidate="txtLogin" ErrorMessage="*"
                    ForeColor="Red" runat="server" >
                </asp:RequiredFieldValidator>

            </div>

            <div class="col-md-4">
                <label>Senha:</label>
                <asp:TextBox ID="TextBox1" runat="server"
                    MaxLength="10" CssClass="form-control"
                    placeholder="Senha"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator1"
                    ControlToValidate="txtSenha" ErrorMessage="*"
                    ForeColor="Red" runat="server" >
                </asp:RequiredFieldValidator>



                    <
            </div>
        </div>
    </div>
</asp:Content>
