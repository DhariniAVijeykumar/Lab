CREATE OR REPLACE PACKAGE BODY pdt AS 
   PROCEDURE addPdt(p_id  products.pdtid%type, 
      p_name products.pdtname%type, 
      p_stock  products.stock%type,   
      p_price   products.price%type) 
   IS 
   BEGIN 
      INSERT INTO products (pdtid,pdtname,stock,price) 
         VALUES(p_id, p_name, p_stock, p_price); 
   END addPdt; 
   
  PROCEDURE find_price(p_id products.pdtid%TYPE) IS 
   p_price products.price%TYPE; 
   BEGIN 
      SELECT price INTO p_price
      FROM products
      WHERE pdtid = p_id; 
      dbms_output.put_line('Price: '|| p_price); 
   END find_price; 
END pdt; 
/