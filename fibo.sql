declare
n integer:=&n;
a integer:=1;
b integer:=1;
c integer;
begin
while n>a
loop
dbms_output.put_line(a);
c:=a+b;
a:=b;
b:=c;
end loop;
end;
/