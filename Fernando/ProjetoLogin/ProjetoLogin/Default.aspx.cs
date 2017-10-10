using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace ProjetoLogin
{
    public partial class Default : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            txtLogin.Focus();
        }


        protected void btnLogin_Click(object sender, EventArgs e)
        {
            try
            {
                string Login = txtLogin.Text;
                string Senha = txtSenha.Text;

                var cmd = new SqlCommand();
                cmd.Connection = Conexao.con;
                cmd.CommandText = @"select nivel
                from usuario
                where login=@login and
                senha = @senha";

                cmd.Parameters.AddWithValue("@login", Login);
                cmd.Parameters.AddWithValue("@senha", Senha);

                Conexao.Conectar();

                string nivel = Convert.ToString(cmd.ExecuteScalar());

                if (string.IsNullOrEmpty(nivel))
                {
                    lblMsg.Text = "Usuário não encontrado.";
                }
                else
                {
                    //lblMsg.Text = "Usuário encontrado.";
                    FormsAuthentication.RedirectFromLoginPage(Login, false);
                    Session["Perfil"] = nivel;
                }
            }
            catch(Exception ex)
            {
                lblMsg.Text = ("Falha: " + ex.Message);
            }
            finally
            {
                Conexao.Desconectar();
            }
        }
    }
}