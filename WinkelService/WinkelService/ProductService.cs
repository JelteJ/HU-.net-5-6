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

                // get all products where stock is greater than 0
                foreach (Product product in ctx.Products.Where(product => product.stock > 0).ToList()) {
                    allProducts.Add(new Product {
                        Id = product.Id,
                        name = product.name,
                        stock = product.stock,
                        price = product.price
                    });
                }
                
                // return list of all products
                return allProducts;
            }
        }

        public Product getProductById(int productId)
        {
            using (WinkelDatabaseModelContainer ctx = new WinkelDatabaseModelContainer())
            {
                // find product by id
                var findProduct = ctx.Products.Single(product => product.Id == productId);

                // create new object
                Product productObj = new Product
                {
                    Id = findProduct.Id,
                    name = findProduct.name,
                    stock = findProduct.stock,
                    price = findProduct.price
                };
                
                // return product object
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

                // add and save
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