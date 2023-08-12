
DECLARE 
x number;
packed_pdt exception;
    
BEGIN 
   for x in (select * from products) loop
     if x.pdtid >=101 then
       raise packed_pdt;
     end if;
  end loop;
      
EXCEPTION 
   WHEN packed_pdt THEN 
      dbms_output.put_line('Packed Products'); 
   WHEN others THEN 
      dbms_output.put_line('Packless products');  
END; 
/

