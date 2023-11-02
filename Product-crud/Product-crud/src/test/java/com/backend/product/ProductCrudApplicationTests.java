/*
 * package com.backend.product;
 * 
 * import static org.junit.jupiter.api.Assertions.assertEquals;
 * 
 * import java.util.List;
 * 
 * import org.junit.jupiter.api.Test; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity;
 * 
 * import com.backend.product.controller.ProductController; import
 * com.backend.product.models.Product;
 * 
 * // id | description | name | price | units_in_stock | //
 * +----+-----------------------+----------+-------+----------------+ // | 2 |
 * end card | value | 124 | 24 |
 * 
 * @SpringBootTest class ProductCrudApplicationTests {
 * 
 * private ProductController productController = new ProductController();
 * 
 * public Product createProduct(int id,String name,String description,int
 * price,int unitsInStock) { Product product =new Product(); product.setId(id);
 * product.setName(name); product.setPrice(price);
 * product.setUnitsInStock(unitsInStock);
 * 
 * 
 * 
 * 
 * return product;
 * 
 * 
 * }
 * 
 * @Test public void testInsert() { Product product = createProduct(3,
 * "end cards", "value", 124, 24); ResponseEntity<?> response =
 * productController.insert(product); assertEquals(HttpStatus.CREATED,
 * response.getStatusCode()); }
 * 
 * @Test public void testGetProduct() { int id = 1617; ResponseEntity<?>
 * response = productController.getProduct(id); assertEquals(HttpStatus.OK,
 * response.getStatusCode()); }
 * 
 * @Test public void testGetProductNotFound() { int id = 53; ResponseEntity<?>
 * response = productController.getProduct(id);
 * assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode()); }
 * 
 * @Test public void testDelete() { int id = 53; ResponseEntity<?> response =
 * productController.delete(id); assertEquals(HttpStatus.OK,
 * response.getStatusCode()); }
 * 
 * @Test public void testUpdate() { Product product = createProduct(2, "value",
 * "end card", 124, 24); ResponseEntity<?> response =
 * productController.update(product); assertEquals(HttpStatus.OK,
 * response.getStatusCode()); }
 * 
 * @Test public void testUpdateNotFound() { Product product = createProduct(2,
 * "value", "end card", 124, 24); ResponseEntity<?> response =
 * productController.update(product); assertEquals(HttpStatus.NOT_FOUND,
 * response.getStatusCode()); }
 * 
 * @Test public void testAllProduct() { ResponseEntity<?> response =
 * productController.allProduct(); assertEquals(HttpStatus.OK,
 * response.getStatusCode()); }
 * 
 * @Test public void testSearchProducts() { String name = "medicine"; int
 * unitsInStock = 90; ResponseEntity<List<Product>> response =
 * productController.searchProducts(name, unitsInStock);
 * assertEquals(HttpStatus.OK, response.getStatusCode()); }
 * 
 * @Test public void testSearchProductsNotFound() { String name = "run"; int
 * unitsInStock = 3; ResponseEntity<List<Product>> response =
 * productController.searchProducts(name, unitsInStock);
 * assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode()); }
 * 
 * }
 */