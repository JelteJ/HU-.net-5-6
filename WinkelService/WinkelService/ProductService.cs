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
               // return all products where stock > 0
               return ctx.Products.Where(product => product.stock > 0).ToList();
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

        public void getSaldo()
        {

        }

        public List<Product> getBoughtProducts(Customer customerObj)
        {
            return null;
        }

        public void buyProduct()
        {
        }
    }
}
