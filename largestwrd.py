a=["curd","bonda","vada","dosa","idli"]
maxi=0
large=None
for  i in a:
  count=0
  for j in i:
    count+=1
  if(maxi<count):
    large=i
    maxi=count
print("the largest word is:",large)
