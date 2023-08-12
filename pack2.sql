declare
p_id products.pdtid%type:=101;
begin
pdt.addPdt(90,'Apple','25kg','80/kg');
pdt.addPdt(91,'Orange','25kg','75/kg');
dbms_output.put_line('products added');
pdt.find_price(p_id);
end;
/