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
            return "Dikke fucking stront";
        }

        public string registreer(string username)
        {
            // Als de user niet bestaat, maak een nieuwe user aan met een gegenereerd wachtwoord
            string password = Reverse(username);

            return password;
        }

        public static string Reverse(string s)
        {
            char[] charArray = s.ToCharArray();
            Array.Reverse(charArray);
            return new string(charArray);
        }
    }
}
