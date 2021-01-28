a=[1,[3,5,7],2,4,[6,8,10],9]
lst=[[],[]]
for i in a:
  if(type(i)==list):
    for j in i:
      if(j%2==0):
        lst[0].append(j)
      else:
        lst[1].append(j)    
  else:
    if(i%2==0):
      lst[0].append(i)
    else:
      lst[1].appendn(i)
print(lst)
