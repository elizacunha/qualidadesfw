<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="Catalogo.aspx.cs" Inherits="ProjetoLogin.Catalogo" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <div class="container">
        <div class="col-md-12">
            <div class="jumbotron">
                <div class="text-primary">
                    <h1>Catálogo</h1>
                </div>
                <h3>Gestão de Usuários</h3>
            </div>
        </div>
        <div class="col-md-6">
            <ul class="list-group">
                <li class="list-group-item list-group-item-info">
                     <strong>Controle de Acesso</strong></li>
                <li class="list-group-item">Verificação de Usuário Cadastrado.</li>
                <li class="list-group-item">Verificação de Senha de Acesso.</li>
                <li class="list-group-item">Verificação de Nível de Acesso.</li>
            </ul>
        </div>
        <div class="col-md-6">
            <ul>
                <li class="list-group-item list-group-item-success">
                     <strong>Funcionalidades</strong></li>
                <li class="list-group-item">Listagem de Usuários</li>
                <li class="list-group-item">Criação de Usuários</li>
                <li class="list-group-item">Alteração de Usuário</li>
                <li class="list-group-item">Apagar Usuário</li>
            </ul>
        </div>
    </div>
</asp:Content>
