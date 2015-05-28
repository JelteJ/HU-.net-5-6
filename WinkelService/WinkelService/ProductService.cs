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

        public Product getProductById(int productId)
        {
            using (WinkelDatabaseModelContainer ctx = new WinkelDatabaseModelContainer())
            {
                // find product by id
                Product productObj = ctx.Products.Single(product => product.Id == productId);

                return productObj;
            }
        }

        private bool isAlreadyInStore(string name) 
        {
            using (WinkelDatabaseModelContainer ctx = new WinkelDatabaseModelContainer())
            {
                // check if product exists
                return ctx.Products.Any(product => product.name == name);
            }
        }

        private void createProduct(string name, int stock, int price)
        {
            using (WinkelDatabaseModelContainer ctx = new WinkelDatabaseModelContainer())
            {
                // create new Product Object
                Product nweProduct = new Product
                {
                    name = name,
                    stock = stock,
                    price = price
                };

                ctx.Products.Add(nweProduct);
                ctx.SaveChanges();
            }
        }

        public bool addProduct(string name, int stock, int price)
        {
            // check if product already in store
            if (!isAlreadyInStore(name))
            {
                // create new Product 
                createProduct(name, stock, price);

                return true;
            }
            return false;
        }
    }
}