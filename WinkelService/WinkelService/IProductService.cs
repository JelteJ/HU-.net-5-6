using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WinkelService
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IProductService" in both code and config file together.
    [ServiceContract]
    public interface IProductService
    {
        [OperationContract]
        List<Product> getAllProducts();

        [OperationContract]
        void buyProduct(int productId);

        [OperationContract]
        void addProduct(string name, int stock, int price);

        [OperationContract]
        List<BoughtProduct> getBoughtProducts(int customerId);
    }
}
