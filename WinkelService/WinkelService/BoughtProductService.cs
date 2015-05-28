using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WinkelService
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "ProductService" in both code and config file together.
    public class BoughtProductService : IBoughtProductService
    {
        public List<BoughtProduct> getBoughtProducts(int customerId)
        {
            using (WinkelDatabaseModelContainer ctx = new WinkelDatabaseModelContainer())
            {
                List<BoughtProduct> allBoughtProducts = new List<BoughtProduct>();

                foreach (BoughtProduct boughtProduct in ctx.BoughtProducts.Where(product => product.CustomerId == customerId).ToList())
                {
                    allBoughtProducts.Add(boughtProduct);
                }

                // return all BoughtProducts where customerId = 1
                return allBoughtProducts;
            }
        }
    }
}
