DECLARE 
x varchar(20);
p_mode exception; 
BEGIN 
   for x in (select * from pay) loop
     if x.pmode='upi' then
       dbms_output.put_line('UPI payment'); 
     else
       raise p_mode;
     end if;
  end loop;      
EXCEPTION 
   WHEN p_mode THEN 
      dbms_output.put_line('no such payment mode');  
END; 
/

