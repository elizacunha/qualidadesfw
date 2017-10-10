using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace entityFramework
{
    class EFContext : DbContext
    {
        public EFContext(): base("EF")
        {
            DropCreateDatabaseIfModelChanges<EFContext> initializer = new DropCreateDatabaseIfModelChanges<EFContext>();
            Database.SetInitializer<EFContext>(initializer);           
        }

        public DbSet<Editora> Editoras { get; set; }
        public DbSet<Livro> Livros { get; set; }
    }
}
