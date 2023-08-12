DECLARE 
x varchar(20);
p_date exception;
    
BEGIN 
   for x in (select * from pay) loop
     if x.pdate='05-02-2022' then
       dbms_output.put_line('paid with discount');
     else 
       raise p_date;
     end if;
  end loop;
      
EXCEPTION 
   WHEN p_date THEN 
      dbms_output.put_line('no discount');  
END; 
/
