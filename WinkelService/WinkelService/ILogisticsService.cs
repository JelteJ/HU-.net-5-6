using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WinkelService
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "ILoginService" in both code and config file together.
    [ServiceContract]
    public interface ILogisticsService
    {
        [OperationContract]
        List<BoughtProduct> getBoughtProductsByCustId(int customerId);

        [OperationContract]
        bool buyProduct(int productId, int amount, int customerId);

        [OperationContract]
        void updateStockByProdId(int productId, int amount);

        [OperationContract]
        void updateBalanceByCustId(int customerId, int productId, int amount);
    }
}
