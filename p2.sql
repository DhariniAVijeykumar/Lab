DECLARE 
   p_id products.pdtid%TYPE:=102;
BEGIN 
   p_package.addProduct(106, 'apple', '10kg', '90/kg'); 
   p_package.addProduct(107, 'Orange', '13kg', '70/kg');
   dbms_output.put_line('products added');
   p_package.find_price(p_id); 
END; 
/ 