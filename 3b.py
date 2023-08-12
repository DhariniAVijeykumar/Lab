d1={}
d2={}
print("Enter the keys and values of d1:")
for i in range(3):
    key=str(input("enter a key:"))
    value=str(input("enter a value:"))
    d1[key]=value
print("Enter the keys and values of d2:")
for i in range(3):
    key=str(input("enter a key:"))
    value=str(input("enter a value:"))
    d2[key]=value
print("The dictionary d1:")
print(d1)
print("The dictioonary d2: ")
print(d2)
s1=d1.values()
print("The set s1:")
print(set(s1))
s2=d2.values()
print("The set s2:")
print(set(s2))
a=list(s1)
b=list(s2)
s1=[]
s2=[]
s0={}
for i in range(len(a)):
    s1.append(ord(a[i]))
s1=set(s1)
print("The set1 after removing duplicates:")
print(s1)
for i in range(len(b)):
    s2.append(ord(b[i]))
s2=set(s2)
print("The set2 after removing duplicates:")
print(s2)
if(set(s1).issubset(set(s2))):
    print("yes.s1is a subset of s2.")
    print("The elements of superset are:")
    print(s1-s2)
else:
    s0=s1^s2;
    print("the symmetric difference of s1 and s2:")
    print(s0)
    