declare
name varchar(20);
begin
select pdtname into name from products;
dbms_output.put_line('name : '|| name);
exception
when too_many_rows then
dbms_output.put_line('too many rows');
when others then
dbms_output.put_line('Error');
end;
/
