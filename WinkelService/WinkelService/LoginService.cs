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
            if (username =="jaap" && password == "password123") {

                return "Success";
            }
            return "Inloggen niet gelukt";
        }

        public string register(string username)
        {
            // Als de user niet bestaat, maak een nieuwe user aan met een gegenereerd wachtwoord
            // Voeg ook tegoed toe aan het account van de klant zodat deze een aantal dingen kan kopen
            string password = Reverse(username);

            return password;
        }

        public static string Reverse(string username)
        {
            char[] charArray = username.ToCharArray();
            Array.Reverse(charArray);
            return new string(charArray);
        }
    }
}
