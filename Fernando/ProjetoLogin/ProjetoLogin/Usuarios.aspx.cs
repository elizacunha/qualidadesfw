using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;



namespace ProjetoLogin
{
    public partial class Usuarios : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            string nivel = Session["Perfil"].ToString();
            if (nivel != "A")
            {
                btnAdicionar.Visible = false;
            }
                
            CarregarUsuarios();
        }

        private void CarregarUsuarios()
        {
            string query = @"SELECT Id, nome, login FROM usuario order by nome";
            DataTable dt = new DataTable();
            try
            {
                SqlDataAdapter da = new SqlDataAdapter(query, Conexao.con);
                da.Fill(dt);

                //Populate Repeater control with data
                rptUsuarios.DataSource = dt;
                rptUsuarios.DataBind();
            }
            catch(Exception ex)
            {
                lblMsg.Text = "Falha: " + ex.Message;
            }
            finally
            {
                Conexao.Desconectar();
            }
        }

        protected void rptUsuarios_ItemDataBound(object sender, RepeaterItemEventArgs e)
        {

            string nivel = Session["Perfil"].ToString();

            var lnkEditar = (LinkButton)e.Item.FindControl("lnkEditar");
            var lnkRemover = (LinkButton)e.Item.FindControl("lnkRemover");

            if(lnkEditar != null && lnkRemover != null && nivel != "A")
            {
                lnkEditar.Visible = false;
                lnkRemover.Visible = false;
            }
        }

        protected void rptUsuarios_ItemCommand(object source, RepeaterCommandEventArgs e)
        {
            string nivel = Session["Perfil"].ToString();

            var lnkEditar = (LinkButton)e.Item.FindControl("lnkEditar");
            var lnkRemover = (LinkButton)e.Item.FindControl("lnkFormatar");

            if (lnkEditar != null && lnkRemover != null && nivel != "A")
            {
                lnkEditar.Visible = false;
                lnkRemover.Visible = false;
            }
        }
    }
}