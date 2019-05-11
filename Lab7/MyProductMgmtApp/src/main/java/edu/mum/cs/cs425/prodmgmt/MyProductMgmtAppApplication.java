package edu.mum.cs.cs425.prodmgmt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.prodmgmt.dao.ProductRepository;
import edu.mum.cs.cs425.prodmgmt.model.Product;

@SpringBootApplication
public class MyProductMgmtAppApplication implements CommandLineRunner {
	 @Autowired
	    ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyProductMgmtAppApplication.class, args);
		
	}
		


		    void saveProduct(){
		        Product product = new Product();
		        product.setPid(1001L);
		        product.setName("iPhone XS Max");
		        product.setProductNumber(1);
		        product.setUnitPrice(1500.00);
		        product.setDateMfd(LocalDate.of(2018,10,24));

		        productRepository.save(product);
		        System.out.println( "Finishing ProductMgmtApp3... for Nicole's store" );
		        System.out.println( "********************************************************************************************************" );
		        System.out.printf( "Saved Product: { productId:%d, name:%s, unitPrice:%.2f, dateMfd:%s }\n",
		        		product.getPid(), product.getName(), product.getUnitPrice(), product.getDateMfd());
		        System.out.println( "********************************************************************************************************" );
		    }

		    @Override
		    public void run(String... args) throws Exception {
		        saveProduct();
		    
		    }
	}


