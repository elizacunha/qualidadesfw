using System.Data.SqlClient;
using System.Configuration;

namespace ProjetoLogin
{
    public class Conexao
    {
        public static string connectionString = ConfigurationManager.ConnectionStrings["Login"].ConnectionString;
        public static SqlConnection con = new SqlConnection(connectionString);
        
        public static void Conectar()
        {
            if (con.State == System.Data.ConnectionState.Closed)
            {
                con.Open();
            }
        } 

        public static void Desconectar()
        {
            if (con.State == System.Data.ConnectionState.Open)
            {
                con.Close();
            }
        }
    }
}