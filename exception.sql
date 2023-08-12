declare
pid products.pdtid%type;
pname products.pdtname%type:='ice cream';
pstock products.stock%type;
pprice products.price%type;

begin
select pdtid,pdtname,stock,price into pid,pname,pstock,pprice
from products where pdtname=pname;
dbms_output.put_line('id : '|| pid);
dbms_output.put_line('name : '|| pname);
dbms_output.put_line('stock : '|| pstock);
dbms_output.put_line('price : '|| pprice);

exception
when no_data_found then
dbms_output.put_line('No such product');
when others then
dbms_output.put_line('Error');
end;
/

