create or replace trigger lab
after update or insert or delete on products
for each row
declare
num number;
begin 
select count(pdtid) into num from products;
dbms_output.put_line('no of rows :'|| num);
end;
/