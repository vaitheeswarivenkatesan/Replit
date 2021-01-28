lst=["jayanth",32,45,23,"vaithi",10,10,10,"geetha",17,34,56]
tot=0
c=0
name=None
for i in lst:
  if(c<3):
    if(type(i)==int):
      tot+=i
      c+=1
    if(type(i)==str):
      name=i
  else:
    print(name,tot,tot/3)
    tot=0
    name=i
    c=0
print(name,tot,tot/3)
  
