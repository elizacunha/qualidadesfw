<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="Usuarios.aspx.cs" Inherits="ProjetoLogin.Usuarios" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <div class="container">
        <div class="col-md-12">
            <h3>Usuários Cadastrados</h3>
            <p>
                <asp:Repeater ID="rptUsuarios" runat="server" OnItemDataBound="rptUsuarios_ItemDataBound" OnItemCommand="rptUsuarios_ItemCommand">
                    <HeaderTemplate>
                        <table class="table table-hover">
                            <tr>
                                <td><strong>Usuário</strong></td>
                                <td><strong>Login</strong></td>
                                <td><strong>Funções</strong></td>
                            </tr>
                    </HeaderTemplate>
                    <ItemTemplate>
                        <tr>
                            <td>
                                <%# DataBinder.Eval(Container.DataItem, "nome") %>
                            </td>
                            <td>
                                <%# DataBinder.Eval(Container.DataItem, "login") %>
                            </td>
                            <td>
                                <asp:LinkButton ID="lnkDetalhes" runat="server">
                                    <a href='<%# Eval("Id", "detalhes.aspx?id={0}") %>'>
                                        <span class="glyphicon glyphicon-eye-open"</a>
                                </asp:LinkButton>
                                
                                <asp:LinkButton ID="lnkEditar" runat="server">
                                    <a href='<%# Eval("Id", "editar.aspx?id={0}") %>'>
                                    <span class="glyphicon glyphicon-pencil"</a>
                                </asp:LinkButton>

                                <asp:LinkButton ID="lnkRemover" runat="server">
                                    <a href='<%# Eval("Id", "remover.aspx?id={0}") %>
                                    <span class="glyphicon glyphicon-trash"</a>
                                </asp:LinkButton>
                            </td>
                        </tr>
                    </ItemTemplate>
                    <FooterTemplate>
                        </table>
                    </FooterTemplate>
                </asp:Repeater>
            </p>
        </div>

        <div class="col-md-12">
            <asp:Label runat="server" Text="Label" CssClass="label" ID="lblMsg"></asp:Label>
        </div>

        <div class="col-md-12">
            <p>
                <asp:LinkButton runat="server" CssClass="btn btn-primary pull-right" ID="btnAdicionar"
                    PostBackUrl="novoUsuario.aspx">Cadastrar</asp:LinkButton>
            </p>
        </div>
    </div>
</asp:Content>



