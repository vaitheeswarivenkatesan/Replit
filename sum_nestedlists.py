a=[1,[3,5,7],2,4,[6,8,10],9]
tot=0
for i in a:
  if(type(i)==list):
    for j in i:
      tot=tot+1
  else:
    tot=tot+1
print(tot)
