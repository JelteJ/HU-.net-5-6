using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WinkelService
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "LoginService" in both code and config file together.
    public class LoginService : ILoginService
    {
        public string login(string username, string password)
        {
            using (WinkelDatabaseModelContainer ctx = new WinkelDatabaseModelContainer())
            {
                var customers = from cust in ctx.Customers
                                where cust.username == username
                                select cust;

                foreach (Customer p in customers)
                    if (p.password == password)
                    {
                        return "Inloggen gelukt";
                    }
            }
            return "Inloggen niet gelukt";
        }

        public string register(string uname)
        {
            // Als de user niet bestaat, maak een nieuwe user aan met een gegenereerd wachtwoord
            // Voeg ook tegoed toe aan het account van de klant zodat deze een aantal dingen kan kopen
            string pword = Reverse(uname);
            using (WinkelDatabaseModelContainer ctx = new WinkelDatabaseModelContainer())
            {
                var customers = from cust in ctx.Customers
                         where cust.username == uname
                         select cust;

                foreach (Customer p in customers)
                    return null;

                Customer c = new Customer { username = uname, password = pword, balance = 200 };
                ctx.Customers.Add(c);
                ctx.SaveChanges();
                return pword;
            }
        }

        public static string Reverse(string username)
        {
            char[] charArray = username.ToCharArray();
            Array.Reverse(charArray);

            return new string(charArray);
        }
       


    }
}
