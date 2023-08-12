CREATE OR REPLACE PACKAGE pdt AS 
   
   PROCEDURE addPdt(p_id   products.pdtid%type, 
   p_name products.pdtname%type, 
   p_stock  products.stock%type, 
   p_price  products.price%type); 
   PROCEDURE find_price(p_id products.pdtid%type); 
  
END pdt; 
/