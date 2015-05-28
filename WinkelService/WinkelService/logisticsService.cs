using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WinkelService
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "ProductService" in both code and config file together.
    public class LogisticsService : ILogisticsService
    {

        private bool isStockGreaterThanAmount(int productId, int amount)
        {
            using (WinkelDatabaseModelContainer ctx = new WinkelDatabaseModelContainer())
            {
                // check if there is a product with the same product id and where the stock is higher or same as amount
                return ctx.Products.Any(product => product.Id == productId && product.stock >= amount);
            }
        }

        private bool hashEnoughValue(int productId, int amount, int customerId)
        {
            using (WinkelDatabaseModelContainer ctx = new WinkelDatabaseModelContainer())
            {
                // get product
                Product productObj = ctx.Products.Single(product => product.Id == productId);   

                // get customer balance
                Customer customerObj = ctx.Customers.Single(customer => customer.Id == customerId);

                if ((amount * productObj.price) <= customerObj.balance)
                {
                    return true;
                }

                return false;
            }
        }

        private void updateStock(int productId, int amount)
        {
            using (WinkelDatabaseModelContainer ctx = new WinkelDatabaseModelContainer()) { 
                // update product stock 
                Product productToBuy = ctx.Products.Single(product => product.Id == productId);
                productToBuy.stock = productToBuy.stock - amount;
                ctx.SaveChanges();
            }
        }

        public bool buyProduct(int productId, int amount, int customerId)
        {
            // check stock 
            if (isStockGreaterThanAmount(productId, amount))
            {
                // check scustomer balance
                if (hashEnoughValue(productId, amount, customerId))
                {
                    // update product stock 
                    updateStock(productId, amount);

                    // add to BoughtProducts
                    addBoughtProduct(amount, customerId, productId);

                    return true;
                }
                return false;
            }
            return false;
        }

        private void addBoughtProduct(int amountBought, int customerId, int productId)
        {
            using (WinkelDatabaseModelContainer ctx = new WinkelDatabaseModelContainer())
            {
                // create new Product Object
                BoughtProduct nweBoughtProduct = new BoughtProduct
                {
                    amountBought = amountBought,
                    CustomerId = customerId,
                    dateBought = DateTime.Now,
                    ProductId = productId
                };

                ctx.BoughtProducts.Add(nweBoughtProduct);
                ctx.SaveChanges();
            }
        }

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