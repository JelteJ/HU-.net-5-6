using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WinkelService
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "ProductService" in both code and config file together.
    public class ProductService : IProductService
    {
        public List<Product> getAllProducts()
        {
            using (WinkelDatabaseModelContainer ctx = new WinkelDatabaseModelContainer())
            {
                List<Product> allProducts = new List<Product>();

                foreach(Product product in ctx.Products.Where(product => product.stock > 0).ToList()) {
                    allProducts.Add(product);
                }

               // return all products where stock > 0
                return allProducts;
            }
        }

        private Product getProduct(int productId)
        {
            using (WinkelDatabaseModelContainer ctx = new WinkelDatabaseModelContainer())
            {
                // find product by id
                Product productObj = ctx.Products.Single(product => product.Id == productId);

                return productObj;
            }
        }

        public bool isAlreadyInStore(string name) 
        {
            // get all products
            List<Product> allProducts = new List<Product> (getAllProducts());

            if (allProducts.Count > 0)
            {
                // check if name already exists in the store
                return allProducts.Any(product => product.name == name);
            }

            return false;
        }

        public void addProduct(string name, int stock, int price)
        {
            using (WinkelDatabaseModelContainer ctx = new WinkelDatabaseModelContainer())
            {
                if (!isAlreadyInStore(name))
                {
                    // create new Product Object
                    Product nweProduct = new Product { 
                        name = name, stock = stock, price = price 
                    };

                    ctx.Products.Add(nweProduct);
                    ctx.SaveChanges();
                }
            }
        }

        public void buyProduct(int productId, int amount, int customerId)
        {
            using (WinkelDatabaseModelContainer ctx = new WinkelDatabaseModelContainer())
            {
                // get product by id
                Product product = getProduct(productId);

                if (product != null) 
                {
                   // update 
                   

                    p1.Price = p1.Price * 1.08;
                    ctx.SaveChanges();

                }
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