declare 
id employee.empid%type:=200;
pname employee.name%type;
begin 
select name into pname from employee where empid=id;
dbms_output.put_line(pname);
exception
when no_data_found then
dbms_output.put_line('no such product');
end;
/