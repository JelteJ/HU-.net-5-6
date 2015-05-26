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
    }
}
